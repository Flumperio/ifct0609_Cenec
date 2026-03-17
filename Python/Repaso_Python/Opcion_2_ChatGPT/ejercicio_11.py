"""Ejercicio 11
Al iniciar el programa deberá:
cargar automáticamente los libros del archivo."""


class Biblioteca:
    def __init__(self):
        self.libros = []
        self.cargar()

    def agregar_libro(self, titulo, autor, anio, paginas):
        nuevo_libro = Libro(titulo, autor, anio, paginas)
        self.libros.append(nuevo_libro)
        print("Libro añadido correctamente.")

    def mostrar_libros(self):
        if len(self.libros) == 0:
            print("No hay libros en la biblioteca.")
        else:
            for i, libro in enumerate(self.libros, 1):
                print(f"\n--- Libro {i} ---")
                libro.mostrar_info()

    def buscar_libro(self, texto):
        if len(self.libros) == 0:
            print("No hay libros para buscar.")
            return
        busqueda = texto.lower()
        encontrados = []
        for libro in self.libros:
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

    def eliminar_libro(self):
        if len(self.libros) == 0:
            print("No hay libros para eliminar.")
            return
        self.mostrar_libros()
        indice = int(input("Introduce el número del libro a eliminar (1, 2, 3...): ")) - 1
        if 0 <= indice < len(self.libros):
            eliminado = self.libros.pop(indice)
            print(f"Libro eliminado: {eliminado.titulo} - {eliminado.autor}")
        else:
            print("Índice no válido.")

    def libros_por_autor(self, autor_buscar):
        if len(self.libros) == 0:
            print("No hay libros en la biblioteca.")
            return

        encontrados = []
        for libro in self.libros:
            if autor_buscar.lower() in libro.autor.lower():
                encontrados.append(libro)

        if encontrados:
            print(f"\nLibros de '{autor_buscar}':")
            for i, libro in enumerate(encontrados, 1):
                print(f"\n--- Libro {i} ---")
                libro.mostrar_info()
        else:
            print(f"No se encontraron libros de '{autor_buscar}'.")

    def estadisticas(self):
        if len(self.libros) == 0:
            print("No hay libros en la biblioteca.")
            return

        total_libros = len(self.libros)

        # Encontrar libro más largo y más corto
        libro_max = self.libros[0]
        libro_min = self.libros[0]

        for libro in self.libros:
            if int(libro.paginas) > int(libro_max.paginas):
                libro_max = libro
            if int(libro.paginas) < int(libro_min.paginas):
                libro_min = libro

        print("\n--- ESTADÍSTICAS ---")
        print(f"Total de libros: {total_libros}")
        print(f"Libro más largo: {libro_max.titulo} ({libro_max.paginas} páginas)")
        print(f"Libro más corto: {libro_min.titulo} ({libro_min.paginas} páginas)")
        print("-" * 30)

    def guardar(self):
        try:
            with open("ficheros/biblioteca.txt", "w", encoding="utf-8") as archivo:
                for i, libro in enumerate(self.libros, 1):
                    archivo.write(f"Libro {i}:\n")
                    archivo.write(f"Título: {libro.titulo}\n")
                    archivo.write(f"Autor: {libro.autor}\n")
                    archivo.write(f"Año: {libro.anio}\n")
                    archivo.write(f"Páginas: {libro.paginas}\n")
                    archivo.write("-" * 30 + "\n")
            print("Biblioteca guardada en ficheros/biblioteca.txt")
        except FileNotFoundError:
            print("Error: No se encontró el directorio 'ficheros'.")
        except Exception as e:
            print(f"Error al guardar: {e}")

    def cargar(self):
        try:
            with open("ficheros/biblioteca.txt", "r", encoding="utf-8") as archivo:
                lineas = archivo.readlines()
            i = 0
            while i < len(lineas):
                if "Libro" in lineas[i] and ":" in lineas[i]:
                    # Leer título
                    i += 1
                    if i < len(lineas) and lineas[i].startswith("Título:"):
                        titulo = lineas[i].replace("Título: ", "").strip()
                    # Leer autor
                    i += 1
                    if i < len(lineas) and lineas[i].startswith("Autor:"):
                        autor = lineas[i].replace("Autor: ", "").strip()
                    # Leer año
                    i += 1
                    if i < len(lineas) and lineas[i].startswith("Año:"):
                        anio = lineas[i].replace("Año: ", "").strip()
                    # Leer páginas
                    i += 1
                    if i < len(lineas) and lineas[i].startswith("Páginas:"):
                        paginas = lineas[i].replace("Páginas: ", "").strip()
                    # Crear y añadir libro
                    if titulo and autor and anio and paginas:
                        libro = Libro(titulo, autor, anio, paginas)
                        self.libros.append(libro)
                i += 1
            print(f"Se cargaron {len(self.libros)} libros desde ficheros/biblioteca.txt")
        except FileNotFoundError:
            print("No existe archivo biblioteca.txt. Se inicia biblioteca vacía.")
        except Exception as e:
            print(f"Error al cargar: {e}")
#Clase libro
class Libro:
    def __init__(self, titulo, autor, anio, paginas):
        self.titulo = titulo
        self.autor = autor
        self.anio = anio
        self.paginas = paginas

    def mostrar_info(self):
        print(f"\n--- Libro ---")
        print(f"Título: {self.titulo}")
        print(f"Autor: {self.autor}")
        print(f"Año: {self.anio}")
        print(f"Páginas: {self.paginas}")
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


