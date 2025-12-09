#Ejercicio 3 Avanzado
#quiero esto usando input:
# importe: 100
#descuento 10%: 10
#total importe=100-10
# iva: 21 sobre el total importe
# total a pagar: total importe+iva

#definición de variables e imput
importeProducto = float(input("Introduce el precio del producto: "))
descuento = int(input("Introduce el descuento del producto: "))
valorIVA = 21
importeDescuento = importeProducto - (importeProducto * (descuento / 100))
importeTotal = importeProducto + (importeDescuento * (valorIVA/100))

print("El valor del producto es de: ", importeProducto)
print("El descuento es de: ", descuento, "%")
print("El valor del producto después del descuento es:", importeDescuento)
print("El precio con IVA Total es de: ", importeTotal)

