def separar_numeros(numeros):
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