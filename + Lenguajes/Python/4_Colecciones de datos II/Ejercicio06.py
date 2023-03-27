# Realizar el siguiente ejercicio, y después ver el video:
# Dadas dos listas, debes generar una tercera con todos los elementos que se repitan en ellas, pero no debe repetirse ningún elemento en la nueva lista.

lista_1 = ["h", "o", "r", "o", " ", "s", "o", "l", "a"]
lista_2 = ["h", "o", "l", "a", " ", "l", "u", "n", "a"]
lista_3 = []

for x in range(len(lista_1)):
    if lista_1[x] in lista_2 and lista_1[x] not in lista_3:
        lista_3.append(lista_1[x])
    if lista_2[x] in lista_1 and lista_2[x] not in lista_3:
        lista_3.append(lista_2[x])

print(lista_3)