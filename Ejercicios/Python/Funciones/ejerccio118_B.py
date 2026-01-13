#Desarrollar una funcion que reciba un string como parametro y nos muestre la cantidad de vocales.
# Llamarla desde el bloque principal del programa 3 veces con string distintos.
def mensaje(mensaje):
    print(f"\n=== === === {mensaje} === === ===")

def contarVocales(texto):
    cntVocales = 0
    cntTexto = texto.lower()
    for letra in cntTexto:
        if letra in "aeiou": #Busca los valores entre comilas de la condición, ahorramos multiples OR
            cntVocales += 1
    return cntVocales

#Main
#Definición variables
mensaje ("Contar Vocales")
valorEntrada = input("Introduce valor: ")
mensaje("Resultado")
print(f"El número de vocales de la cadena es: {contarVocales(valorEntrada)}.")
