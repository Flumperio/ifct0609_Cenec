#Confeccionar una función que le enviemos como parámetro un string y nos retorne la cantidad de caracteres que tiene.
# En el bloque principal solicitar la carga de dos nombres por teclado y llamar a la función dos veces.
# Imprimir en el bloque principal cual de las dos palabras tiene más caracteres.
def mensaje(mensaje):
    print(f"\n=== === === {mensaje} === === ===")
def entradaDatos(numeroValores):
    for cntValores in range (numeroValores):
        listaValores.append(input(f"Introduce el valor {cntValores + 1}: "))
def contarCaracteres(valor):
    return len(valor)
#Main
#Definición variables
listaValores = []
lenValor1 = 0
lenValor2 = 0
#LogicaPrograma
mensaje("Mayor número de caracteres")
entradaDatos(2)
lenValor1 = contarCaracteres(listaValores[0])
lenValor2 = contarCaracteres(listaValores[1])
#Impresión de Resultados
mensaje("Resultado")
if lenValor1 == lenValor2:
    print("Las palabras tienen el mismo número de caracteres.")
else:
    print(f"La plabra con mayor número de caracteres es: ")
    if lenValor1 > lenValor2:
        print(listaValores[0])
    else:
        print(listaValores[1])


