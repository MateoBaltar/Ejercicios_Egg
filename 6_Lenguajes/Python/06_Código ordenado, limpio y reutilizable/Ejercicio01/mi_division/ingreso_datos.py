def ingresar_datos() -> tuple[float, float] | None:
    try:
        num1 = float(input("Ingrese el dividendo: "))
        num2 = float(input("Ingrese el divisor: "))
    except ValueError:
        print("Debe introducir numeros")
        return None
    except KeyboardInterrupt:
        print("No ingreso suficientes numeros")
    else:
        return num1,num2
