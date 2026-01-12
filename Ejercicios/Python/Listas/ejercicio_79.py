#Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8 empleados (4 por la mañana y 4 por la tarde)
# Confeccionar un programa que permita almacenar los sueldos de los empleados agrupados en dos listas.
# Imprimir las dos listas de sueldos.
sueldosManiana, sueldosTarde= [],[]

#Logica
for cnt in range (4):
	sueldosManiana.append(float(input(f"El sueldo de la persona del turno de mañana {cnt + 1}: ")))
for cnt in range (4):
	sueldosTarde.append(float(input(f"El sueldo de la persona del turno de tarde {cnt + 1}: ")))

#Impresión Resultados
print("\n=== === === Sueldos turno Mañana === === ===")
print(sueldosManiana)
print("\n=== === === Sueldos turno Tarde === === ===")
print(sueldosTarde)

