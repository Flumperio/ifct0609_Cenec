"""Ejercicio62.py

Me pida por consola un dia de la semana, por ejemplo "lunes", el mensaje que tiene que aparecer
es que si es "==" a lunes
"""
#Defimimos variables e introducimos datos
diaSemana = (input("Introduce el día de la semana: ")).lower()
if diaSemana == "lunes":
    print("Hoy es Lunes. Mal día para dejar el tabaco.")
elif diaSemana == "martes":
    print("Hoy es Martes. Mal día para dejar el alcohol.")
elif diaSemana == "miercoles":
    print("Hoy es Miércoles. Mal día para dejar la mayonesa.")
elif diaSemana == "jueves":
    print("Hoy es Jueves. Mal día para dejar los chicharrones.")
elif diaSemana == "viernes":
    print("Hoy es Viernes. Mal día para dejar los zumos.")
elif diaSemana == "sabado":
    print("Hoy es Sábado. Mal día para dejar los espetos.")
elif diaSemana == "domingo":
    print("Hoy es Domingo. Mal día para dejar cualquier cosa.")
else:
    print("Eso no es un día de la semana")