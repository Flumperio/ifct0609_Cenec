# Ejercicio piedra_papel_tijeras

# import random
# #random e input

# numero=random.randint(1, 3)

# Resultado:

# Usted ha elegido papel
# la máquina ha elegido piedra
# papel gana a la piedra, Usted ha ganado

#Librerias
import random
#Definicinición de variables.
entradaUsuario =  int(input("Introduce (1.- Piedra, 2.- Papel, 3.- Tijera): "))
entradaMaquina = random.randint(1, 3)
ganador = ""
if entradaUsuario == entradaMaquina:
	print("Empate")
else:
	if ((entradaUsuario == 1 and entradaMaquina == 3) or (entradaUsuario == 2 and entradaMaquina == 1) or (entradaUsuario == 3 and entradaMaquina == 2)):
		print("Ganas")
	else:
		print("Pierdes")
print(f"Elegiste: {entradaUsuario} la máquina eligió: {entradaMaquina}")
