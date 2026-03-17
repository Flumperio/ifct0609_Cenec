"""Ejercicio 2
Modificar el programa para que al mostrar libros se muestre:
Título: ....
Autor: ....
Año: ....
Páginas: ...."""
    
def menuCRUD():
    seleccion = 0
    print(f"\n=== === === Elije === === ===")
    print("1.-Mostrar Libros\n2.-Añadir Libro\n3.-Eliminiar Libro\n4.-Buscar Libro\n5.-Salir")
    print("=== === === === === === === === === ===")
    seleccion = int(input("Selecciona una opción: "))
    if seleccion >= 1 and seleccion <= 5:
        return seleccion
    else:
        print("\n*******************************************")
        print("Selección incorrecta. Vuelve a intentarlo. ")
        print("*******************************************\n")
        menuCRUD()

def mostrarLibros(biblioteca):
    if len(biblioteca) == 0:
        print("No hay libros en la biblioteca.")
    else:
        for i, libro in enumerate(biblioteca, 1):
            print(f"\n--- Libro {i} ---")
            print(f"Título: {libro['titulo']}")
            print(f"Autor: {libro['autor']}")
            print(f"Año: {libro['anio']}")
            print(f"Páginas: {libro['paginas']}")
            print("-" * 30)


def anadirLibro(biblioteca):
    titulo = input("Introduce el título del libro: ")
    autor = input("Introduce el autor del libro: ")
    anio = input("Introduce el año del libro: ")
    paginas = input("Introduce el número de páginas: ")

    nuevo_libro = {
        'titulo': titulo,
        'autor': autor,
        'anio': anio,
        'paginas': paginas
    }
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
        print(f"Libro eliminado: {eliminado['titulo']} - {eliminado['autor']}")
    else:
        print("Índice no válido.")

def buscarLibro(biblioteca):
    if len(biblioteca) == 0:
        print("No hay libros para buscar.")
        return
    busqueda = input("Introduce título o autor a buscar: ").lower()
    encontrados = []
    for libro in biblioteca:
        if busqueda in libro.lower():
            encontrados.append(libro)
    if encontrados:
        print("\nLibros encontrados:")
        for libro in encontrados:
            print(libro)
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
        print("¡Gracias por usar la biblioteca!")
        break


