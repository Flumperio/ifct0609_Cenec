capitales=[["España", "Madrid"], ["Italia", "Roma"]]
print("posicion 0,0 ", capitales[0][0])  # Imprime "España"
print("posicion 0,1 ", capitales[0][1])  # Imprime "Madrid"
print("posicion 1,0 ", capitales[1][0])  # Imprime "Italia"
print("posicion 1,1 ", capitales[1][1])  # imprime "Roma"

#posicion Fila, columna

print("*******************")


for pais, capital in capitales:
    print(f"La capital de {pais} es {capital}.")
    print("-----")
