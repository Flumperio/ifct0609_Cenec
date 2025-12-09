#Ejercicio59.py
#Me pide por consola una nota, y la condición va a ser que
#si la nota es igual o mayor que cinco, me aparezca por consola "aprobado"
#y sino que me muestre por consola "Suspenso"

notaAlumno = float(input("Introduce tu nota: "))
if notaAlumno >= 5:
    print(f"Con una nota de: {notaAlumno}. Has aprobado!!!")
else:
    print(f"Con una nota de: {notaAlumno}. Has suspendido.")
