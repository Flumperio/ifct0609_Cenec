#Definición de variables
operador1, operador2, cnt, operacion, resultado = 0, 0, 0, 0, 0

print("=== Calculadora ===")
print("1.-Sumar\n2.-Restar\n3.-Multiplicar\n4.-Dividir\n5.-Salir")
print("=== === === === ===")

while True:
    operacion = int(input("Introduce operación: "))

    if operacion == 5:
        print("Saliendo.")
        break

    if operacion >= 1 and operacion <= 4:
        operador1 = float(input("Introduce el primer operador: "))
        operador2 = float(input("Introduce el segundo operador: "))

        if operacion == 1:
            resultado = operador1 + operador2
            texto = "suma"
        elif operacion == 2:
            resultado = operador1 - operador2
            texto = "resta"
        elif operacion == 3:
            resultado = operador1 * operador2
            texto = "multiplicar"
        else:  # operacion == 4
            if operador2 != 0:
                resultado = operador1 / operador2
                texto = "dividir"
            else:
                print("Error: División por cero")
                continue

        print(f"{operador1} {texto} {operador2} = {resultado}")
    else:
        print("Operacion invalida")
