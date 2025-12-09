##Ejercicio 1
# quiero que me pida con un input un importe,
# me calcule el iva y me de el total(importe+iva)

#Definicion de variables y entrada
precioProducto = float(input("Introduce el precio del producto: "))
importeTotal = (precioProducto * 0.21)+precioProducto
#Impresión de resultados
print("El precio del producto es: ", importeTotal)