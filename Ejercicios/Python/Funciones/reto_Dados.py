""" 1º RETO CON FUNCIONES:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

 Crear un juego que consiste en un juego de dados, usando funciones, aparecerá un juego con tres opciones,
 1: Juego de dados 2: juego de dados con apuesta  3: salir
 Se pedirá al usuario, el número de partidas a jugar y en el caso de la opción 2, el dinero que vas a apostar en cada partida
 Usaremos random tanto para el jugador como para la máquina, y tanto el la opción 1 como la 2, me tiene que decir el resultado del juego
 ejemplo:
 partidas ganadas por la máquina: 3
 Partidas ganadas por el jugador: 4
 En cada partida deberá aparecer tanto el dinero apostado, como el dinero ganado o perdido de la partida anterior.
1º Partida
El jugador ha apostado 100
el jugador ha ganado 100
total ganado/perdido 100

así con el resto de partidas"""
""" Importar libreria """
import random
def numeroAleatorio(rango):
	return random.randint(1, rango)

def jugada():
	jugador = numeroAleatorio(6)
	maquina = numeroAleatorio(6)
	print(f"Has sacado un: {jugador}")
	print(f"La máquina ha sacado: {maquina}")
	if jugador > maquina:
		return 1
	else:
		return 2

def menuInicio():
	seleccion = 0
	print(f"\n=== === === Juego de Dados === === ===")
	print("1.-Jugar sin Apuesta\n2.-Jugar con Apuesta\n3.-Salir")
	print("=== === === === === === === === === ===")
	seleccion = int(input("Selecciona una opción: "))
	if seleccion >= 1 and seleccion <= 3:
		return seleccion
	else:
		print("\n*******************************************")
		print("Selección incorrecta. Vuelve a intentarlo. ")
		print("*******************************************\n")
		menuInicio()

def partidaS(tipo, ganador, bolsa):
	if tipo == 2:
		apuesta = 0
		apuesta = float(input("Introduce la apuesta: "))
	print("* * * * * * * * * * *")
	print(" * * * * * * * * * * ")
	resultado = jugada()
	if resultado == 1:
		print("Ha ganado el Jugador.")
		ganador[0] += 1
		if tipo == 2:
			bolsa[0] += apuesta
			bolsa[1] -= apuesta
	else:
		print("Ha ganado la Máquina.")
		ganador[1] += 1
		if tipo == 2:
			bolsa[0] -= apuesta
			bolsa[1] += apuesta
	print(" * * * * * * * * * * ")
	print("* * * * * * * * * * *")

#Main
#Definición de variables.
# 1 - Jugador, 2 - Maquina
totalBolsa = [0, 0]
totalGanadas = [0, 0]
menu = 0
#Logica
while True:
	menu = menuInicio()
	if menu == 3: break
	if menu == 1: partidaS(1, totalGanadas, totalBolsa)
	if menu == 2 :partidaS(2, totalGanadas, totalBolsa)
#Impresión Resultados:
print(f"\n=== === === Resultados === === ===")
print(f"Se han jugado {totalGanadas[0] + totalGanadas[1]} partidas:\nEl jugador ha ganado: {totalGanadas[0]} y {totalBolsa[0]}$.\nLa máquina ha ganado: {totalGanadas[1]} y {totalBolsa[1]}$")
print("=== === === === === === === === === ===")

