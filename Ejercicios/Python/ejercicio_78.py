#Cargar por teclado y almacenar en una lista las alturas de 5 personas (valores float)
# Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio y cuántas más bajas.
listaAlturas = []
sumatorioAltura, promedioAltura = 0.0, 0.0
altosPromedio, bajoPromedio = 0, 0

#Logica
for cnt in range (5):
	listaAlturas.append(float(input(f"Introduce la altura de la persona {cnt + 1}: ")))
	sumatorioAltura += listaAlturas[cnt]
promedioAltura = sumatorioAltura / 5
#Impresión Resultados
print("\n=== === === Resultado === === ===")
for cnt in listaAlturas:
	if cnt > promedioAltura:
		altosPromedio += 1
	else:
		bajoPromedio += 1
print(f"EL promedio de altura es {promedioAltura:.2f}.\nHay {altosPromedio} personas más altas de la media y {bajoPromedio} personas por debajo.")

