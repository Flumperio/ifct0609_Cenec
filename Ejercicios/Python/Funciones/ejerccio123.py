#Elaborar una función que reciba tres enteros y nos retorne el valor promedio de los mismos.
def mensaje(mensaje):
    print(f"\n=== === === {mensaje} === === ===")

def valorPromedio():
    cntInt = 0
    sumatorio = 0
    while cntInt < len(listaValores):
        sumatorio += listaValores[cntInt]
        cntInt += 1
    return sumatorio / cntInt

def entradaDatos(numeroValores):
    for cntValores in range (numeroValores):
        listaValores.append(int(input(f"Introduce el valor {cntValores + 1}: ")))

#Main
#Definición variables
listaValores = []
valorMedio = 0
#LogicaPrograma
mensaje("Valor Promedio")
entradaDatos(3)
valorMedio = valorPromedio()
mensaje("Resultado")
print(f"El valor promedio es: {valorMedio:.2f}")


