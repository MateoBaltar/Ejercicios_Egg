# Se decide organizar un juego de estrategia. Se forman dos equipos de seis integrantes cada uno. Un integrante del grupo es "el jefe".
# Se comunicarán mediante un canal común: deben buscar la forma de ocultar el contenido de sus mensajes.
# Uno de los equipos decide utilizar un método antiguo de encriptación llamado “la cifra del césar”,
# que consiste en correr cada letra del mensaje –considerando la posición de cada una en el alfabeto– una determinada cantidad de lugares.
# Ejemplo: si el valor de "corrimiento" es 2, la palabra “ATAQUE” se transforma en  “CVCSWG”. Cada día, el “jefe” del equipo debe enviar un mensaje a su grupo.
# Escribir un programa que permita encriptar los 5 mensajes.
# El "corrimiento" (cantidad de letras que se correrán hacia la derecha) será dado por el usuario antes de comenzar a encriptar. Los 5 mensajes usarán el mismo "corrimiento".
# Nota: si el alfabeto termina antes de poder correr la cantidad de lugares necesarios, se vuelve a comenzar desde la letra “a”.
# Ejemplo: la palabra “EXTRA” corrida 3 lugares se convierte en “HAWUD”. Utilizando el alfabeto español, de 27 letras,
# el siguiente cálculo matemático permite volver a comenzar por el principio una vez que se llegó a la “z”: (índice de la letra a correr+corrimiento)%27.
# Solo se encriptarán las letras de los mensajes, dejando al resto de caracteres sin modificación.

corrimiento = int(input("Ingrese el corrimiento del mensaje: "))

palabra_1 = input("Ingrese la primera palabra a encriptar: ")
palabra_2 = input("Ingrese la segunda palabra a encriptar: ")
palabra_3 = input("Ingrese la tercera palabra a encriptar: ")
palabra_4 = input("Ingrese la cuarta palabra a encriptar: ")
palabra_5 = input("Ingrese la quinta palabra a encriptar: ")

palabras = (palabra_1, palabra_2, palabra_3, palabra_4, palabra_5)

palabra_1_encriptada = ""
palabra_2_encriptada = ""
palabra_3_encriptada = ""
palabra_4_encriptada = ""
palabra_5_encriptada = ""
palabras_encriptadas = [palabra_1_encriptada, palabra_2_encriptada, palabra_3_encriptada, palabra_4_encriptada, palabra_5_encriptada]

contador = 0
for palabra in palabras:
    for caracteres in range(len(palabra)):
        car = palabra[caracteres]
        if car == " ":
            palabras_encriptadas[contador] += " "
        elif car.isupper():
            palabras_encriptadas[contador] += chr((ord(car) + corrimiento-65) % 26 + 65)
        else:
            palabras_encriptadas[contador] += chr((ord(car) + corrimiento-97) % 26 + 97)

    contador += 1

print(f"Palabras antes de encriptar: {palabras}")
print(f"Palabras despues de encriptar: {palabras_encriptadas}")
           


