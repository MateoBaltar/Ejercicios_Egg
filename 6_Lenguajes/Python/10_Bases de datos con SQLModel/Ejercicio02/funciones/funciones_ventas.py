import datetime
from sqlmodel import Session, select
from modelos import Venta, Cliente, Producto
from .funciones_cliente import buscar_clienteID, listar_clientes
from .funciones_producto import buscar_productoID, listar_productos, vender_producto

def listar_ventas(engine):
    with Session(engine) as session:
        ventas = session.query(Venta).all()
        for venta in ventas:
            cliente = buscar_clienteID(engine,venta.cliente_id)
            producto = buscar_productoID(engine,venta.producto_id)
            print()
            print(f"ID: {venta.id}")
            print(f"Nombre de cliente: {cliente.nombre}")
            print(f"Nombre del producto: {producto.nombre}")
            print(f"Fecha de realizacion: {venta.fecha_venta}")

def realizar_venta(engine):
    with Session(engine) as session:
        while(True):
            ID = int(input("Ingrese el ID de cliente, si no lo sabe ingrese 0 para la lista: "))
            if ID == 0:
                listar_clientes(engine)
            else:
                cliente = buscar_clienteID(engine,ID)
                break
        while(True):
            print(f"Cliente: {cliente.nombre}")
            ID = int(input("Ingrese el ID del producto que desea comprar, ingrese 0 para la lista: "))
            if ID == 0:
                listar_productos(engine)
            else:
                producto = buscar_productoID(engine,ID)
                break
        print(f"Producto seleccionado: {producto.nombre}")
        print(f"Precio del producto: {producto.precio}")
        print(f"Stock disponible: {producto.stock}")
        cantidad_venta = int(input("Ingrese la cantidad que desea comprar: "))
        if cantidad_venta > producto.stock:
            print("No se puede realizar la venta, no hay stock disponible")
        else:
            venta = Venta(cliente_id=cliente.id, producto_id= producto.id, fecha_venta= datetime.datetime.now())
            vender_producto(engine=engine, producto= producto, cantidad_venta= cantidad_venta)
            session.add(venta)
            session.commit()

def listar_compras_cliente(engine):
    with Session(engine) as session:
        listar_clientes(engine)
        ID = int(input("Ingrese el ID del cliente para saber sus compras: "))
        cliente = buscar_clienteID(engine,ID)
        sentencia = select(Venta).where(Venta.cliente_id == ID)
        ventas = session.execute(sentencia)
        print(f"Compras de {cliente.nombre}")
        for venta in ventas:
            producto = buscar_productoID(engine,venta[0].producto_id)
            print(f"ID de venta: {venta[0].id}")
            print(f"Producto: {producto.nombre}")
            print(f"Fecha de compra: {venta[0].fecha_venta}")

def listar_ventas_producto(engine):
    with Session(engine) as session:
        listar_productos(engine)
        ID = int(input("Ingrese el ID del producto para saber sus ventas: "))
        producto = buscar_productoID(engine,ID)
        sentencia = select(Venta).where(Venta.producto_id == ID)
        ventas = session.execute(sentencia)
        print(f"Ventas del producto {producto.nombre}")
        for venta in ventas:
            cliente = buscar_clienteID(engine,venta[0].cliente_id)
            print(f"ID de venta: {venta[0].id}")
            print(f"Cliente: {cliente.nombre}")
            print(f"Fecha de venta: {venta[0].fecha_venta}")
