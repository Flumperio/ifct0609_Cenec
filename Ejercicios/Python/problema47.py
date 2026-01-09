#Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un triángulo. El programa deberá informar:
#a) De cada triángulo la medida de su base, su altura y su superficie.
#b) La cantidad de triángulos cuya superficie es mayor a 12.

#Defininión de variables.
numeroPares = 0
baseTriangulo = 0
alturaTriangulo = 0
superficieTriangulo = 0
cntSuperficie = 0
#Logica
numeroPares = int(input("Introduce el número de triangulos a calcular:"))
for cnt in range (numeroPares):
	baseTriangulo = int(input(f"Introduce la base del triangulo para el par {cnt + 1}: "))
	alturaTriangulo = int(input(f"Introduce la altura del triangulo para el par {cnt + 1}: "))
	superficieTriangulo = ((baseTriangulo * alturaTriangulo)/2)
	if superficieTriangulo > 12:
		cntSuperficie += 1
	print(f"El triangulo {cnt + 1} con base {baseTriangulo} y altura {alturaTriangulo} su superficie es: {superficieTriangulo}")
print(f"El total de triangulos cuya superficie es mayor de 12 es: {cntSuperficie}")
