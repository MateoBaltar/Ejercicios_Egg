# Escribir un programa que pida al usuario un número entero del 0 al 9 dentro de un bucle. Comprobar si el número se encuentra en la lista de números válidos y notificarlo:
# numeros_validos = [1, 3, 6, 9]

numeros_validos = [1, 3, 6, 9]

while(True):
    numero = int(input("Introduce un número entre 0 y 9: "))
    if numero in numeros_validos:
        print("El número", numero, "está en la lista de números válidos")
        break