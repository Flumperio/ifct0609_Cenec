# Ejercicio
# Me pide tres numeros y me tiene que decir el programa cual de los tres numeros, es el mayor

# Resultado
# numero1: 10
# numero2: 4
# numero3: 7

# el numero mayor es 10

#Definicinón de variables y entrada de datos.

entradaNumero1 = int(input("Introduce el número 1: "))
numeroMayor = entradaNumero1
entradaNumero2 =  int(input("Introduce el número 2: "))
if numeroMayor < entradaNumero2:
	numeroMayor =  entradaNumero2
entradaNumero3 = int(input("Introduce el número 3: "))
if numeroMayor < entradaNumero3:
	numeroMayor = entradaNumero3
print(f"El número mayor introducido es: {numeroMayor}")
