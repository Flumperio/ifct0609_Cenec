"""Refactorizar el código.
   Ejercicio 24
   Crear funciones para:
   pedir_titulo()
   pedir_autor()
   pedir_año()
   pedir_paginas()"""
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

    def agregar_libro(self, titulo, autor, anio, paginas, genero = None ):
        conexion = sqlite3.connect(self.db_path)
        cursor = conexion.cursor()
        cursor.execute("""
            INSERT INTO libros (titulo, autor, anio, paginas, genero)
            VALUES (?, ?, ?, ?, ?)
            """, (titulo, autor, int(anio), int(paginas), genero))
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

    def libros_por_genero(self, genero_buscar):
        conexion = sqlite3.connect(self.db_path)
        cursor = conexion.cursor()
        cursor.execute("""
                       SELECT * FROM libros WHERE genero LIKE ?
                       """, (f'%{genero_buscar}%',))
        libros = cursor.fetchall()
        conexion.close()

        if len(libros) == 0:
            print(f"No se encontraron libros del género '{genero_buscar}'.")
            return

        print(f"\nLibros del género '{genero_buscar}':")
        for libro_data in libros:
            libro = Libro(*libro_data)
            libro.mostrar_info()

    def libros_por_anio(self):
        conexion = sqlite3.connect(self.db_path)
        cursor = conexion.cursor()
        cursor.execute("""
                       SELECT * FROM libros ORDER BY anio ASC
                       """)
        libros = cursor.fetchall()
        conexion.close()

        if len(libros) == 0:
            print("No hay libros en la biblioteca.")
            return

        print("\nLibros ordenados por año (más antiguo → más reciente):")
        for libro_data in libros:
            libro = Libro(*libro_data)
            libro.mostrar_info()

    def libros_por_paginas(self):
        conexion = sqlite3.connect(self.db_path)
        cursor = conexion.cursor()
        cursor.execute("""
            SELECT * FROM libros ORDER BY paginas ASC
                       """)
        libros = cursor.fetchall()
        conexion.close()
        if len(libros) == 0:
            print("No hay libros en la biblioteca.")
            return
        print("\nLibros ordenados por páginas (menos → más páginas):")
        for libro_data in libros:
            libro = Libro(*libro_data)
            libro.mostrar_info()

    def top3_libros_paginas(self):
        conexion = sqlite3.connect(self.db_path)
        cursor = conexion.cursor()
        cursor.execute("""
            SELECT * FROM libros ORDER BY paginas DESC LIMIT 3
                        """)
        libros = cursor.fetchall()
        conexion.close()

        if len(libros) == 0:
            print("No hay libros en la biblioteca.")
            return

        print("\n🏆 TOP 3 LIBROS CON MÁS PÁGINAS 🏆")
        for i, libro_data in enumerate(libros, 1):
            libro = Libro(*libro_data)
            print(f"\n🥈 #{i} - ", end="")
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
          "6.-Libros por genero\n"
          "7.-Libros por año\n"
          "8.-Libros por paginas\n"
          "9.-TOP 3 Libros por paginas\n"
          "10.-Estadísticas\n"
          "11.-Guardar\n"
          "12.-Salir")
    print("=== === === === === === === === === ===")
    seleccion = int(input("Selecciona una opción: "))
    if 1 <= seleccion <= 12:
        return seleccion
    else:
        print("\n*******************************************")
        print("Selección incorrecta. Vuelve a intentarlo. ")
        print("*******************************************\n")
        menuCRUD()
        return None

def pedir_titulo():
    while True:
        titulo = input("Introduce el título del libro: ").strip()
        if titulo:  # ← Si NO está vacío
            return titulo
        print("❌ El título no puede estar vacío.")
def pedir_autor():
    while True:
        autor = input("Introduce el autor del libro: ").strip()
        if autor:  # ← Si NO está vacío
            return autor
        print("❌ El autor no puede estar vacío.")
def pedir_anio():
    while True:
        try:
            anio = int(input("Introduce el año del libro: "))
            if anio > 0:
                return anio
            else:
                print("❌ El año debe ser positivo.")
        except ValueError:
            print("❌ El año debe ser un número válido.")
def pedir_paginas():
    while True:
        try:
            paginas = int(input("Introduce el número de páginas: "))
            if paginas > 0:
                return paginas
            else:
                print("❌ Las páginas no pueden ser negativas o cero.")
        except ValueError:
            print("❌ Las páginas deben ser un número válido.")
def pedir_genero():
    return input("Introduce el género del libro: ").strip()
def menuInsertar(mi_biblioteca):
    print(f"\n=== === === Elije === === ===")
    titulo = pedir_titulo()
    autor = pedir_autor()
    anio = pedir_anio()
    paginas = pedir_paginas()
    genero = pedir_genero()
    mi_biblioteca.agregar_libro(titulo, autor, anio, paginas, genero)
    print("=== === === === === === === === === ===")
#Main
#Definición de variables
mi_biblioteca = Biblioteca()
while True:
    seleccion = menuCRUD()
    if seleccion == 1:
        mi_biblioteca.mostrar_libros()
    elif seleccion == 2:
        menuInsertar(mi_biblioteca)
    elif seleccion == 3:
        mi_biblioteca.eliminar_libro()
    elif seleccion == 4:
        busqueda = input("Introduce título o autor a buscar: ")
        mi_biblioteca.buscar_libro(busqueda)
    elif seleccion == 5:
        autor = input("Introduce el autor: ")
        mi_biblioteca.libros_por_autor(autor)
    elif seleccion == 6:
        genero = input("Introduce el género: ")
        mi_biblioteca.libros_por_genero(genero)
    elif seleccion == 7:
        mi_biblioteca.libros_por_anio()
    elif seleccion == 8:
        mi_biblioteca.libros_por_paginas()
    elif seleccion == 9:
        mi_biblioteca.top3_libros_paginas()
    elif seleccion == 10:
        mi_biblioteca.estadisticas()
    elif seleccion == 11:
        mi_biblioteca.guardar()
    elif seleccion == 12:
        print("¡Gracias por usar la biblioteca!")
        break


