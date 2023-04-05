from sqlalchemy import func
from sqlmodel import Session, col, or_, select
from database import engine, crear_db_y_tablas
from model_equipo import Equipo
from model_heroe import Heroe

def crear_heroes():
    with Session(engine) as session:
        preventores = Equipo(nombre="Preventores", sede="La Torre")
        fuerza_z = Equipo(nombre="Fuerza Z", sede="El Bar")
        heroe_deadpond = Heroe(nombre="Deadpond",
                        nombre_secreto="Dive",equipo=fuerza_z, dinero=1.1)
        heroe_spider_boy = Heroe(nombre="Spider-Boy",
                        nombre_secreto="Pedro",equipo=preventores, dinero=0.001)
        heroe_rusty_man = Heroe(nombre="Rusty-man", nombre_secreto="Tommy",
                        edad=48,equipo=preventores, dinero=2.2)
        heroe_4 = Heroe(nombre="Tarantula",
                        nombre_secreto="Natalia Roman-on", edad=32)
        heroe_5 = Heroe(nombre="Black Lion",
                        nombre_secreto="Trevor Challa", edad=35)
        heroe_6 = Heroe(nombre="Dr. Weird",
                        nombre_secreto="Steve Weird", edad=36)
        heroe_7 = Heroe(nombre="Captain North America",
                        nombre_secreto="Esteban Rogelios", edad=93)

        session.add(heroe_deadpond)
        session.add(heroe_spider_boy)
        session.add(heroe_rusty_man)
        session.add(heroe_4)
        session.add(heroe_5)
        session.add(heroe_6)
        session.add(heroe_7)
        session.commit()

def consultas():
    with Session(engine) as session:
        print("Muestra los registros que contengan en su nombre el guion '-' y, a su vez, edad sea null.")
        sentencia = select(Heroe).where(
            col(Heroe.nombre).contains("-"), col(Heroe.edad).is_(None))
        resultado = session.execute(sentencia)
        for heroe in resultado:
            print(heroe)

        print()
        print("Muestra los registros cuyo nombre sea mayor a 9 y edad menor a 70")
        sentencia = select(Heroe).filter(func.length(
            Heroe.nombre) > 9).where(col(Heroe.edad) < 70)
        resultado = session.execute(sentencia)
        for heroe in resultado:
            print(heroe)

        print()
        print("Muestra el registro cuyo id sea 1.")
        sentencia = select(Heroe).where(Heroe.id == 1)
        resultado = session.execute(sentencia)
        for heroe in resultado:
            print(heroe)

        print()
        print("Muestra los registros que no tengan edad o los que tengan edad mayor a 65")
        sentencia = select(Heroe).where(
            or_(col(Heroe.edad).is_(None), col(Heroe.edad) > 65))
        resultado = session.execute(sentencia)
        for heroe in resultado:
            print(heroe)

        print()
        print("Utiliza .get() como atajo para el ejercicio 3.")
        heroe = session.get(Heroe, 1)
        print(heroe)

def modificar_heroes():
    # cambiar 2 nombres y 2 edades de diferentes héroes.
    with Session(engine) as session:
        consulta = select(Heroe).where(Heroe.nombre == "Spider-Boy")
        resultado = session.exec(consulta)
        heroe = resultado.one()
        print("Héroe:", heroe)
        heroe.nombre = "Man-Spider"
        heroe.edad = 20
        session.add(heroe)
        session.commit()
        session.refresh(heroe)
        print("Héroe modificado:", heroe)

        consulta = select(Heroe).where(Heroe.nombre == "Black Lion")
        resultado = session.exec(consulta)
        heroe = resultado.one()
        print("Héroe:", heroe)
        heroe.nombre = "Dark Tiger"
        heroe.edad = 40
        session.add(heroe)
        session.commit()
        session.refresh(heroe)
        print("Héroe modificado:", heroe)


def eliminar_heroes():
    # Crea una función que elimine todos los héroes cuya edad sea NULL usando un iterador. Muestra al usuario cuáles son los id y nombres que se eliminarán. Una vez que el usuario confirme la eliminación
    with Session(engine) as session:
        consulta = select(Heroe).where(col(Heroe.edad).is_(None))
        resultado = session.execute(consulta)
        for heroe in resultado:
            print("Nombre: ", heroe[0].nombre)
            print("ID:", heroe[0].id)
            confirma = input("Quiere borrar este heroe? S/N")
            if confirma == "s" or confirma == "S":
                session.delete(heroe[0])
                session.commit()
                print("Eliminado.")
            else:
                continue

def main():
    crear_db_y_tablas()
    crear_heroes()
    # consultas()
    # modificar_heroes()
    # eliminar_heroes()


if __name__ == "__main__":
    main()