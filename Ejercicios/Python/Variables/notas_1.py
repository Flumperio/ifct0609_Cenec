#Ejercicio59.py
#Me pide por consola una nota, y la condición va a ser que
#si la nota es igual o mayor que cinco, me aparezca por consola "aprobado"
#y sino que me muestre por consola "Suspenso"

#Declaración de variables y entrada de datos.
notaAlumno = float(input("Introduce tu nota: "))
literalNota = "Sobresaliente"
#Control de errores
if notaAlumno < 0 or notaAlumno > 10:
    print("Nota no válida.")
else:
#Impresion de datos.
    if 0> notaAlumno <= 4.4:
        literalNota = "Suspenso"
    if 4.5>= notaAlumno <= 5.4:
        literalNota = "Aprobado"
    if 5.6>= notaAlumno <= 6.9:
        literalNota = "Bien"
    if 7> notaAlumno < 9:
        literalNota = "Notable"
    print("----------------------------------------------------------------------")
    print(f"Tienes una nota de {notaAlumno} que es un {literalNota}")
    print("----------------------------------------------------------------------")
