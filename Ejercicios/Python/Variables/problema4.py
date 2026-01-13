#Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre posteriormente la suma de los valores ingresados y su promedio.
# Este problema ya lo desarrollamos, lo resolveremos empleando la estructura for para repetir la carga de los diez valores por teclado.

#Definición de variables,
sumaValores = 0
promedioValores = 0
entradaValores = 0
#Logica
for cnt in range (10):
	entradaValores = int(input("Introduce un valor: "))
	sumaValores += entradaValores
promedioValores = sumaValores/10
print (f"La suma de los valores introducidos es: {sumaValores}. Y su promedio es: {promedioValores}")
