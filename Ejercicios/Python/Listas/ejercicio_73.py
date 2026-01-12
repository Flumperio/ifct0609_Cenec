#Definir una lista por asignación con 5 enteros. Mostrar por pantalla solo los elementos con valor iguales o superiores a 7.
#Definición variables.
listaNumeros = [100,5,3,43,17,8,92,0,6,4,2]
cnt = 0
#Logica e impresión.
while cnt < len(listaNumeros):
	if listaNumeros[cnt] >= 7:
		print (listaNumeros[cnt])
	cnt += 1
