# Ejercicio (notion 60)

# Realizar la carga de enteros por teclado.
# Preguntar después que ingresa el valor si desea cargar otro valor debiendo el
# operador ingresar la cadena 'si' o 'no' por teclado.

# Mostrar la suma de los valores ingresados.

#Definiciaón de variables y entrada de datos
sumatorio = 0;
entrada_N1 = int(input("Introduce un valor: "))
sumatorio += entrada_N1
otroNumero = input("Deseas introducir otro valor (si/no): ")
if otroNumero == "si":
	entrada_N2 = int(input("Introduce un valor: "))
	sumatorio += entrada_N2
print("----------------------------------------------------------------------")
print(f"La suma de los valores introducidos es: {sumatorio}")
print("----------------------------------------------------------------------")
