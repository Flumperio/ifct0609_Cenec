"""Ejercicio61.py

Me pida por consola un codigo, si el codigo es correcto es decir "==", me aparezca por pantalla
el mensaje "Codigo correcto, puede pasar", si es incorrecto "Codigo erroneo, alerta!!!!"""

#Definimos variables e ingresamos datos
codigoCorrecto = "mijacagalopa"
codigoEntrada = input("Introduce el código secreto: ")
if codigoCorrecto == codigoEntrada:
    print("Código correcto, puede pasar")
else:
    print("Código erróneo, alerta !!!!")