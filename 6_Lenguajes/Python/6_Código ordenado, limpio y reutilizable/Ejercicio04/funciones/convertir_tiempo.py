from .convertir_horas import convertir_horas
from .convertir_minutos import convertir_minutos
from .convertir_segundos import convertir_segundos


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