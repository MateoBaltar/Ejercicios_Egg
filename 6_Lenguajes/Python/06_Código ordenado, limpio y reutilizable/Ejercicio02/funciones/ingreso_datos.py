def ingresar_datos(opcion: int) -> tuple[any, ...] | None | int:
    falta_num = "Error falta uno de los numeros"
    operador_invalido = "Error, ingreso un operador no valido"
    invalido = "El valor ingresado no es valido"
    if opcion == 1:
        while (True):
            try:
                base = float(input("Ingrese la base del rectangulo: "))
                altura = float(input("Ingrese la altura del rectangulo: "))
                return base, altura

            except KeyboardInterrupt:
                print(falta_num)
            except TypeError:
                print(operador_invalido)
            except ValueError:
                print(invalido)

    elif opcion == 2:
        while (True):
            try:
                radio = int(input("Ingrese el radio del circulo: "))
                return radio

            except KeyboardInterrupt:
                print("Error falta el numero")
            except TypeError:
                print(operador_invalido)
            except ValueError:
                print(invalido)

    elif opcion == 3:
        while (True):
            try:
                num1 = int(input("Ingrese el primer numero: "))
                num2 = int(input("Ingrese el segundo numero: "))
                return num1, num2

            except KeyboardInterrupt:
                print(falta_num)
            except TypeError:
                print(operador_invalido)
            except ValueError:
                print(invalido)
    elif opcion == 4:
        while (True):
            try:
                num1 = float(input("Ingrese el primer numero: "))
                num2 = float(input("Ingrese el segundo numero: "))
                return num1, num2

            except KeyboardInterrupt:
                print(falta_num)
            except TypeError:
                print(operador_invalido)
            except ValueError:
                print(invalido)
    elif opcion == 5:
        while (True):
            try:
                num = int(input("Ingrese el numero a recortar: "))
                limite_inferior = int(input("Ingrese el limite inferior: "))
                limite_superior = int(input("Ingrese el limite superior: "))
                return num, limite_inferior, limite_superior

            except KeyboardInterrupt:
                print(falta_num)
            except TypeError:
                print(operador_invalido)
            except ValueError:
                print(invalido)
    elif opcion == 6:
        while (True):
            try:
                numeros = []
                eleccion = int(input(
                    "Ingrese 1 si quiere rellenar la lista de numeros a mano, precione 2 para ingresar todos los numeros del 1 al 50: "))
                if eleccion == 1:
                    cantidad = int(
                        input("Ingrese cuantos numeros desea ingresar: "))
                    for i in range(cantidad):
                        num = int(input("Ingrese el numero: "))
                        numeros.append(num)
                    return numeros

                elif eleccion == 2:
                    for i in range(50):
                        numeros.append(i+1)
                    return numeros

            except KeyboardInterrupt:
                print(falta_num)
            except TypeError:
                print(operador_invalido)
            except ValueError:
                print(invalido)
