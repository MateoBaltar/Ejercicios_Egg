# Escribir un programa que requiera del usuario números, hasta que ingrese 0. Cuando lo haga, mostrar por pantalla la suma de todos los números ingresados.
suma = 0

while (True):
    numero = int(input("Ingrese un número: "))
    if numero == 0:
        break
    suma += numero

print(suma)