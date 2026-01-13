alumno=[["Carlos",["Matematicas",[8,7,6,7,9]],["Lengua",[5,6,4,5,5]]],["Alfonso",["Matematicas",[3,4,5,6,7]],["Lengua",[9,8,7,6,5]]]]

x, y, z= 0, 0, 0
for info_alumno in alumno:  # Nivel 1: cada alumno
    nombre = info_alumno[0]
    print(f"\n--- Notas de {nombre} ---")

    for materia_info in info_alumno[1:]:  # Nivel 2: cada materia
        nombre_materia = materia_info[0]
        notas = materia_info[1]  # Nivel 3: lista de notas (¡aquí se define!)

        print(f"{nombre_materia}: {notas}")

        for nota in notas:  # Ahora 'notas' existe en este ámbito
            print(f"  Nota: {nota}")
