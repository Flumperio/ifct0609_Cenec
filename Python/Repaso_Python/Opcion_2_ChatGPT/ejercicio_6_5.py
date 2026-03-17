"""Ejercicio 6
Añadir un contador que indique:
número total de libros
número medio de páginas"""

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
          "5.-Libros después 2000\n"
          "6.-Libro más páginas\n"
          "7.-Mostrar Autores\n"
          "8.-Contadores\n"
          "9.-Salir")
    print("=== === === === === === === === === ===")
    seleccion = int(input("Selecciona una opción: "))
    if 1 <= seleccion <= 9:
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
biblioteca = []
while True:
    seleccion = menuCRUD()
    if seleccion == 1:
        mostrarLibros(biblioteca)
    elif seleccion == 2:
        anadirLibro(biblioteca)
    elif seleccion == 3:
        eliminarLibro(biblioteca)
    elif seleccion == 4:
        buscarLibro(biblioteca)
    elif seleccion == 5:
        librosDespues2000(biblioteca)
    elif seleccion == 6:
        libroMasPaginas(biblioteca)
    elif seleccion == 7:
        mostrarAutores(biblioteca)
    elif seleccion == 8:
        mostrarContadores(biblioteca)
    elif seleccion == 9:
        print("¡Gracias por usar la biblioteca!")
        break


