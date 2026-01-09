#2º Ahora vamos a hacer el siguiente cambio, añadimos las unidades y descripción, ambos que
#me lo pida por consola:

#resultado:

#Camisas
#unidades: 2
#el importe es 100
#total: 200
#el iva es 42
#el total a pagar es 242

#definición de variables e imput
nombreProducto = input("Nombre de producto: ")
cantidadProducto = int(input(f"Introduce la cantidad de {nombreProducto} adquiridas: " ))
importeProducto = float(input("Introduce el precio del producto: "))
valorIVA = int(input("Introduce el IVA a aplicar: "))
importeTotal = (importeProducto * cantidadProducto)
#Impresion de resultados
print("----------------------------------------------------------------------")
print(f"Has comprado {cantidadProducto} unidades de {nombreProducto}.")
print("El importe total es de: ", importeTotal)
print("El precio con IVA Total es de: ", importeTotal + (importeTotal * (valorIVA/100)))
print("----------------------------------------------------------------------")

