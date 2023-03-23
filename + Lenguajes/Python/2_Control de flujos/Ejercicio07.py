# Escribir un programa que permita al usuario ingresar dos años y luego imprima todos los años en ese rango. Tienen que ser los años bisiestos. 
# Nota: para que un año sea bisiesto debe ser divisible por 4 y no debe ser divisible por 100, excepto si también es divisible por 400.



while(True):
    año1 = int(input("Ingrese el año 1: "))
    año2 = int(input("Ingrese el año 2: "))

    if año1 > año2:
        print("El año 1 debe ser menor que el año 2")
    else:
        for i in range(año1,año2+1):
            if i % 400 == 0 and i %100 == 0:
                print(i, end=" ")
            elif i % 4 == 0 and i % 100 != 0:
                print(i, end=" ")
            else:
                continue
        break
