#Hacer tabla de multiplicar
#definir Variables
operador = int(input("Introducir número para obtener la tabla de multiplicar: "))
for cnt in range (1,51):
	print(f"{operador} x {cnt} = {operador*cnt}")
