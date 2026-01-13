#Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las personas.

numeroAlturas, promedioAlturas, valorIntroducido, cnt = 0, 0, 0, 0
#Logica
numeroAlturas = int(input("Introduce el numero de valores a introducir: "))
while cnt < numeroAlturas:
	valorIntroducido = float(input(f"Introduce el valor número {cnt + 1}: "))
	promedioAlturas += valorIntroducido
	cnt += 1
promedioAlturas = promedioAlturas / numeroAlturas
#Impresion resultados
print("----------------------------------------------------------------------")
print(f"El promedio de la altura es de: {promedioAlturas:.2f}")
print("----------------------------------------------------------------------")
