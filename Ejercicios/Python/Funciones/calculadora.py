#Ejercicio de Calculadora con funciones
def menuCalculadora():
	operacion = 0
	while True:
		print("=== Calculadora ===")
		print("1.-Sumar\n2.-Restar\n3.-Multiplicar\n4.-Dividir\n5.-Salir")
		print("=== === === === ===")
		operacion = int(input("Elige una opción: "))
		if operacion >= 1 and operacion <= 5:
			return operacion
		else:
			print("=== === === === ===")
			print("No has cogido la opción correcta. Intentalo de nuevo.")
def entradaTeclado():
	numeros = [0, 0]
	numeros[0] = float(input("Introduce el primer valor: "))
	numeros[1] = float(input("Intoduce el segundo valor: "))
	return numeros
def sumaNumeros(x, y):
	return x + y
def restaNumeros(x, y):
	return x - y
def multiplicarNumeros(x, y):
	return x * y
def dividirNumeros (x, y):
	if y == 0:
		return 0
	return x / y

#Main
#Definicion variables
operacion = menuCalculadora()
operadores = []
descripcion = ""
resultado = 0
#Logica
while operacion != 5:
	if operacion == 5:
		print ("Saliendo.")
		break
	operadores = entradaTeclado()
	if operacion == 1:
		resultado = sumaNumeros(operadores[0], operadores[1])
		descripcion = "+"
	if operacion == 2:
		resultado = restaNumeros(operadores[0], operadores[1])
		descripcion = "-"
	if operacion == 3:
		resultado = multiplicarNumeros(operadores[0], operadores[1])
		descripcion = "*"
	if operacion == 4:
		resultado = dividirNumeros(operadores[0], operadores[1])
		descripcion = "/"
	print("=== Resultado ===")
	print(f"{operadores[0]} {descripcion} {operadores[1]} = {resultado}")
	print("=== === === === ===\n\n")
	operacion =  menuCalculadora()
