from typing import Optional, TYPE_CHECKING
if TYPE_CHECKING:
    from .model_equipo import Equipo
from pydantic import condecimal
from sqlmodel import Relationship, Field, SQLModel


class Heroe(SQLModel, table=True):
    id: Optional[int] = Field(default=None, primary_key=True)
    nombre: str = Field(index=True)
    nombre_secreto: str
    edad: Optional[int] = None
    equipo_id: Optional[int] = Field(default=None, foreign_key="equipo.id")
    equipo: Optional["Equipo"] = Relationship(
        back_populates="heroe")
    dinero: condecimal(max_digits=5, decimal_places=3) = Field(default=0)