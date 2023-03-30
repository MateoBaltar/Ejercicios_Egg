# Conjuntos. Crear un conjunto 'usuarios' con los usuarios 'Brahms', 'Schubert', 'Vivaldi', 'Verdi' y 'Tchaikovsky'. 
# Crear otro conjunto 'administradores', y poner como administrador a 'Brahms' y 'Verdi'. Eliminar al administrador 'Brahms' del conjunto de administradores. 
# Agregar a 'Tchaikovsky' como nuevo administrador, pero no eliminarlo del conjunto de usuarios. Mostrar todos los usuarios por consola. 
# Además, mostrar si cada usuario es administrador o no.

usuarios = ("Brahms", "Schubert", "Vivaldi", "Verdi", "Tchaikovsky")
administradores = {"Brahms", "Verdi"}

administradores.remove("Brahms")
administradores.add("Tchaikovsky")

for usuario in usuarios:
    if usuario in administradores:
        print("El usuario " + usuario + " es administrador")
    else:
        print(usuario)