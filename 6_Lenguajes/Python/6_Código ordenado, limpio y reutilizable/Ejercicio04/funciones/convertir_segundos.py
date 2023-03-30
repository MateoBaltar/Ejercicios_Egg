def convertir_segundos(segundos):
    """ Recibe los segundos ingresados y los divide por 60 para conseguir los minutos. Retorna el resultado redondeado sin decimales. """
    minutos = segundos // 60
    return round(minutos)