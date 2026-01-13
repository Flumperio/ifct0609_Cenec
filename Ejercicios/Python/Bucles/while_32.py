#Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
#Definición de variables
valorNotas, cntMayor7, cntMenor7, numeroAlumnos, cnt = 0, 0, 0, 10, 0
#Logica
while cnt < numeroAlumnos:
	valorNotas = float(input(f"Introduce la nota del alumno {cnt + 1}: "))
	if valorNotas >= 7:
		cntMayor7 += 1
	cnt += 1
cntMenor7 = numeroAlumnos - cntMayor7
#Impresion resultados
print("----------------------------------------------------------------------")
print(f"El número de notas mayores o iguales a 7 es: {cntMayor7} y menores: {cntMenor7}")
print("----------------------------------------------------------------------")
