from typing import Optional

class Administrador:
    password: str = "admin"

    def verificar_admin(self) -> bool:
        entrada = input("Ingrese la contraseña: ")
        if entrada == self.password:
            print("Contraseña correcta")
            return True
        else:
            print("Contraseña incorrecta ")
            return False
        

class Producto(Administrador):
    impuestos = 21.0
    lista_productos: list["Producto"] = []

    def __init__(self, codigo: int, nombre: str, precio: float, stock: Optional[int] = 0):
        self.codigo: int = codigo
        self.nombre: str = nombre
        self.precio: float = self.precio_final(precio)
        self.stock: int = stock
        if self.nombre != "":
            self.lista_productos.append(self)

    def precio_final(self, precio):
        return round((precio * (self.impuestos / 100)) + precio,2)
    
    def comprar(self, cantidad):
        print(f"Para comprar {self.nombre} se requiere acceso de administrador. Por favor ingrese la contraseña para realizar la compra")
        if not self.verificar_admin():
            print("No puede realizar esta compra")
            return

        if self in Producto.lista_productos:
            if cantidad > 0:
                self.stock += cantidad
                print(f"Comprado: {self.nombre}, cantidad: {cantidad}, stock {self.stock}")
            else:
                print("La cantidad a comprar debe ser superior a 0")
        else:
            if cantidad > 0:
                self.stock += cantidad
                Producto.lista_productos.append(self)
                print(f"Nuevo producto: {self.nombre}, cantidad: {cantidad}")
            else:
                 print("La cantidad a comprar debe ser superior a 0")
    
    def vender(self, cantidad):
        if self in self.lista_productos:
            if cantidad < 0:
                print("La cantidad a vender debe ser mayor a 0")
            elif self.stock - cantidad > 0:
                self.stock -= cantidad
                print(f"Vendido {self.nombre}, cantidad {cantidad}, stock: {self.stock}")
            elif self.stock - cantidad < 0:
                print(f"Quiere comprar {cantidad} pero solo hay {self.stock} en stock")
            elif self.stock - cantidad == 0:
                print("Se vendio lo ultimo que quedaba de stock del producto")
                Producto.lista_productos.remove(self)
            elif self.stock == 0:
                print("No hay stock del producto")
        else:
            print(f"{self.nombre} no existe, no se pudo realizar la venta.")

    # def listar_productos(self):
    #     for producto in self.lista_productos:
    #         tipo = producto.__class__.__name__
    #         print()
    #         print(f"Codigo = {producto.codigo}")
    #         print(f"Nombre = {producto.nombre}")
    #         print(f"Precio = {producto.precio}")
    #         print(f"Stock = {producto.stock}")
    #         if isinstance(producto, Cafe):
    #             print(f"Descripcion: {producto.descripcion}")
    #             print(f"Proveedor: {producto.proveedor}")
    #         elif isinstance(producto, Libro):
    #             print(f"Autor: {producto.autor}")
    #             print(f"ISBN: {producto.isbn}")

class Cafe(Producto):
    def __init__(self, codigo: int, nombre: str, precio: float, descripcion: str, proveedor: str, stock: Optional[int] = 0):
        super().__init__(codigo, nombre, precio, stock)
        self.descripcion = descripcion
        self.proveedor = proveedor

class Libro(Producto):
    def __init__(self, codigo: int, nombre: str, precio: float,autor: str, isbn: str, stock: Optional[int] = 0 ):
        super().__init__(codigo, nombre, precio, stock)
        self.autor = autor
        self.isbn = isbn