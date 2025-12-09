"""Ejercicio60.py

Me pide unos ingresos por consola si es mayor de 1500 que me muestra por consola "ingresos medios"
si es menor "ingresos bajos"""

##Definimos e introducimos las variables
sueldoUsuario = float(input("Introduce tus ingresos"))
sueldoMedio = 1500
#Logica del programa
if sueldoMedio < sueldoUsuario:
    print("Tienes unos ingresos medios.")
else:
    print("Tienes unos ingresos bajos.")