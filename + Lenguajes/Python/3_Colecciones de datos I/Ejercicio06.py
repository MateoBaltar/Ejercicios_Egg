# Crear la lista 'mis_numeros'. El usuario debe introducir enteros. Cada vez que ingresa un número, guardarlo en una tupla anidada dentro de la lista 'mis_numeros'. 
# Sale de la entrada de números cuando presiona 'enter' si no hay nada ingresado. 
# Al terminar, mostrar por pantalla 'mis_numeros', por un lado, y por otro, los elementos desempacados de 'mis_numeros' (no aparecerán los corchetes). 
# Finalmente, mostrar por pantalla cada elemento desempacado de cada tupla (no aparecerán los paréntesis ni la coma). Usar la función len().

mis_numeros = []

while(True):
    numero = input("Ingrese un número: ")
    if numero == "":
        break
    int(numero)
    tupla = tuple(numero)
    mis_numeros.append(tupla)

print(mis_numeros)

for x in mis_numeros:
    print(x, end=" ")
    
print()

for x in mis_numeros:
    for y in x:
        print(y, end=" ")