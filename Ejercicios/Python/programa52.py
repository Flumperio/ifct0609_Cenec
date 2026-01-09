#Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
#a) La cantidad de valores ingresados negativos.
#b) La cantidad de valores ingresados positivos.
#c) La cantidad de múltiplos de 15.
#d) El valor acumulado de los números ingresados que son pares.
valoresNegativos = 0
valoresPositivos = 0
valoresMul15 = 0
sumaPares = 0
for i in range(10):
    valor = int(input("Ingrese un valor entero: "))

    if valor < 0:
        valoresNegativos += 1
    elif valor > 0:
        valoresPositivos += 1

    if valor % 15 == 0:
        valoresMul15 += 1

    if valor % 2 == 0:
        sumaPares += valor

print(f"a) Valores negativos: {valoresNegativos}")
print(f"b) Valores positivos: {valoresPositivos}")
print(f"c) Múltiplos de 15: {valoresMul15}")
print(f"d) Suma de pares: {sumaPares}")

