#Confeccionar una aplicación que muestre una presentación en pantalla del programa. Solicite la carga de dos valores y nos muestre la suma.
# Mostrar finalmente un mensaje de despedida del programa.
def mensaje(mensaje):
    print("\n=== === === === === === === === === === === ===")
    print(mensaje)
    print("=== === === === === === === === === === === ===\n")

def carga_suma():
    valor1=int(input("Ingrese el primer valor: "))
    valor2=int(input("Ingrese el segundo valor: "))
    suma=valor1+valor2
    print("La suma de los dos valores es:",suma)


# programa principal

mensaje("El programa calcula la suma de dos valores ingresados por teclado.")
carga_suma()
mensaje("Gracias por utilizar este programa")
