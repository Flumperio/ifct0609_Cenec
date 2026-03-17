"""Ejercicio 14
Modificar el programa para que:
los libros se guarden en la base de datos."""
import sqlite3


class Libro:
    def __init__(self, id, titulo, autor, anio, paginas, genero=None, isbn=None):
        self.id = id
        self.titulo = titulo
        self.autor = autor
        self.anio = anio
        self.paginas = paginas
        self.genero = genero
        self.isbn = isbn

    def mostrar_info(self):
        print(f"\n--- Libro ID:{self.id} ---")
        print(f"Título: {self.titulo}")
        print(f"Autor: {self.autor}")
        print(f"Año: {self.anio}")
        print(f"Páginas: {self.paginas}")
        if self.genero:
            print(f"Género: {self.genero}")
        if self.isbn:
            print(f"ISBN: {self.isbn}")
        print("-" * 30)

class Biblioteca:
    def __init__(self, db_path="ficheros/biblioteca.db"):
        self.db_path = db_path
        self.crear_tabla()

    def crear_tabla(self):
        conexion = sqlite3.connect(self.db_path)
        cursor = conexion.cursor()
        cursor.execute("""
            CREATE TABLE IF NOT EXISTS libros (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                titulo TEXT NOT NULL,
                autor TEXT NOT NULL,
                anio INTEGER,
                paginas INTEGER)
            """)
        conexion.commit()
        conexion.close()

    def agregar_libro(self, titulo, autor, anio, paginas):
        conexion = sqlite3.connect(self.db_path)
        cursor = conexion.cursor()
        cursor.execute("""
            INSERT INTO libros (titulo, autor, anio, paginas)
            VALUES (?, ?, ?, ?)
            """, (titulo, autor, int(anio), int(paginas)))
        conexion.commit()
        conexion.close()
        print("Libro añadido correctamente a la base de datos.")

    def mostrar_libros(self):
        conexion = sqlite3.connect(self.db_path)
        cursor = conexion.cursor()
        cursor.execute("SELECT * FROM libros")
        libros = cursor.fetchall()
        conexion.close()

        if len(libros) == 0:
            print("No hay libros en la biblioteca.")
        else:
            for libro_data in libros:
                libro = Libro(*libro_data)
                libro.mostrar_info()

    def buscar_libro(self, texto):
        conexion = sqlite3.connect(self.db_path)
        cursor = conexion.cursor()
        cursor.execute("""
            SELECT * FROM libros WHERE titulo LIKE ? OR autor LIKE ?
            """, (f'%{texto}%', f'%{texto}%'))
        libros = cursor.fetchall()
        conexion.close()

        if len(libros) == 0:
            print("No se encontraron libros.")
            return

        print("\nLibros encontrados:")
        for libro_data in libros:
            libro = Libro(*libro_data)
            libro.mostrar_info()

    def eliminar_libro(self):
        self.mostrar_libros()
        try:
            id_libro = int(input("Introduce el ID del libro a eliminar: "))
            conexion = sqlite3.connect(self.db_path)
            cursor = conexion.cursor()
            cursor.execute("DELETE FROM libros WHERE id = ?", (id_libro,))
            if cursor.rowcount > 0:
                print(f"Libro con ID {id_libro} eliminado correctamente.")
            else:
                print("No se encontró el libro con ese ID.")
            conexion.commit()
            conexion.close()
        except ValueError:
            print("Debes introducir un ID válido.")

    def libros_por_autor(self, autor_buscar):
        conexion = sqlite3.connect(self.db_path)
        cursor = conexion.cursor()
        cursor.execute("""
            SELECT * FROM libros WHERE autor LIKE ?
            """, (f'%{autor_buscar}%',))
        libros = cursor.fetchall()
        conexion.close()

        if len(libros) == 0:
            print(f"No se encontraron libros de '{autor_buscar}'.")
            return

        print(f"\nLibros de '{autor_buscar}':")
        for libro_data in libros:
            libro = Libro(*libro_data)
            libro.mostrar_info()

    def estadisticas(self):
        conexion = sqlite3.connect(self.db_path)
        cursor = conexion.cursor()
        cursor.execute("SELECT COUNT(*) FROM libros")
        total_libros = cursor.fetchone()[0]

        if total_libros == 0:
            print("No hay libros en la biblioteca.")
            conexion.close()
            return

        cursor.execute("SELECT * FROM libros ORDER BY paginas DESC LIMIT 1")
        libro_max = Libro(*cursor.fetchone())

        cursor.execute("SELECT * FROM libros ORDER BY paginas ASC LIMIT 1")
        libro_min = Libro(*cursor.fetchone())

        conexion.close()

        print("\n--- ESTADÍSTICAS ---")
        print(f"Total de libros: {total_libros}")
        print(f"Libro más largo: {libro_max.titulo} ({libro_max.paginas} páginas)")
        print(f"Libro más corto: {libro_min.titulo} ({libro_min.paginas} páginas)")
        print("-" * 30)

