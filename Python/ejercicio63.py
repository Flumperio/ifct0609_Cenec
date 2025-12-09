#Ejercicio63.py

### 1. **Variables en texto**

producto = "Auriculares"
precio = 29.95
print(f"El producto {producto} cuesta {precio}€") #Con la f antes del texto le decimos que es un texto con "formato"

### Dentro de las llaves se pueden realizar cálculos.
a = 5
b = 3
print(f"La suma de {a} + {b} es {a + b}")

### 3. **Formateo de decimales** con : heredamos de la clase superior .xxf es la cantidad de decimales que vamos a poner.

nota = 8.756
print(f"Tu nota es {nota:.1f}")   # Resultado: Tu nota es 8.8`:.1f` significa: muestra un decimal con formato flotante.