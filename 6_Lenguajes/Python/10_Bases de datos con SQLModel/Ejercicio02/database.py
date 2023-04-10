from sqlalchemy.sql.expression import func
from sqlmodel import SQLModel, Session, col, create_engine, or_, select


sqlite_nombre = "ejercicio2.db"
sqlite_url = f"sqlite:///{sqlite_nombre}"
engine = create_engine(sqlite_url, echo=False)


def crear_db_y_tablas():
    SQLModel.metadata.create_all(engine)
