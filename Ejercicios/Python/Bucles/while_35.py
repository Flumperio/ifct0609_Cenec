#Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado)

#Definicion de vatiables.
valorMaximo = 25
valorSuma = 11
sumatorio = 11
cnt = 0
while cnt < valorMaximo:
	print (sumatorio)
	if sumatorio > 99:
		valorSuma = 112
	sumatorio += valorSuma
	cnt += 1
