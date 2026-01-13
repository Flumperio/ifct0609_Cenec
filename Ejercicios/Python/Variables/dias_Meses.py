#dias y meses del año

#Definición de variables,
diaSemana = input("Introduce el día de la semana: ").lower()
mesAnio = input("Introduce el mes: ").lower()
literaldia =""
estacion = ""
#Logica
match diaSemana:
	case "lunes" | "martes" |"miercoles" | "jueves" | "viernes":
		literaldia = "es un día laborable"
	case "sabado" | "domingo":
		literaldia = "es fin de semana"
	case _:
		literaldia = "No es un día válido"
match mesAnio:
	case "marzo" | "abril" | "mayo":
		estacion = "Primavera"
	case "junio" | "julio" | "agosto":
		estacion = "Verano"
	case "septiembre" | "octubre" | "noviembre":
		estacion = "Otoño"
	case "julio" | "diciembre" | "enero" | "febrero":
		estacion = "Invierno"

print(f"El {diaSemana} es {literaldia}. En el mes de {mesAnio} estamos en {estacion}")
