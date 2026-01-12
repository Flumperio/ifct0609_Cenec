#Definir una lista que almacene por asignación los nombres de 5 personas. Contar cuantos de esos nombres tienen 5 o más caracteres.
#Definición de variablxs
listaNombres = ["Juan Carlos", "Elena", "Marco", "Ana", "Alfonso", "Mariano"]
cnt = 0
cntNombres = 0
#Logica
while cnt < len(listaNombres):
	if len(listaNombres[cnt]) >= 5:
		cntNombres += 1
	cnt += 1
#Impresión de resultados
print("\n=== === === Resultado === === ===")
print("De la lista: ", listaNombres)
print(f"Hay {cntNombres} que tienen más de 5 caracteres")
#Con buble for each
for cnt in listaNombres:
	if len(cnt) >=5:
		print (cnt)
