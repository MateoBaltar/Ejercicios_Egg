# Listas. A partir de las siguientes listas:
#   lista_1 = [1, 12, 123]
# 	lista_2 = ["Bye", "Ciao", "Agur", "Adieu"]
# 1) Añade a la lista_1 el entero 1234 y luego la cadena "Hola"
# 2) Añade a la lista_2 el string “Adios” y luego el entero 1234
# 3) Genera una lista_3 con todos los elementos de la lista_1 menos el último
# 4) Genera una lista_4 con todos los elementos de la lista_2 menos el primero y el último
# 5) Genera una lista_5 con los elementos de la lista_4 y de la lista_3

lista_1 = [1, 12, 123]
lista_2 = ["Bye", "Ciao", "Agur", "Adieu"]

lista_1.append(1234)
lista_1.append("Hola")
print("Lista 1:",lista_1)

lista_2.append("Adios")
lista_2.append(1234)
print("Lista 2:",lista_2)

lista_3 = lista_1[0:len(lista_1)-1]
print("Lista 3:",lista_3)

lista_4 = lista_2[1:len(lista_2)-1]
print("Lista 4:",lista_4)

lista_5 = lista_3 + lista_4
print("Lista 5:",lista_5)