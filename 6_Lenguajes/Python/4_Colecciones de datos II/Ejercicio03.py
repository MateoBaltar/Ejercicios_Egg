# Pedirle a un usuario que ingrese un número, y devolver los dígitos totales del número. Por ejemplo, si el número es 75869, la salida debería ser 5

numero = int(input("Ingrese un número: "))

contador_digitos = 0
while (numero != 0):
    numero //= 10
    contador_digitos += 1

print("El numero ingresado es de", contador_digitos, "digitos")