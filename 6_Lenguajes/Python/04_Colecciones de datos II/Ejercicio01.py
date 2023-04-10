# Escribir un programa que almacene en una lista los números del 1 al 10 y los muestre por pantalla en orden inverso.

numeros = []

for x in range(10):
    numeros.append(x+1)

print(numeros[-1:-len(numeros)-1:-1])