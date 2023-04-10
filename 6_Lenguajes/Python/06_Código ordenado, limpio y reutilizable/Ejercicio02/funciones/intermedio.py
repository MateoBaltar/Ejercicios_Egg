def calcular_intermedio(num1, num2):
    """ Recibe 2 argumentos de tipo float por parametro, luego retorna la suma de ambos divividos por 2 """
    try:
        return (num1 + num2) / 2
    except ZeroDivisionError:
        print("No se puede dividir por 0")
