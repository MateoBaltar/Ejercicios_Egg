from sqlmodel import Session
from modelos import Producto

def vender_producto(engine, producto, cantidad_venta):
    with Session(engine) as session:
        producto.stock = producto.stock - cantidad_venta
        session.add(producto)
        session.commit()

def buscar_productoID(engine, id):
    with Session(engine) as session:
        cliente = session.query(Producto).filter(Producto.id == id).one()
        return cliente


def listar_productos(engine):
    with Session(engine) as session:
        productos = session.query(Producto).all()
        for producto in productos:
            print()
            print(f"ID: {producto.id}")
            print(f"Nombre: {producto.nombre}")
            print(f"Descripcion: {producto.descripcion}")
            print(f"Precio: {producto.precio}")
            print(f"Stock: {producto.stock}")


def crear_producto(engine):
    with Session(engine) as session:
        while (True):
            nombre = input("Nombre: ")
            descripcion = input("Descripcion del producto: ")
            precio = float(input("Precio: "))
            stock = int(input("Stock (Puede ser 0): "))
            if nombre == "" or descripcion == "" or precio == 0:
                print("Error: Debe introducir un nombre, una descripcion y un precio")
            else:
                producto = Producto(
                    nombre=nombre, descripcion=descripcion, precio=precio, stock=stock)
                session.add(producto)
                session.commit()
                print("Producto creado")
                break


def modificar_producto(engine):
    with Session(engine) as session:
        while (True):
            listar_productos(engine)
            id = int(
                input("Ingrese el ID del producto que desea modificar, o ingrese 0 para salir: "))
            if id == 0:
                break
            producto = buscar_productoID(engine, id)

            nombre = input("Nuevo nombre (dejar vacio para no modificar): ")
            descripcion = input(
                "Nueva descripcion (dejar vacio para no modificar): ")
            precio = input("Nuevo precio (dejar vacio para no modificar): ")
            stock = input("Nuevo stock (dejar vacio para no modificar): ")
            if nombre != "":
                producto.nombre = nombre
            if descripcion != "":
                producto.descripcion = descripcion
            if precio != "":
                producto.precio = int(precio)
            if stock != "":
                producto.stock = int(stock)
            session.add(producto)
            session.commit()


def eliminar_producto(engine):
    with Session(engine) as session:
        listar_productos(engine)
        id = int(input("Ingrese el ID del producto que desea eliminar: "))
        producto = buscar_productoID(engine, id)
        session.delete(producto)
        session.commit()
        print("Producto eliminado")
