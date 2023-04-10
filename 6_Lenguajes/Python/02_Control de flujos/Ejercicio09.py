# Escribir un programa que lea dos números por teclado y permite elegir entre 4 opciones en un menú: 
# 1) Mostrar una suma de los dos números. 
# 2) Mostrar una resta de los dos números (el primero menos el segundo). 
# 3) Mostrar una multiplicación de los dos números. 
# 4) Si elige esta opción se interrumpirá la impresión del menú y el programa finalizará. 
# 5) En caso de no introducir una opción válida, el programa informará de que no es correcta.


numero_1 = int(input("Ingrese el primer numero: "))
numero_2 = int(input("Ingrese el segundo numero: "))

eleccion = 0

while (eleccion != 4):
    print("\n--- Menu--- \n1) Sumar los numeros \n2) Restar los numeros \n3) Multiplicar los numeros \n4)Salir")
    eleccion = int(input("Elige una opción: "))
    if (eleccion == 1):
        print("La suma de los numeros es:", numero_1 + numero_2)
    elif (eleccion == 2):
        print("La resta de los numeros es: ", numero_1 - numero_2)
    elif (eleccion == 3):
        print("La multiplicacion de los numeros es: ", numero_1 * numero_2)
    elif (eleccion != 4):
        print("La eleccion no es correcta")
