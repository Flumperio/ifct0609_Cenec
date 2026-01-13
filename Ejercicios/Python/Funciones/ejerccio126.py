#Plantear una función que reciba un string en mayúsculas o minúsculas y retorne la cantidad de letras 'a' o 'A'.
def mensaje(mensaje):
    print(f"\n=== === === {mensaje} === === ===")

def contarAa(texto):
    cntLetras = 0
    for letra in texto:
        if letra in "aA":
            cntLetras += 1
    return cntLetras

def entradaDatos(numeroValores):
    for cntValores in range (numeroValores):
        listaValores.append(input(f"Introduce el valor {cntValores + 1}: "))

#Main
#Definición variables
listaValores = []
numeroLetras = 0

#LogicaPrograma
mensaje("Contrar letras A y a")
entradaDatos(1)
numeroLetras = contarAa(listaValores[0])

#Impresión resultado
mensaje("Resultado")
print(f"El número de letras a y A es: {numeroLetras}")

