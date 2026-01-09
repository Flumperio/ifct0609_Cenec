#Realizar un programa que lea los lados de n triángulos, e informar:
#a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
#b) Cantidad de triángulos de cada tipo.
#Definicion de variablea
lado1 = 0
lado2 = 0
lado3 = 0
numeroEquilatero = 0
numeroIsosceles = 0
numeroEscalenos = 0
#Logica
numeroTriangulos = int(input("Introduce el numero de triagulos a calcular: "))
for cnt in range (numeroTriangulos):
	lado1 = int(input(f"Del triangulo {cnt + 1} introduce el el valor del primer lado: "))
	lado2 = int(input(f"Del triangulo {cnt + 1} introduce el el valor del segundo lado: "))
	lado3 = int(input(f"Del triangulo {cnt + 1} introduce el el valor del tercer lado: "))
	if lado1 == lado2 and lado1 == lado3:
		numeroEquilatero += 1
	elif lado1 == lado2 or lado2 == lado3:
		numeroIsosceles += 1
	else:
		numeroEscalenos += 1
#Impresion resultados
print(f"El numero de triangunos Equilateros es: {numeroEquilatero}, el número de Isosceles es: {numeroIsosceles}, el número de escalenos es: {numeroEscalenos}")
