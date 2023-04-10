def convertir_minutos(minutos, segundos_a_minutos):
    """ Recibe los minutos ingresados y los calculados por la anterior funcion, luego los divide por 60 para conseguir las horas. Retorna el resultado redondeado sin decimales. """
    horas = (minutos + segundos_a_minutos) // 60
    return round(horas)