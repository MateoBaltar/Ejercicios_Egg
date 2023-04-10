import datetime
import time

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
    cliente_dict = asdict(cliente)
    fecha_creacion = datetime.datetime.now().strftime("creado: %A %d/%B/%Y %H:%M:%S")
    linea = ",".join(str(valor) for valor in cliente_dict.values())
    linea += "," + fecha_creacion + "\n"
    with open("Lista_Clientes.txt", "a") as archivo:
        archivo.write(linea)


for i in range(3):
    cliente = cliente_ingreso()
    cliente_guardar(cliente)
