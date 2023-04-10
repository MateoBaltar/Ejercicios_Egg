# En un proyecto nuevo, crea tres modelos:
#
#       Cliente
# - id: (primary key)
# - apellidos: str
# - nombre: str
# - teléfono: str
# - está_vivo: bool
#
#       Producto
# - id: (primary key)
# - nombre: str
# - descripción: str
# - precio: float (2 decimales)
# - stock: int
#
#       Ventas
# - id: (primary key)
# - cliente_id (foreign key)
# - producto_id (foreign key)
# - fecha_venta: datetime
#
# Estructura el código usando la forma más simple.
# Haz pruebas con funciones, para dar de alta, baja y modificar datos, haciendo también consultas, es decir, un ABM o CRUD en inglés: create, read, update and delete.
# - Con funciones crea al menos 2 clientes y algunos productos. Cada cliente debe comprar varios productos. 
#   Mostrar las ventas del día.
# - Luego de probar que todo funciona bien, crea un programa completo, un CRUD, que permite interactuar con los 3 modelos.



from menus import menu_cliente, menu_producto, menu_ventas
from database import crear_db_y_tablas, engine

def main():
    while(True):
        print("--- MENU PRINCIPAL ---")
        print("1. Menu clientes")
        print("2. Menu productos")
        print("3. Menu ventas")
        print("4. Salir")
        opcion = input("Ingrese una opcion: ")
        if opcion == "1":
            menu_cliente(engine)
        if opcion == "2":
            menu_producto(engine)
        if opcion == "3":
            menu_ventas(engine)
        if opcion == "4":
            break

if __name__ == "__main__":
    crear_db_y_tablas()
    main()