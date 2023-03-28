# Realiza el ejercicio anterior con el método de comprensión de listas.

def separar(numeros):
    """ Recibe una lista de numeros, se crean 2 listas -una de pares y otra de impares- las cuales se rellenan usando comprension de listas. """
    pares = [numero for numero in numeros if numero % 2 == 0]
    impares = [numero for numero in numeros if numero % 2 != 0]
    return pares, impares

numeros = []

for i in range (20):
    numeros.append(i+1)

numeros_separados = separar(numeros)

print(f"Numeros pares: {numeros_separados[0]} \nNumeros impares: {numeros_separados[1]}")