#Realizar la carga de valores enteros por teclado, almacenarlos en una lista. Finalizar la carga de enteros al ingresar el cero. Mostrar finalmente el tamaño de la lista.
listaNumeros = []
valorEntrada = 1
cnt = 0
#Logica
while valorEntrada != 0:
	valorEntrada = int(input("Introduce valor entero: (0 para salir): "))
	if valorEntrada != 0:
		listaNumeros.append(valorEntrada)
#Impresión Resultados
print("\n=== === === Resultado === === ===")
print(f"Los valores introducidos son: {listaNumeros}")
print(f"El tamaño de la lista es: {len(listaNumeros)}")
