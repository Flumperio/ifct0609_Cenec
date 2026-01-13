#Escribir un programa que solicite por teclado 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
#Definicón de variables
notaAlumno = 0
notaCorte = 7
cntSuperior = 0
#Logica
for cnt in range (10):
	notaAlumno = int(input("Entra la nota del alumno: "))
	if notaAlumno >= notaCorte:
		cntSuperior += 1
#impresion de resultados.
print("----------------------------------------------------------------------")
print (f"Hay {cntSuperior} notas iguales o superiores a 7 y {10 - cntSuperior} notas por debajo. ")
print("----------------------------------------------------------------------")
