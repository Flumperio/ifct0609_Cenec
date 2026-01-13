#Confeccionar una función que reciba tres enteros y los muestre ordenados de menor a mayor.
# En otra función solicitar la carga de 3 enteros por teclado y proceder a llamar a la primer función definida.
def mensaje(mensaje):
    print(f"\n=== === === {mensaje} === === ===")

def calculoSuperficie(ladoCuadrado):
    sup = ladoCuadrado * ladoCuadrado
    return sup

def entradaDatos(numeroValores):
    for cntValores in range (numeroValores):
        listaValores.append(int(input(f"Introduce el valor {cntValores + 1}: ")))

#Main
#Definición variables
listaValores = []
superficie = 0
#LogicaPrograma
mensaje("Calculo superficie Cuadrado")
entradaDatos(1)
superficie = calculoSuperficie(listaValores[0])
mensaje("Resultado")
print(f"La superficie de un cuadrado de {listaValores[0]} de lado es: {superficie}.")


