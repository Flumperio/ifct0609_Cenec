"""Pedir la edad
de 0 a 3 bebe
3 a 10 niño
10 a 13 preadolescente
13 a 17 adolescente
18 a 67 trabajador
a partir de 67 Feliz Jubilado

limite 120 años"""
#Definición de variables y entrada
edad = int(input("Por favor, ingresa tu edad: "))
condicion = ""
if edad <= 3:
    condicion = "bebe"
else:
    if edad <= 10:
        condicion = "niño"
    else:
        if edad <= 13:
            condicion = "preadolescente"
        else:
            if edad <= 17:
                condicion = "adolescente"
            else:
                if edad <= 67:
                    condicion = "trabajador"
                else:
                    if edad <= 120:
                        condicion = "feliz jubilado"
                    else:
                        condicion = "Evlis Presley"

print (f"Con la edad de: {edad} es un {condicion}")

