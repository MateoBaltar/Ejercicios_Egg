from funciones import calcular_bisiesto


def main() -> None:
    try:
        print("Introduzca el año: ")
        anio = int(input())
        print(calcular_bisiesto(anio))

    except ValueError:
        print("Debe introducir un año valido")
    except Exception:
        print("Error")

main()