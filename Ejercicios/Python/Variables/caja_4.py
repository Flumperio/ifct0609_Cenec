#4º Para matrícula, vamos a añadir, que el usuario ponga el dinero al contado que va a entregar
#con lo cual, usaremos un input, y que el programa diga el dinero a devolver.

#Entrega: 300
#a devolver: 58

#Declaración de variables y entrada de datos.
nombreProducto = input("Nombre de producto: ")
cantidadProducto = int(input(f"Introduce las unidades de {nombreProducto} adquiridas: " ))
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
importeRecibido = float(input("Entrega de dinero: "))
importeDevolver = importeRecibido - importeTotal
print(f"El importe a devolver es de: {importeDevolver:.2f}")



