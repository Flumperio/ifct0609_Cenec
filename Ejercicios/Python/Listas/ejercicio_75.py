#Definir una lista vacía y luego solicitar la carga de 5 enteros por teclado y añadirlos a la lista. Imprimir la lista generada.
#Definición de variables
listaNumeros = []
valorEntrada = 0
#Logica
for cnt in range (5):
	valorEntrada = int(input("Introduce valor entero: "))
	listaNumeros.append(valorEntrada)
#Impresión Resultados
print("\n=== === === Resultado === === ===")
print(f"Los valores introducidos son: {listaNumeros}")
