#Escribir un programa que lea 10 números enteros y luego muestre cuántos valores ingresados fueron múltiplos de 3 y cuántos de 5.
# Debemos tener en cuenta que hay números que son múltiplos de 3 y de 5 a la vez.
#Definicion variables
cntMultiplo3 = 0
cntMultiplo5 = 0
entradaValor = 0
#Logica
for cnt in range (10):
	entradaValor = int(input("Introduce valor: "))
	if entradaValor % 3 == 0:
		cntMultiplo3 += 1
	if entradaValor % 5 == 0:
		cntMultiplo5 += 1
#impresion de resultados.
print("----------------------------------------------------------------------")
print (f"Hay {cntMultiplo3} multiplos de 3.\nHay {cntMultiplo5} multiplos de 5. ")
print("----------------------------------------------------------------------")
