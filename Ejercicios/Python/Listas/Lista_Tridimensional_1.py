alumno=[["Carlos",["Matematicas",[8,7,6,7,9]],["Lengua",[5,6,4,5,5]]],["Alfonso",["Matematicas",[3,4,5,6,7]],["Lengua",[9,8,7,6,5]]]]

x, y, z= 0, 0, 0
for cntAlumno, cntMateria, cntNotas in alumno:
    for cntNotas in cntNotas:
        print(cntNotas)

#posicion Fila, columna
print(alumno)
