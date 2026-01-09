# Ejercicio (notion 61)

# Realizar la carga de dos nombres de personas distintos.
# Mostrar por pantalla luego ordenados en forma alfabética.

#Definición de variables
nombre_1 = input("Introduce el primer nombre: ")
nombre_2 = input("Introduce el segundo nombre: ")
print(f"Los nombres introducidos son:{nombre_1} y {nombre_2} ")
if nombre_1 < nombre_2:
	print(f"Los nombres ordenados: {nombre_1}, {nombre_2}")
else:
	print(f"Los nombres ordenados: {nombre_2}, {nombre_1}")
