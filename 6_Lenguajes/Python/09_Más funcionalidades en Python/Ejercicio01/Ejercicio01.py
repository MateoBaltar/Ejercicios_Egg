import os

path = "9_Más funcionalidades enPython\Ejercicio01\mi_ruta.txt"

with open("mi_ruta.txt", "a", encoding="utf-8") as archivo:
    archivo.write("\n" + os.path.abspath(path))
    archivo.write("\n" + archivo.name)

with open("mi_ruta.txt", "r", encoding="utf-8") as archivo:
    lineas = archivo.readlines()
    for i, linea in enumerate(lineas):
        print(f"Linea {i+1}: {linea}")