#Definir por asignación una lista con 8 elementos enteros. Contar cuantos de dichos valores almacenan un valor superior a 100.
#definición de Varialbes.
listaNumeros = [1000, 100, 2, 1400, 340, 3, 2000, 405, 4,999]
cnt, numerosMayo100 = 0, 0
#logica
while cnt < len(listaNumeros):
	if listaNumeros[cnt] > 100:
		numerosMayo100 += 1
	cnt += 1
#Impresión.
print("\n=== === === Resultado === === ===")
print("De la lista: ", listaNumeros)
print(f"Hay {numerosMayo100} números mayores de 100")
