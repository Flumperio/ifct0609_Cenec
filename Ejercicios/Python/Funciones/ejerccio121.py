#Confeccionar una función que le enviemos como parámetros dos enteros y nos retorne el mayor.
def mensaje(mensaje):
    print(f"\n=== === === {mensaje} === === ===")

def valorMayor():
    if listaValores[0] > listaValores[1]:
        return listaValores[0]
    else:
        return listaValores[1]

def entradaDatos(numeroValores):
    for cntValores in range (numeroValores):
        listaValores.append(int(input(f"Introduce el valor {cntValores + 1}: ")))

#Main
#Definición variables
listaValores = []
valorMax = 0
#LogicaPrograma
mensaje("Número Mayor")
entradaDatos(2)
valorMax = valorMayor()
mensaje("Resultado")
print(f"El valor máximo es: {valorMax}")


