# Listas. Realizar el siguiente ejercicio, y después ver el video:
# A partir de la siguiente variable:
# 	matriz = [[1, 5, 1],
# 	          [2, 1, 2],
#                 [3, 0, 1],
#                 [1, 4, 4]]
# Debes crear un cuarto elemento en las listas anidadas, cuyo valor deber ser el resultado de la suma de los tres elementos actuales. El resultado final debe ser el siguiente:
# matriz = [[1, 5, 1, 7],
# 	          [2, 1, 2, 5],
#                 [3, 0, 1, 4],
#                 [1, 4, 4, 9]]
# Lo debes hacer creando tres fragmentos de códigos para llegar al mismo resultado de 3 formas:
# 	a) Usando append() y slicing.
# 	b) Usando append() y sum()
# 	c) Usando el operador + y sum() pero sin usar append()

matriz = [[1, 5, 1],[2, 1, 2], [3, 0, 1],[1, 4, 4]]

for x in range(len(matriz)):
    numeros = matriz[x][0:len(matriz[x])]
    suma = 0
    for y in range(len(numeros)):
        suma += numeros[y]
    matriz[x].append(suma)

print("Metodo 1:\n",matriz)

matriz = [[1, 5, 1],[2, 1, 2], [3, 0, 1],[1, 4, 4]]

for x in range(len(matriz)):
    matriz[x].append(sum(matriz[x][0:len(matriz[x])]))

print("\nMetodo 2:\n",matriz)

matriz = [[1, 5, 1],[2, 1, 2], [3, 0, 1],[1, 4, 4]]

for x in range(len(matriz)):
    lista = [sum(matriz[x][0:len(matriz[x])])]
    matriz[x] =  matriz[x] + lista

print("\nMetodo 3:\n",matriz)
