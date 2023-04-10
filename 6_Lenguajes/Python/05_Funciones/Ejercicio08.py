# Un usuario debe ingresar un número entero, y puede ingresar los dígitos precedidos (sin espacios) del signo '+' o el signo '-'. 
# Ejemplo: 2000, -2000 o +2000. 
# Luego de que haya ingresado el número, la función 'validar_número' debe recibir como parámetro esa cadena de texto, analizarla, y devolver True si cumple las condiciones,
# si no, False. Si la función devuelve True, debes convertir la cadena a un entero. Documentar la función. Imprimir el resultado.

def validar_numero(numero, digitos_precedidos):
    """ Recibe por parametro un numero entero y un String. El primer if verifica que el primer caracter del string sea '+' o '-',
    En caso que no lo sea devuelve False. Si se cumple el requerimiento entonces compara si el resto de caracteres dentro del String son iguales al numero ingresado
    Usando una conversion a int y recortando el String comenzando luego del primer caracter se compara con el numero. Si son iguales se devuelve True, de lo contrario False """
    if digitos_precedidos[0] == "+" or digitos_precedidos[0] == "-":
        if int(digitos_precedidos[1::]) == numero:
            return True
        else:
            return False
    else:
        return False
    
numero = int(input("Ingrese un número: "))
digitos_precedidos = input("Ingrese los digitos del mismo pero con una + o un - al comienzo. Ejemplo: 2000, -2000 o +2000. : ")

validar = validar_numero(numero, digitos_precedidos)

if validar:
    print("El número es válido")
else:
    print("El número no es válido")