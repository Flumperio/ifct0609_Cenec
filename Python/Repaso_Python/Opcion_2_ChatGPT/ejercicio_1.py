#Crear un programa que permita almacenar libros en una lista.
#Cada libro debe contener:
    #título
    #autor
    #año
    #número de páginas
#Ejercicio 1
    #Crear un menú que permita:
    #Añadir libro
    #Mostrar todos los libros
    #Buscar libro por título
    #Eliminar libro
    #Salir
    
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
        for libro in biblioteca:
            print(libro)

def anadirLibro(biblioteca):
    titulo = input("Introduce el título del libro: ")
    autor = input("Introduce el autor del libro: ")
    nuevo_libro = f"Título: {titulo}, Autor: {autor}"
    biblioteca.append(nuevo_libro)
    print("Libro añadido correctamente.")

def eliminarLibro(biblioteca):
    if len(biblioteca) == 0:
        print("No hay libros para eliminar.")
        return
    mostrarLibros(biblioteca)
    try:
        indice = int(input("Introduce el número del libro a eliminar (1, 2, 3...): ")) - 1
        if 0 <= indice < len(biblioteca):
            eliminado = biblioteca.pop(indice)
            print(f"Libro eliminado: {eliminado}")
        else:
            print("Índice no válido.")
    except ValueError:
        print("Debes introducir un número válido.")

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


