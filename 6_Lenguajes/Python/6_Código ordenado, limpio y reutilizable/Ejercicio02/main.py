# Mira la guía anterior llamada "Funciones" (en la parte de Ejercicios de Aprendizaje Extra. 
# A partir de los ejercicios 1, 2, 3, 4 5 y 6 que ya están resueltos, crea un paquete que contenga los siguientes módulos: 
# a. área_rectángulo
# b. área_círculo
# c. relación
# d. intermedio
# e. recortar
# f. separar
# Agrega las anotaciones de tipo para cada función y crea un script que, por medio de un menú, el usuario pueda elegir qué desea hacer. Maneja los posibles errores para que el programa no se detenga. Haz pruebas unitarias.



from funciones import ingresar_datos, separar_numeros, calcular_rectangulo, calcular_intermedio, calcular_circulo, consultar_relacion, hacer_recorte


def main() -> None:
    print("Bienvenid@ al menu de funciones, a continuacion tiene las funciones disponibles")
    while (True):
        try:
            print("--- MENU --- \n1) Calcular area de un rectangulo \n2) Calcular el area de un circulo \n3) Comprar dos numeros \n4) Calcular el numero entre 2 numeros \n5) Recortar numero \n6) Separar numeros pares de impares \n7) Salir")
            opcion = int(input("Ingrese su opcion: "))

            if opcion == 1:
                base, altura = ingresar_datos(opcion)
                area = calcular_rectangulo(base, altura)
                if area:
                    print(
                        f"El area del rectangulo de base = {base} y altura = {altura} es igual a {area}")
                else:
                    print("No se pudo obtener el resultado")
            elif opcion == 2:
                radio = ingresar_datos(2)
                area = round(calcular_circulo(radio), 2)
                if area:
                    print(
                        f"El area del rectangulo de base = {base} y altura = {altura} es igual a {area}")
                else:
                    print("No se pudo obtener el resultado")

            elif opcion == 3:
                num1, num2 = ingresar_datos(3)
                consultar_relacion(num1, num2)

            elif opcion == 4:
                num1, num2 = ingresar_datos(4)
                intermedio = calcular_intermedio(num1, num2)
                print(
                    f"El numero intermedio entre {num1} y {num2} es {intermedio}")

            elif opcion == 5:
                numero, limite_inferior, limite_superior = ingresar_datos(5)
                resultado = hacer_recorte(
                    numero, limite_inferior, limite_superior)

                if resultado == numero:
                    print("El numero no se ha recortado")
                elif resultado == limite_inferior:
                    print("El numero se ha recortado por el límite inferior")
                elif resultado == limite_superior:
                    print("El numero se ha recortado por el límite superior")

            elif opcion == 6:
                numeros = ingresar_datos(6)
                pares, impares = separar_numeros(numeros)
                print(f"Numeros pares: {pares} \nNumeros impares: {impares}")

            elif opcion == 7:
                print("Adios!")
                break

            else:
                print("El numero ingresado no corresponde a ninguna opcion disponible")

        except ValueError:
            print("Debe ingresar un numero")

        except Exception as error:
            print(f"{type(error).__name__}: {error}")


main()
