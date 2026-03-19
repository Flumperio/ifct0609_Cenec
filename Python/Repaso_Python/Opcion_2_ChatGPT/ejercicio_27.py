"""Ejercicio 27
Modificar el método que añade libros para que
no permita añadir dos libros con el mismo ISBN."""
import sqlite3
from biblioteca import Biblioteca

def menuCRUD():
    print(f"\n=== === === Elije === === ===")
    print("1.-Mostrar Libros\n"
          "2.-Añadir Libro\n"
          "3.-Eliminar Libro\n"
          "4.-Buscar Libro\n"
          "5.-Buscar Libro por ISBN\n"
          "6.-Libros por autor\n"
          "7.-Libros por genero\n"
          "8.-Libros por año\n"
          "9.-Libros por paginas\n"
          "10.-TOP 3 Libros por paginas\n"
          "11.-Estadísticas\n"
          "12.-Guardar\n"
          "13.-Salir")
    print("=== === === === === === === === === ===")
    seleccion = int(input("Selecciona una opción: "))
    if 1 <= seleccion <= 13:
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
def pedir_isbn():
    while True:
        isbn = input("Introduce el ISBN del libro: ").strip()
        if isbn:
            return isbn
        print("❌ El ISBN no puede estar vacío.")
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
    isbn = pedir_isbn()
    anio = pedir_anio()
    paginas = pedir_paginas()
    genero = pedir_genero()
    mi_biblioteca.agregar_libro(titulo, autor, anio, paginas, genero, isbn)
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
        busqueda_ISBN = input("Introduce ISBN a buscar: ")
        mi_biblioteca.buscar_por_isbn(busqueda_ISBN)
    elif seleccion == 6:
        autor = input("Introduce el autor: ")
        mi_biblioteca.libros_por_autor(autor)
    elif seleccion == 7:
        genero = input("Introduce el género: ")
        mi_biblioteca.libros_por_genero(genero)
    elif seleccion == 8:
        mi_biblioteca.libros_por_anio()
    elif seleccion == 9:
        mi_biblioteca.libros_por_paginas()
    elif seleccion == 10:
        mi_biblioteca.top3_libros_paginas()
    elif seleccion == 11:
        mi_biblioteca.estadisticas()
    elif seleccion == 12:
        mi_biblioteca.guardar()
    elif seleccion == 13:
        print("¡Gracias por usar la biblioteca!")
        break


