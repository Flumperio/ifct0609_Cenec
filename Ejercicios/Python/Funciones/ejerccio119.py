#Confeccionar una función que reciba tres enteros y los muestre ordenados de menor a mayor.
# En otra función solicitar la carga de 3 enteros por teclado y proceder a llamar a la primer función definida.
def mensaje(mensaje):
    print(f"\n=== === === {mensaje} === === ===")

def ordenarEnteros():
    if listaNumeros[0] > listaNumeros[1]:
        listaNumeros[0], listaNumeros[1] = listaNumeros[1], listaNumeros[0]
    if listaNumeros[0] > listaNumeros[2]:
        listaNumeros[0], listaNumeros[2] = listaNumeros[2], listaNumeros[0]
    if listaNumeros[1] > listaNumeros[2]:
        listaNumeros[1], listaNumeros[2] = listaNumeros[2], listaNumeros[1]

def entradaDatos():
    listaNumeros.append(int(input("Introduce el primer valor: ")))
    listaNumeros.append(int(input("Introduce el segundo valor: ")))
    listaNumeros.append(int(input("Introduce el tercer valor: ")))




#Main
#Definición variables
listaNumeros = []

#LogicaPrograma
mensaje("Ordenar Valores")
entradaDatos()
ordenarEnteros()
mensaje("Resultado")
print(listaNumeros)