def menuCRUD():
    print(f"\n=== === === Elije === === ===")
    print("1.-Mostrar Libros\n"
          "2.-Añadir Libro\n"
          "3.-Eliminar Libro\n"
          "4.-Buscar Libro\n"
          "5.-Libros por autor\n"
          "6.-Estadísticas\n"
          "7.-Guardar\n"
          "8.-Salir")
    print("=== === === === === === === === === ===")
    seleccion = int(input("Selecciona una opción: "))
    if 1 <= seleccion <= 7:
        return seleccion
    else:
        print("\n*******************************************")
        print("Selección incorrecta. Vuelve a intentarlo. ")
        print("*******************************************\n")
        menuCRUD()
        return None

def mostrarLibros(biblioteca):
    if len(biblioteca) == 0:
        print("No hay libros en la biblioteca.")
    else:
        for i, libro in enumerate(biblioteca, 1):
            print(f"\n--- Libro {i} ---")
            libro.mostrar_info()

def anadirLibro(biblioteca):
    titulo = input("Introduce el título del libro: ")
    autor = input("Introduce el autor del libro: ")
    anio = input("Introduce el año del libro: ")
    paginas = input("Introduce el número de páginas: ")

    nuevo_libro = Libro(titulo, autor, anio, paginas)
    biblioteca.append(nuevo_libro)
    print("Libro añadido correctamente.")

def eliminarLibro(biblioteca):
    if len(biblioteca) == 0:
        print("No hay libros para eliminar.")
        return
    mostrarLibros(biblioteca)
    indice = int(input("Introduce el número del libro a eliminar (1, 2, 3...): ")) - 1
    if 0 <= indice < len(biblioteca):
        eliminado = biblioteca.pop(indice)
        print(f"Libro eliminado: {eliminado.titulo} - {eliminado.autor}")
    else:
        print("Índice no válido.")

def buscarLibro(biblioteca):
    if len(biblioteca) == 0:
        print("No hay libros para buscar.")
        return
    busqueda = input("Introduce título o autor a buscar: ").lower()
    encontrados = []
    for libro in biblioteca:
        if (busqueda in libro.titulo.lower() or
            busqueda in libro.autor.lower()):
            encontrados.append(libro)
    if encontrados:
        print("\nLibros encontrados:")
        for i, libro in enumerate(encontrados, 1):
            print(f"\n--- Libro {i} ---")
            libro.mostrar_info()
    else:
        print("No se encontraron libros.")

        
#Main
#Definición de variables
mi_biblioteca = Biblioteca()
while True:
    seleccion = menuCRUD()
    if seleccion == 1:
        mi_biblioteca.mostrar_libros()
    elif seleccion == 2:
        titulo = input("Introduce el título del libro: ")
        autor = input("Introduce el autor del libro: ")
        anio = input("Introduce el año del libro: ")
        paginas = input("Introduce el número de páginas: ")
        mi_biblioteca.agregar_libro(titulo, autor, anio, paginas)
    elif seleccion == 3:
        mi_biblioteca.eliminar_libro()
    elif seleccion == 4:
        busqueda = input("Introduce título o autor a buscar: ")
        mi_biblioteca.buscar_libro(busqueda)
    elif seleccion == 5:
        autor = input("Introduce el autor: ")
        mi_biblioteca.libros_por_autor(autor)
    elif seleccion == 6:
        mi_biblioteca.estadisticas()
    elif seleccion == 7:
        mi_biblioteca.guardar()
    elif seleccion == 8:
        print("¡Gracias por usar la biblioteca!")
        break


