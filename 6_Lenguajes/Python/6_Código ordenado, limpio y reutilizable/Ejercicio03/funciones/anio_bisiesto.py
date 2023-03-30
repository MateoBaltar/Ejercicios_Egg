def calcular_bisiesto(anio):
    if anio % 400 == 0 and anio %100 == 0:
        return "Es bisiesto"
    elif anio % 4 == 0 and anio % 100 != 0:
        return "Es bisiesto"
    else:
        return "No es bisiesto"