#Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
# Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante.
# Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.
#Definición de varialbves
cant1 = 0
cant2 = 0
cant3 = 0
cant4 = 0
numeroPuntos = 0
numeroPutos = int(input("Cantidad de puntos a procesar: "))

for i in range(numeroPuntos):
    x = float(input("Coordenada x: "))
    y = float(input("Coordenada y: "))

    if x > 0 and y > 0:
        cant1 += 1
    elif x < 0 and y > 0:
        cant2 += 1
    elif x < 0 and y < 0:
        cant3 += 1
    elif x > 0 and y < 0:
        cant4 += 1

print(f"Primer cuadrante: {cant1}")
print(f"Segundo cuadrante: {cant2}")
print(f"Tercer cuadrante: {cant3}")
print(f"Cuarto cuadrante: {cant4}")
