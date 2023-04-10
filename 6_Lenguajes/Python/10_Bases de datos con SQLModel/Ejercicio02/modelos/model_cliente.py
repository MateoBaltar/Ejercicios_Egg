# Modelo cliente con los siguientes atributos:
# id: (primary key)
# apellidos: str
# nombre: str
# teléfono: str
# está_vivo: bool

from typing import Optional
from sqlmodel import Field, SQLModel


class Cliente(SQLModel, table=True):
    id: Optional[int] = Field(default=None, primary_key=True)
    nombre: str
    telefono: str
    esta_vivo: bool