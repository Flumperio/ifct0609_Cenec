# Ejercicio: salario

# con un input me pide el salario bruto mensual
# me tiene que calcular las 14 pagas
# si el salario es mayor de 40.000 el impuesto a aplicar es del 21%, si es menor del 15%

# Resultado

# Su salario mensual es 4000
# el salario anual es de 48.000
# el tramo a aplicar es del 21%
# Tiene que pagar a Hacienda:

#Definición de variables
salarioBrutoMensual = float(input("Introduce el salario bruto mensual: "))
salarioBrutoAnual =  salarioBrutoMensual * 14
ivaAplicar = 15
if salarioBrutoAnual > 40000:
	ivaAplicar = 21
pagoImpuesto = salarioBrutoAnual * (ivaAplicar/100)
#Impresion de datos.
print("----------------------------------------------------------------------")
print(f"Su salario mensual es de: {salarioBrutoMensual:,.2f}")
print(f"El salario bruto anual es de: {salarioBrutoAnual:,.2f}")
print(f"El IVA a aplicar es de: {ivaAplicar}")
print(f"Tienes que pagar a Hacienda (Que somos todos): {pagoImpuesto:,.2f}")
print("----------------------------------------------------------------------")
