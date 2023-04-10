def dividir(num1, num2):
    try:
        resultado = num1 / num2
        return resultado
    except TypeError:
        print("Error, un operador no permite la division")
        return None
    except ZeroDivisionError:
        print("Error, division por cero")
        return None
    except Exception:
        print("Hubo un error desconocido")
        return None
