# Crea una función llamada área_círculo que devuelva el área de un círculo a partir de un radio. 
# El área de un círculo se obtiene al elevar el radio a dos y multiplicando el resultado por el número pi.  
# Importa el módulo math para utilizar la variable/constante math.pi. Documenta la función.

import math


def area_circulo(radio):
    """ Calcula y retorna el area de un circulo a partir del radio que se recibido por parametro y la implementacion del modulo math para la constante Pi """
    return (radio * radio) * math.pi

radio = int(input("Ingrese el radio del circulo: "))

area = area_circulo(radio)

print(f"El area del circulo con radio de {radio} es {round(area,2)}")