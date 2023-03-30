# Crea las funciones necesarias para que el usuario ingrese dos números y el programa devuelva el resultado de una división. 
# Prevé los posibles errores del usuario. Luego, crea un paquete llamado 'mi_division'. En él crea un archivo para cada función respectivamente. 
# Fuera del paquete, en un nivel superior, crea un archivo 'main.py' para que sea el script que importe el paquete y ejecute el programa. 
# Pon en práctica las mejores prácticas que has aprendido.


from mi_division import ingresar_datos, dividir

def main() -> None:
    numeros = ingresar_datos()
    if numeros:
        num1, num2 = numeros
        division = dividir(num1, num2)
        if division:
            print(f"El resultado es {division}")
        else:
            print("No se pudo obtener un resultado")

main()