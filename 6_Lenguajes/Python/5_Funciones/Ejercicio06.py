# Crea una función llamada separar. Recibirá una lista de números enteros. Devolverá dos listas ordenadas. 
# La primera, con los números pares, y la segunda, con los números impares. Documenta la función.

def separar(numeros):
    """ Recibe una lista de numeros, se crean 2 listas vacias -una de pares y otra de impares- 
    y luego se recorre elemento por elemento en la lista recibida por parametro y usando funciones logicas se agregan a las listas de numeros pares o impares. """
    pares = []
    impares = []
    for numero in numeros:
        if numero % 2 == 0:
            pares.append(numero)
        else:
            impares.append(numero)
    return pares, impares

numeros = []

for i in range (20):
    numeros.append(i+1)

numeros_separados = separar(numeros)

print(f"Numeros pares: {numeros_separados[0]} \nNumeros impares: {numeros_separados[1]}")
