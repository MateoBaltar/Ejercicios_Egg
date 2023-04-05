from typing import Optional, TYPE_CHECKING
if TYPE_CHECKING:
    from model_heroe import Heroe
from sqlmodel import Field, Relationship, SQLModel

class Equipo(SQLModel, table=True):
    id: Optional[int] = Field(default=None, primary_key=True)
    nombre: str
    sede: str
    heroe: Optional["Heroe"] = Relationship(
        back_populates="equipo")