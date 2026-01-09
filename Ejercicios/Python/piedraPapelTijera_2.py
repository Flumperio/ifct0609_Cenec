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
partidasGanadas, partidasPerdidas, partidadEmpate = 0, 0, 0
print("\033c", end="")
print("Quieres jugar a Piedra/Papel/Tijera?")
while True:
	jugar = int(input("\n1.-Jugar --- 2.-Salir: "))
	if jugar == 2:
		print("Saliendo.com")
		break
	if jugar == 1:
		entradaUsuario =  int(input("Introduce (1.- Piedra, 2.- Papel, 3.- Tijera): "))
		if entradaUsuario >= 1 and entradaUsuario <= 3:
			entradaMaquina = random.randint(1, 3)
			ganador = ""
			if entradaUsuario == entradaMaquina:
				print("Empate")
				partidadEmpate += 1
			else:
				if ((entradaUsuario == 1 and entradaMaquina == 3) or (entradaUsuario == 2 and entradaMaquina == 1) or (entradaUsuario == 3 and entradaMaquina == 2)):
					print("Ganas")
					partidasGanadas += 1
				else:
					print("Pierdes")
					partidasPerdidas += 1
			print(f"Elegiste: {entradaUsuario} la máquina eligió: {entradaMaquina}")
		else:
			print("Opcion Invalida")
	else:
		print("Opcion invalida")
print("\n=== === === Resultado === === ===")
print(f"Jugaste un total de {partidadEmpate+partidasGanadas+partidasPerdidas} partidas:\nGanaste: {partidasGanadas}\nPerdiste: {partidasPerdidas}\nEmpataste: {partidadEmpate}")
