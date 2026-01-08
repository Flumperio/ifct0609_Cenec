#Ejercicio59.py
#Me pide por consola una nota, y la condición va a ser que
#si la nota es igual o mayor que cinco, me aparezca por consola "aprobado"
#y sino que me muestre por consola "Suspenso"

notaAlumno = float(input("Introduce tu nota: "))
if notaAlumno >= 5:
    if notaAlumno > 8:
        print(f"Has aprobado con muy buena nota. {notaAlumno}")
    else:
        print(f"Has aprobado sobradamente. {notaAlumno}")
else:
    if notaAlumno <= 2:
        print(f"Con una nota de: {notaAlumno}. Has suspendido.")
    else:
        print(f"Con esta nota de: {notaAlumno}, mejor dedicate a otra cosa.")
