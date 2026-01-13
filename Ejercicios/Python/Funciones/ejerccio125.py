#Confeccionar una función que calcule la superficie de un rectángulo y la retorne, la función recibe como parámetros los valores de dos de sus lados:
# En el bloque principal del programa cargar los lados de dos rectángulos y luego mostrar cual de los dos tiene una superficie mayor.
def mensaje(mensaje):
    print(f"\n=== === === {mensaje} === === ===")

def superfRectangulo(lado1, lado2):
    return (lado1+lado2)*2

def entradaDatos(numeroValores):
    for cntValores in range (numeroValores):
        listaValores.append(float(input(f"Introduce el valor {cntValores + 1}: ")))

#Main
#Definición variables
listaValores = []
ladosRectangulo1 = []
ladosRectangulo2 = []

#LogicaPrograma
mensaje("Mayor perímetro de Rectangulo")
print("Introduce los valores de los lados del primer rectangulo: ")
entradaDatos(2)
ladosRectangulo1 = listaValores
superfR1 = superfRectangulo(ladosRectangulo1[0], ladosRectangulo1[1])
print("Introduce los valores de los lados del segundo rectangulo: ")
entradaDatos(2)
ladosRectangulo2 = listaValores
superfR2 = superfRectangulo(ladosRectangulo2[0], ladosRectangulo2[1])
#Impresión resultado
mensaje("Resultado")
print("El rectangulo de mayor superficie es:")
if superfR1 > superfR2:
    print("El primer rectángulo.")
else:
    print("El segundo rectángulo.")

