opcion = True
operacion = ""
resultado = 0
print("Calculadora:")

while opcion:
	print("1.- Sumar, 2.- Restar, 3.- Multiplicar, 4.- Dividir, 5.- Salir")
	seleccion = int(input("Elige una opción: "))
	if seleccion > 0 and seleccion < 4:
		operador1 = float(input("Introduce el primer operador: "))
		operador2 = float(input("Introduce el segudo operador: "))
	else:
		print("Opción no valida.")
	if seleccion == 1:
		print("Has elegido sumar")
		resultado = operador1 + operador2
		operacion = "suma"
	elif seleccion == 2:
		print("Has elegido restar")
		resultado = operador1 - operador2
		operacion = "resta"
	elif seleccion == 3:
		print("Has elegido multiplicar")
		resultado = operador1 * operador2
		operacion = "resta"
	elif seleccion == 4:
		print("Has elegido dividir")
		resultado = operador1 / operador2
		operacion = "dividir"
	elif seleccion == 5:
		print ("Saliendo")
		opcion = False
	if opcion:
		print(f"La operación de {operacion} de {operador1} {operador2} es: {resultado}")
