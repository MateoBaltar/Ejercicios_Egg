# modelo producto con los siguientes atributos:
# id: (primary key)
# nombre: str
# descripción: str
# precio: float (2 decimales)
# stock: int



from typing import Optional
from sqlmodel import Field, SQLModel


class Producto(SQLModel, table=True):
    id: Optional[int] = Field(default=None, primary_key=True)
    nombre: str
    descripcion: str
    precio: float
    stock: int = Field(default=0)

