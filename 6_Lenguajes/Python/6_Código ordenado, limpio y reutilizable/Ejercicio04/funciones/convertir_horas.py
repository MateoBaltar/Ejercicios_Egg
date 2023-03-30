def convertir_horas(horas, minutos_a_horas):
    """ Recibe las horas ingresadas y las calculadas por la anterior funcion, luego las divide por 24 para conseguir los dias. Retorna el resultado redondeado sin decimales. """
    dias = (horas + minutos_a_horas) // 24
    return abs(dias)