"""Ejercicio 7
Crear una clase:
Biblioteca
que contenga:
lista de libros
y métodos:
agregar_libro()
mostrar_libros()
buscar_libro()
eliminar_libro()"""


class Biblioteca:
    def __init__(self):
        self.libros = []

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
          "5.-Salir")
    print("=== === === === === === === === === ===")
    seleccion = int(input("Selecciona una opción: "))
    if 1 <= seleccion <= 5:
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

def librosDespues2000(biblioteca):
    if len(biblioteca) == 0:
        print("No hay libros en la biblioteca.")
        return
    anio_busqueda = 2000
    encontrados = []
    for libro in biblioteca:
        if int(libro.anio) > anio_busqueda:
            encontrados.append(libro)
    if encontrados:
        print("\nLibros publicados después del 2000:")
        for i, libro in enumerate(encontrados, 1):
            print(f"\n--- Libro {i} ---")
            libro.mostrar_info()
    else:
        print("No hay libros publicados después del 2000.")

def libroMasPaginas(biblioteca):
    if len(biblioteca) == 0:
        print("No hay libros en la biblioteca.")
        return
    libro_max = biblioteca[0]
    for libro in biblioteca:
        if int(libro.paginas) > int(libro_max.paginas):
            libro_max = libro
    print("\n--- Libro con más páginas ---")
    libro_max.mostrar_info()

def mostrarAutores(biblioteca):
    if len(biblioteca) == 0:
        print("No hay libros en la biblioteca.")
        return
    autores = []
    for libro in biblioteca:
        if libro.autor not in autores:
            autores.append(libro.autor)
    print("\nAutores en la biblioteca:")
    for i, autor in enumerate(autores, 1):
        print(f"{i}. {autor}")
    print("-" * 30)


def mostrarContadores(biblioteca):
    if len(biblioteca) == 0:
        print("No hay libros en la biblioteca.")
        return

    total_libros = len(biblioteca)
    total_paginas = 0
    for libro in biblioteca:
        total_paginas += int(libro.paginas)

    media_paginas = total_paginas / total_libros if total_libros > 0 else 0

    print("\n--- CONTADORES ---")
    print(f"Total de libros: {total_libros}")
    print(f"Media de páginas: {media_paginas:.1f}")
    print("-" * 30)


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
        print("¡Gracias por usar la biblioteca!")
        break


