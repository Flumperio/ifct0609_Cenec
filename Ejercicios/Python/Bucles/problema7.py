#Codificar un programa que lea n números enteros y calcule la cantidad de valores mayores o iguales a 1000 (n se carga por teclado)
# Este tipo de problemas también se puede resolver empleando la estructura repetitiva for.
#Lo primero que se hace es cargar una variable que indique la cantidad de valores a ingresar.
# Dicha variable se carga antes de entrar a la estructura repetitiva for.
#Definición de variables
numeroValores = int(input("Introduce la cantidad de valores a introducir: "))
valorMaximo = 1000
valorIntroducido = 0
cntValores = 0
#Logica
for cnt in range(numeroValores):
	valorIntroducido = int(input(f"Introduce el valor número {cnt}: "))
	if valorIntroducido >= valorMaximo:
		cntValores += 1
#Impresion Resultados
print(f"De un total de {numeroValores} valores, hay {cntValores} superiores a {valorMaximo} ")
