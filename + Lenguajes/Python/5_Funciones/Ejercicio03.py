# Crea una función llamada relación. Recibirá 2 parámetros de tipo entero. 
# Si el primer parámetro es mayor que el segundo, la función debe devolver 1; pero si el primer número es menor que el segundo, debe devolver -1. 
# Si ambos números son iguales, debe devolver 0. Documenta la función.

def relacion(num1, num2):
    """ Recibe 2 numeros por parametro y los compara. Retorna 1 si el primer numero es mayor al segundo, -1 si el primero es menor al segundo o 0 si son iguales """
    if num1 > num2:
        return 1
    elif num1 < num2:
        return -1
    else:
        return 0
    
num1 = int(input("Ingrese el primer numero: "))
num2 = int(input("Ingrese el segundo numero: "))

if relacion(num1, num2) == 1:
    print(f"El numero {num1} es mayor que {num2}")
elif relacion(num1, num2) == -1:
    print(f"El numero {num2} es mayor que {num1}")
else:
    print(f"Los numeros {num1} y {num2} son iguales")