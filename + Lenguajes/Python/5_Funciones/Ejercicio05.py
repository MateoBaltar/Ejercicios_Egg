# Crea una función llamada recortar. Recibirá tres parámetros. El primero es el número (a recortar), el segundo es el "límite inferior" y el tercero el "límite superior". 
# La función hará lo siguiente:	
# - Devolver el "límite inferior", si el número (a recortar) es menor que este.
# - Devolver el "límite superior", si el número es mayor que este.
# - Devolver el "número" sin cambios, si no se supera ningún límite.

def recortar(num, limite_inferior, limite_superior):
    if num < limite_inferior:
        return limite_inferior
    elif num > limite_superior:
        return limite_superior
    else:
        return num
    
num = int(input("Ingrese el numero a recortar: "))
limite_inferior = int(input("Ingrese el limite inferior: "))
limite_superior = int(input("Ingrese el limite superior: "))

recorte = recortar(num, limite_inferior, limite_superior)
if recorte == num:
    print("El numero no se ha recortado")
elif recorte == limite_inferior:
    print("El numero se ha recortado por el límite inferior")
elif recorte == limite_superior:
    print("El numero se ha recortado por el límite superior")