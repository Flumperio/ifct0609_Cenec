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
descuento = int(input("Introduce el descuento del producto: "))
valorIVA = int(input("Introduce el IVA a aplicar: "))
importeDescuento = (importeProducto - (importeProducto * (descuento / 100))) * cantidadProducto
importeTotal = (importeProducto * cantidadProducto) + (importeDescuento * (valorIVA/100))
#Impresion de resultados
print("----------------------------------------------------------------------")
print(f"Has comprado {cantidadProducto} unidades de {nombreProducto}.")
print("El valor del producto es de: ", importeProducto)
print("El descuento es de: ", descuento, "%")
print("El precio total de la compra es:", importeDescuento)
print("El precio con IVA Total es de: ", importeTotal)
print("----------------------------------------------------------------------")

