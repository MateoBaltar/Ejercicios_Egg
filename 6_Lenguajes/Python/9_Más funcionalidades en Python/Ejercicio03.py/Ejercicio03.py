import dataclasses
import datetime
import time
import json

from attr import asdict, dataclass


@dataclass
class Cliente:
    dni: str
    apellidos: str
    nombres: str
    nacimiento: datetime


def cliente_ingreso():
    while (True):
        try:
            print("Ingrese el DNI del cliente")
            dni = input()
            print("Ingrese los apellidos del cliente")
            apellidos = input()
            print("Ingrese los nombres del cliente")
            nombres = input()
            print("Ingrese la fecha de nacimiento del cliente")
            nacimiento = input()
            nacimiento = datetime.datetime(
                *time.strptime(nacimiento, "%d/%m/%Y")[:6])
            if nacimiento > datetime.datetime.now():
                print("La fecha de nacimiento no puede ser mayor a la actual")
            else:
                cliente = Cliente(dni, apellidos, nombres, nacimiento)
                return cliente
        except ValueError:
            print("Error en la entrada de datos")


def cliente_guardar(cliente):
        cliente.nacimiento = cliente.nacimiento.strftime("%A %d/%B/%Y %H:%M:%S")
        cliente_dict = asdict(cliente)
        with open("lista_clientes.JSON", "a") as archivo:
            json.dump(cliente_dict, archivo, indent=4)


for i in range(3):
    cliente = cliente_ingreso()
    cliente_guardar(cliente)