# Crea una función llamada área_rectángulo que devuelva el área del rectángulo a partir de una base y una altura. 
# El área de un rectángulo se obtiene al multiplicar la base por la altura. 
# El usuario debe ingresar dos números, el resultado se guarda en una variable y se imprime el valor de la variable mostrándola al usuario. Documenta la función.

def area_rectangulo(base, altura):
    """ Calcula y retorna el area (int o float) de un rectangulo recibiendo por parametro la base (int o float) y altura (int o float) del mismo. Formula: A = b * h """
    return base * altura

base = int(input("Ingrese la base del rectangulo: "))
altura = int(input("Ingrese la altura del rectangulo: "))

area = area_rectangulo(base, altura)

print(f"El area del rectangulo con base de {base} y altura de {altura} es {area}")