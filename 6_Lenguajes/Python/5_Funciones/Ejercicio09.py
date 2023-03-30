# Crea una función que reciba 3 parámetros de enteros: horas, minutos y segundos, los convierta en "tiempo" y devuelva una tupla de enteros: días, horas, minutos, segundos. 
# El usuario debe introducir los datos desde la consola y debe ver el resultado de forma legible. 
# Una buena práctica de programación es crear varias funciones que solamente hagan una cosa. 
# Trata de documentar brevemente cada función, y separar la lógica, la interacción con el usuario y lo que se muestra por pantalla:

def convertir_tiempo(horas, minutos, segundos):
    """ Recibe los parametros de horas, minutos y segundos para convertirlos a tiempo. Llama a distintas funciones para convertir las unidades como corresponde y calcula el
    sobrante. Luego retorna el tiempo completo """
    segundos_a_minutos = convertir_segundos(segundos)
    segundos %= 60

    minutos_a_horas = convertir_minutos(minutos, segundos_a_minutos)
    minutos = (minutos + segundos_a_minutos) % 60

    dias = convertir_horas(horas, minutos_a_horas)
    horas = (horas + minutos_a_horas) % 24

    return dias, horas, minutos, segundos

def convertir_segundos(segundos):
    """ Recibe los segundos ingresados y los divide por 60 para conseguir los minutos. Retorna el resultado redondeado sin decimales. """
    minutos = segundos // 60
    return round(minutos)

def convertir_minutos(minutos, segundos_a_minutos):
    """ Recibe los minutos ingresados y los calculados por la anterior funcion, luego los divide por 60 para conseguir las horas. Retorna el resultado redondeado sin decimales. """
    horas = (minutos + segundos_a_minutos) // 60
    return round(horas)

def convertir_horas(horas, minutos_a_horas):
    """ Recibe las horas ingresadas y las calculadas por la anterior funcion, luego las divide por 24 para conseguir los dias. Retorna el resultado redondeado sin decimales. """
    dias = (horas + minutos_a_horas) // 24
    return abs(dias)

horas = int(input("Ingrese una cantidad de horas: "))
minutos = int(input("Ingrese una cantidad de minutos: "))
segundos = int(input("Ingrese una cantidad de segundos: "))

tiempo = convertir_tiempo(horas, minutos, segundos)

print(f"A partir de las horas, minutos y segundos ingresados se deduce que el tiempo del mismo seria de: \n{tiempo[0]} dias \n{tiempo[1]} horas \n{tiempo[2]} minutos \n{tiempo[3]} segundos")