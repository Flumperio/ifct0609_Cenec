# Ejercicio me pide dos inputs, uno la nomina, otro el irpf, vamos a usar 2 funciones, uno que calcule el irpf, el otro que me diga el neto que voy a cobrar,
# además quiero saber el bruto anual, el irpf anual y el neto anual, teniendo en cuenta que son 14 pagas.

def calculoIRPF(salario, retencion):
	return (salario*(retencion/100))
def calculoNeto(salario):
	return salario-calculoIRPF(salario, retencionIRPF)

#Main
#Definición variables
salarioBruto, retencionIRPF = 0, 0
pagas = 14
print("=== Entrada de datos ===")
salarioBruto = float(input("Introduce el salario bruto mensual: "))
retencionIRPF = float(input("Introduce la retención IRPF: "))
irpf = calculoIRPF(salarioBruto,retencionIRPF)
neto = calculoNeto(salarioBruto)
print("\n=== === === === ===")
print(f"Salario bruto: {salarioBruto}\nIRPF: {retencionIRPF}\nRetencion IRPF: {irpf}\nNeto Mensual: {neto}")
print("\n=== ===  Anual  === ===")
print(f"Bruto Anual: {salarioBruto*14}\nIRPF Anual: {irpf*14}\nNeto Anual: {neto * 14}")
