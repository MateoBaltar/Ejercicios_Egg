# Métodos de clase y Factory Method:
# - Crea una clase Vehículo con una variable de clase "modelo"dos variables de instancia: "nombre" y "precio".
# - Crea un método de clase "con_rebaja" que sea un patrón Factory Method, el cual debe crear un objeto con un descuento del 20%.
# - Crea un método de instancia "mostrar", imprimirá el nombre y el precio.
# - Crea la clase Auto que heredará de Vehículo.
# - Crea un método de instancia cualquiera en Auto.
# - Crea una instancia de Auto. Invoca mostrar()

from dataclasses import dataclass
from typing import ClassVar


@dataclass
class Vehiculo:
    modelo: ClassVar[list["modelo"]] = []
    nombre: str
    precio: float

    def __init__(self, modelo, nombre, precio):
        self.modelo.append(modelo)
        self.nombre = nombre
        self.precio = precio

    @classmethod
    def con_rebaja(cls, modelo, nombre, precio):
        precio = precio * 0.2
        return cls(modelo=modelo, nombre=nombre, precio=precio)

    def mostrar(self):
        print(f"Nombre: {self.nombre}, precio: {self.precio}")


@dataclass(kw_only=True)
class Auto(Vehiculo):
    def __init__(self, modelo, nombre, precio):
        super().__init__(modelo, nombre, precio)


auto = Vehiculo("Lamborguini", "Aventador", 15000)
auto.con_rebaja("Fitito", "Autito", 20000)
auto.mostrar()

auto2 = Auto("Ford", "Fiesta", 12000)
auto2.mostrar()
