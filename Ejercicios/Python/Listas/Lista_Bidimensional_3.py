sueldos=[["profesor", 2000], ["administrativo",1500], ["auxiliar", 1200], ["Becario",100]]
sumaSueldos, promedioSueldo = 0.0, 0.0
x, y = 0, 0
for lista in sueldos:
    for posicion in lista:
        print(f"posicion({x},{y})={posicion}")
        y += 1
    y = 0
    x += 1
sumaSueldos = sum(sueldo for cargo, sueldo in sueldos)
promedioSueldo = sumaSueldos / len(sueldos)

#posicion Fila, columna

print("\n=== === === Resultado === === ===")
for cargo, sueldo in sueldos:
    print(f"El sueldo de un {cargo} es {sueldo}.")
    print("=== === ===")
print(f"La suma de los sueldos es: {sumaSueldos}, con un promedio de {promedioSueldo}")
