"""1º Tiene que pedirme el importe y las unidades, usando el total resultante
Si el total es menor de 100, 0% descuento
			Entre 101 y 1000 5% descuento
			Entre 1001 y 2000 10% descuento
			>2000 20% descuento

Ejemplo:
Importe: 1000
Unidades: 1
Total: 1000
Descuento: 50
total a pagar: 950"""
#Definimos las variables.

importeUnidad = float(input("Introduce el importe de la mercancía: "))
numeroUnidades = int(input("Introduce el número de unidades: "))
precioBruto = importeUnidad * numeroUnidades
precioDescuento = precioBruto
porcentajeDescuento = 0
#Lógica del programa
if precioBruto >= 2000:
    porcentajeDescuento = 20
else:
    if precioBruto >= 1001:
        porcentajeDescuento = 10
    else:
        if precioBruto > 100:
            porcentajeDescuento = 5

precioDescuento = precioBruto - (precioBruto * (porcentajeDescuento/100))
print(f"El precio por unidad es de: {importeUnidad}. Con un numero de unidades de {numeroUnidades}, y un descuento del {porcentajeDescuento}, el precio total es de {precioDescuento}")



