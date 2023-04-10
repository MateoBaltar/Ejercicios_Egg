# A partir de los ejercicios del apartado anterior, Funciones, crea un paquete conversor_tiempo, con los mismos requisitos de los ejercicios anteriores. 
# Haz pruebas unitarias creando una carpeta tests en el proyecto.

from funciones import convertir_tiempo

def main() -> None:
    horas = int(input("Ingrese una cantidad de horas: "))
    minutos = int(input("Ingrese una cantidad de minutos: "))
    segundos = int(input("Ingrese una cantidad de segundos: "))
    tiempo = convertir_tiempo(horas, minutos, segundos)

    print(f"A partir de las horas, minutos y segundos ingresados se deduce que el tiempo del mismo seria de: \n{tiempo[0]} dias \n{tiempo[1]} horas \n{tiempo[2]} minutos \n{tiempo[3]} segundos")

main()