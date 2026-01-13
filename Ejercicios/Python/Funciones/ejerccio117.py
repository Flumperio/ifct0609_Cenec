#Confeccionar una función que reciba tres enteros y nos muestre el mayor de ellos. La carga de los valores hacerlo por teclado.
def mensaje(mensaje):
    print("\n=== === === === === === === === === === === ===")
    print(mensaje)
    print("=== === === === === === === === === === === ===\n")

def mostrar_mayor(v1,v2,v3):
    mayor = 0
    if v1 > v2 and v1 > v3:
        mayor = v1
    else:
        if v2 > v3:
            mayor = v2
        else:
            mayor = v3
    print("El valor mayor de los tres numeros es: ", mayor)


def cargar():
    valor1=int(input("Ingrese el primer valor:"))
    valor2=int(input("Ingrese el segundo valor:"))
    valor3=int(input("Ingrese el tercer valor:"))
    mostrar_mayor(valor1,valor2,valor3)


# programa principal
mensaje("El mayor de tres números")
cargar()
mensaje("")

