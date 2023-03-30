def calcular_rectangulo(base, altura):
    """ Calcula y retorna el area (int o float) de un rectangulo recibiendo por parametro la base (int o float) y altura (int o float) del mismo. Formula: A = b * h """
    try:
        return base * altura
    except TypeError:
        print("Error, ingreso un operador no valido")
    except Exception:
        print("Error desconocido!")
