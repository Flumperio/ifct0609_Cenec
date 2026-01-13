#Serie Fibonacci
#∂wfinición de variables
entradaNumero = int(input("Entra un número para conocer su serie Fibonacci: "))
numero1 = 0
numero2 = 1
numero3 = 0
#calculo
for cnt in range (entradaNumero + 1):
	numero1 = numero2
	numero2 = numero3
	numero3 = numero1 + numero2
	print (numero3)
