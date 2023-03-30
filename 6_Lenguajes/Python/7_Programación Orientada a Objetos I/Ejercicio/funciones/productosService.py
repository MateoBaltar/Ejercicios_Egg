from clases import Producto, Cafe, Libro


def listar_productos():
    productos = Producto(0, "", 0)
    for producto in productos.lista_productos:
        tipo = producto.__class__.__name__
        print()
        print(f"Codigo = {producto.codigo}")
        print(f"Nombre = {producto.nombre}")
        print(f"Precio = {producto.precio}")
        print(f"Stock = {producto.stock}")
        if isinstance(producto, Cafe):
            print(f"Descripcion: {producto.descripcion}")
            print(f"Proveedor: {producto.proveedor}")
        elif isinstance(producto, Libro):
            print(f"Autor: {producto.autor}")
            print(f"ISBN: {producto.isbn}")


def registrar_producto():
    try:
        print("--- Tipos de productos ---")
        print("1. Producto comun")
        print("2. Cafe")
        print("3. Libro")
        eleccion = int(
            input("Indique el tipo de producto que desea registrar: "))

        codigo = int(input("Ingrese el codigo numerico del producto: "))
        nombre = input("Ingrese el nombre del producto: ")
        precio = float(input("Ingrese el precio del producto: "))
        stock = int(input("Ingrese el stock del producto (Opcional): "))

        if eleccion == 1:
            producto = Producto(codigo, nombre, precio, stock)
        elif eleccion == 2:
            descripcion = input("Ingrese la descripcion del cafe")
            proveedor = input("Ingrese el proveedor del cafe: ")
            producto = Cafe(codigo, nombre, precio, descripcion, proveedor, stock)
        elif eleccion == 3:
            autor = input("Ingrese el autor del libro")
            isbn = input("Ingree el ISBN del libro")
            producto = Libro(codigo, nombre, precio, autor, isbn, stock)
    except ValueError:
        print("Error: El valor ingresado no es valido")


def buscar_producto_codigo(codigo):
    productos = Producto(0, "", 0)
    for producto in productos.lista_productos:
        if producto.codigo == codigo:
            return producto


def comprar_producto():
    print("--- Lista de productos ---")
    listar_productos()
    codigo = int(
        input("Ingrese el codigo del producto que desea comprar stock"))
    producto = buscar_producto_codigo(codigo)
    if producto is not None:
        print(f"Producto: {producto.nombre}")
        print(f"Stock: {producto.stock}")
        cantidad = int(input("Ingrese la cantidad que desea comprar"))
        producto.comprar(cantidad)


def vender_producto():
    print("--- Lista de productos ---")
    listar_productos()
    codigo = int(input("Ingrese el codigo del producto que desea vender"))
    producto = buscar_producto_codigo(codigo)
    if producto is not None:
        print(f"Producto: {producto.nombre}")
        print(f"Stock: {producto.stock}")
        cantidad = int(input("Ingrese la cantidad que desea vender"))
        producto.vender(cantidad)
