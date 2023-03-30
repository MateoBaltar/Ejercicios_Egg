# Tuplas. A partir de la siguiente tupla:
# tupla = (5, 12, 7, 37, 8, 86, 19, 7, -783, 87, 188, 7, 9, 12, 7, 3982)
# Imprimir por pantalla, de forma ordenada, lo siguiente:
# 1) El último elemento de tupla
# 2) El número de elementos de tupla (usa la función 'len')
# 3) La posición donde se encuentra el elemento 87 de tupla
# 4) Un elemento que esté en la posición 8 de tupla
# 5) Una lista con los últimos tres ítems de tupla
# 6) El número de veces que el ítem 7 aparece en tupla

tupla = (5, 12, 7, 37, 8, 86, 19, 7, -783, 87, 188, 7, 9, 12, 7, 3982)

print("El ultimo elemento de la tupla es:", tupla[-1])

print("El largo de la tupla es =", len(tupla))

print("El elemento 87 se encuentra en la posicion", tupla.index(87))

print("El elemento en la posicion 8 de la tupla es:", tupla[8])

print("Los ultimos 3 elementos en la tupla son", tupla[-1:-4:-1])

print("El item 7 aparece", tupla.count(7), "veces en la tupla")