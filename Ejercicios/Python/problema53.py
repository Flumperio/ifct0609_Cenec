#Se cuenta con la siguiente información:Las edades de 5 estudiantes del turno mañana.
#Las edades de 6 estudiantes del turno tarde.Las edades de 11 estudiantes del turno noche.Las edades de cada estudiante deben ingresarse por teclado.
#a) Obtener el promedio de las edades de cada turno (tres promedios)
#b) Imprimir dichos promedios (promedio de cada turno)
#c) Mostrar por pantalla un mensaje que indique cual de los tres turnos tiene un promedio de edades mayor.
# Inicializar acumuladores y contadores
sumaManana = 0
sumaTarde = 0
sumaNoche = 0

# Turno mañana (5 estudiantes)
print("=== TURNO MAÑANA ===")
for cnt in range(5):
    edad = int(input(f"Edad estudiante {cnt + 1}: "))
    sumaManana += edad

# Turno tarde (6 estudiantes)
print("=== TURNO TARDE ===")
for cnt in range(6):
    edad = int(input(f"Edad estudiante {cnt + 1}: "))
    sumaTarde += edad

# Turno noche (11 estudiantes)
print("=== TURNO NOCHE ===")
for cnt in range(11):
    edad = int(input(f"Edad estudiante {cnt + 1}: "))
    sumaNoche += edad

# Calcular promedios
promManana = sumaManana / 5
promTarde = sumaTarde / 6
promNoche = sumaNoche / 11

# a) y b) Mostrar promedios
print("\n=== PROMEDIOS ===")
print(f"a) Promedio mañana: {promManana:.1f} años")
print(f"b) Promedio tarde: {promTarde:.1f} años")
print(f"c) Promedio noche: {promNoche:.1f} años")

# c) Turno con mayor promedio
if promManana > promTarde and promManana > promNoche:
    print("El turno mañana tiene el promedio de edades mayor.")
elif promTarde > promNoche:
    print("El turno tarde tiene el promedio de edades mayor.")
else:
    print("El turno noche tiene el promedio de edades mayor.")
