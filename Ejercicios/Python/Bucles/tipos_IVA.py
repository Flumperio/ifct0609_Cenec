# Ejercicio tipos de iva

# Me tiene que pedir un producto y un importe
# si el producto es: bebida, alimentación el iva es del 7%
# si el producto es: electrodoméstico, informática el iva es del 21%
# si el pruducto es: Curso de informática, Curso de cocina el iva es del 0%

# Resultado

# Su producto es de informática
# su importe 100
# el iva es 21%: 21
# el total rd: 121
#definición de variables
producto = input("Introduce el producto: ")
importe = float(input("introduce el importe: "))
ivaAplicado = 0
if producto == "bebida" or producto == "aliemntación":
	ivaAplicado = 7
if producto == "electrodoméstico" or producto == "informática":
	ivaAplicado = 21
importeTotal =  importe + (importe * ivaAplicado/100)

#impresión de datos.
print("----------------------------------------------------------------------")
print(f"Su producto es de {producto} \nCon un importe de {importe}")
print(f"el IVA a aplicar es: {ivaAplicado}\n El importe total es de: {importeTotal}")
print("----------------------------------------------------------------------")

