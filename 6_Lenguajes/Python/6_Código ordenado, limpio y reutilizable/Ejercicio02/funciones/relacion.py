def consultar_relacion(num1, num2):
    """ Recibe 2 numeros por parametro y los compara. Retorna 1 si el primer numero es mayor al segundo, -1 si el primero es menor al segundo o 0 si son iguales """
    if num1 > num2:
        print(f"El numero {num1} es mayor que {num2}")
    elif num1 < num2:
        print(f"El numero {num2} es mayor que {num1}")
    else:
        print(f"Los numeros {num1} y {num2} son iguales")
