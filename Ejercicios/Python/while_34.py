#En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
# realizar un programa que lea los sueldos que cobra cada empleado e informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
# Además el programa deberá informar el importe que gasta la empresa en sueldos al personal.

#Definicion de vatiables.
sueldoMinimo, sueldoMaximo, numeroEmpleados, entradaSueldo, cnt300_500, gastoTotal, cnt = 100, 300, 0, 0, 0, 0, 0
#Logica de programa
numeroEmpleados = int(input("Ingrese el número de empleados: "))
while cnt < numeroEmpleados:
	entradaSueldo = float(input(f"Entre el sueldo del trabajador {cnt + 1}: "))
	if entradaSueldo >= 100 and entradaSueldo <= 500:
		gastoTotal += entradaSueldo
		if entradaSueldo >= 300:
			cnt300_500 += 1
		cnt += 1
	else:
		print("Entrada no valida, introduce un valor entre 100 y 500")
#Impresion resultados
print("============ Sueldos entre 100 y 300 =============")
print(f"Hay {abs(numeroEmpleados - cnt300_500)} sueldos en este rango.")
print("============ Sueldos mas de 300 =============")
print(f"Hay {cnt300_500} sueldos en este rango.")
print("============ Gasto Total =============")
print(f"El gasto total para la empresa es: {gastoTotal}")

