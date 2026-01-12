#Almacenar en una lista los sueldos (valores float) de 5 operarios. Imprimir la lista y el promedio de sueldos.
listaSueldos = []
sumatorioSueldos, promedioSueldos = 0, 0
cnt = 0
#Logica
while cnt < 5:
	valorEntrada = float(input(f"Introduce el sueldo del operario {cnt + 1}: "))
	listaSueldos.append(valorEntrada)
	sumatorioSueldos += valorEntrada
	cnt += 1
promedioSueldos = sumatorioSueldos / (cnt)
#Impresión Resultados
print("\n=== === === Resultado === === ===")
print(f"Los valores introducidos son: {listaSueldos}")
print(f"El promedio de los sueldos es: {promedioSueldos}")
