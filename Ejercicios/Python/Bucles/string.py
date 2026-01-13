#Procesar cadena de caracteres
nombre1 = "JuanCarlos"
posicion = nombre1[0]
print ("El caracter número 1 es: ", posicion)

if posicion >= "A" and posicion <= "Z":
	print("Es mayúscula")
else:
	print("Es minúscula")
print("El número total de caracteres es: ", len(nombre1))
