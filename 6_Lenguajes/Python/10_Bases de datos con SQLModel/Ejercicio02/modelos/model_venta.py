# modelo ventas con los siguientes atributos:
# id: (primary key)
# cliente_id (foreign key)
# producto_id (foreign key)
# fecha_venta: datetime

import datetime
from typing import Optional
from sqlmodel import Field, SQLModel


class Venta(SQLModel, table=True):
    id: Optional[int] = Field(default=None, primary_key=True)
    cliente_id: Optional[int] = Field(default=None, foreign_key="cliente.id")
    producto_id: Optional[int] = Field(default=None, foreign_key="producto.id")
    fecha_venta: datetime.datetime