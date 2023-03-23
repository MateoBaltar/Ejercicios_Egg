# Escribir un programa que reciba tres entradas:
# usuario: str
# password: str
# repetir_password: str
# Luego debe validar que:
# La longitud de usuario sea mayor que 5
# El primer carácter de usuario no debe ser un número
# El password debe ser menor a 4 caracteres
# repetir_password debe ser igual a password

while (True):
    usuario = input("Ingrese el nombre de usuario: ")
    password = input("Ingrese la contraseña: ")
    repetir_password = input("Ingrese la contraseña nuevamente: ")

    if len(usuario) > 5 and not usuario[0].isdigit() and len(password) < 4 and password == repetir_password:
        print("Bienvenido usuario")
        break
    else:
        print("Error, vuelve a intentarlo")
