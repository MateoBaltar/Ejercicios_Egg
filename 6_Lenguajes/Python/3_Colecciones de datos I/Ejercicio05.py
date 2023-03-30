# Escribir un programa que pregunte al usuario que ingrese palabras, y cada vez que ingrese una, la guarde en una lista. 
# La palabra será guardada en mayúsculas y en orden inverso. Salir del programa cuando el usuario no ingrese nada. 
# Mostrar por pantalla la lista completa de palabras invertidas.

lista = []

while(True):
    palabra = input("Ingrese palabra: ")
    if palabra == "":
        break
    lista.insert(0, palabra[-1:-len(palabra)-1:-1])

print(lista)