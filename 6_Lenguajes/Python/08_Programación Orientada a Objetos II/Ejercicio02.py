# Continuando el ejercicio anterior, crea un método estático en Vehículo que sirva para validar que el precio ingresado sea mayor a 1000 y menor a 10.000.

from dataclasses import dataclass
from typing import ClassVar


@dataclass
class Vehiculo:
    modelo: ClassVar[list["modelo"]] = []
    nombre: str
    precio: float

    def __init__(self, modelo, nombre, precio):
        if precio < 1000 or precio > 10000:
            raise ValueError("El precio debe ser mayor a 1000 y menor a 10.000")
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
