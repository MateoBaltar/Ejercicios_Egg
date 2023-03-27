# Pregunta al usuario por su nombre, edad, dirección y teléfono. Guardar los datos en un diccionario. 
# Mostrar por pantalla:  <nombre> tiene <edad> años, vive en <dirección> y su número de teléfono es <teléfono>.

nombre = input("Ingrese su nombre: ")
edad = input("Ingrese su edad: ")
direccion = input("Ingrese su direccion: ")
tel = input("Ingrese su teléfono: ")

usuario = {"nombre": nombre, "edad": edad, "direccion": direccion, "telefono": tel}

print(usuario["nombre"], "tiene", usuario["edad"], "años, vive en", usuario["direccion"], "y su número de teléfono es", usuario["telefono"])