#Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos 5 valores ingresados.
#Definicion de variables
sumaValores = 0
entradaValor = 0
#Logica
for cnt in range (10):
	entradaValor = int(input(f"Introduce el valor {cnt + 1}: "))
	if cnt > 4:
		sumaValores = sumaValores + entradaValor
#Impresión resultado
print(f"La suma de los últimos 5 valores es: {sumaValores}")
