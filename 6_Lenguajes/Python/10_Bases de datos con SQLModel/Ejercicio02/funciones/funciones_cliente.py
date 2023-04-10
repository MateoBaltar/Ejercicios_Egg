from sqlmodel import Session
from modelos import Cliente


def buscar_clienteID(engine, id):
    with Session(engine) as session:
        cliente = session.query(Cliente).filter(Cliente.id == id).one()
        return cliente


def listar_clientes(engine):
    with Session(engine) as session:
        clientes = session.query(Cliente).all()
        for cliente in clientes:
            print()
            print(f"ID: {cliente.id}")
            print(f"Nombre: {cliente.nombre}")
            print(f"Telefono: {cliente.telefono}")
            print(f"Esta con vida: {cliente.esta_vivo}")


def crear_cliente(engine):
    with Session(engine) as session:
        while (True):
            nombre = input("Nombre: ")
            telefono = input("Telefono: ")
            if nombre == "" or telefono == "":
                print("Error: Debe introducir un nombre y un telefono")
            else:
                cliente = Cliente(
                    nombre=nombre, telefono=telefono, esta_vivo=True)
                session.add(cliente)
                session.commit()
                print("Cliente creado")
                break


def modificar_cliente(engine):
    with Session(engine) as session:
        while (True):
            listar_clientes(engine)
            id = int(
                input("Ingrese el ID del cliente que desea modificar, o ingrese 0 para salir: "))
            if id == 0:
                break
            cliente = buscar_clienteID(engine, id)
            nombre = input("Nuevo nombre (dejar vacio para no modificar): ")
            telefono = input("Nuevo telefono (dejar vacio para no modificar): ")
            if nombre != "":
                cliente.nombre = nombre
            if telefono !="":
                cliente.telefono = telefono
            estado = input("Sigue vivo este cliente? Si/No: ")
            if estado == "Si" or estado == "si":
                cliente.esta_vivo = True
            else:
                cliente.esta_vivo = False
            session.add(cliente)
            session.commit()


def eliminar_cliente(engine):
    with Session(engine) as session:
        listar_clientes(engine)
        id = int(input("Ingrese el ID del cliente que desea eliminar: "))
        cliente = buscar_clienteID(engine, id)
        session.delete(cliente)
        session.commit()
        print("Cliente eliminado")
