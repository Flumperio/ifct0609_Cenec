#Elaborar una función que nos retorne el perímetro de un cuadrado pasando como parámetros el valor de un lado.
def mensaje(mensaje):
    print(f"\n=== === === {mensaje} === === ===")

def perimetroCuadrado():
    return listaValores[0] * 4

def entradaDatos(numeroValores):
    for cntValores in range (numeroValores):
        listaValores.append(float(input(f"Introduce el valor {cntValores + 1}: ")))

#Main
#Definición variables
listaValores = []
perimetro = 0
#LogicaPrograma
mensaje("Calculo perímetro cuadrado")
entradaDatos(1)
perimetro = perimetroCuadrado()
mensaje("Resultado")
print(f"El perimetro del cuadrado es: {perimetro:.2f}")


