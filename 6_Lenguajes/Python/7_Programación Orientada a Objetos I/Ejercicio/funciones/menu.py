from .productosService import listar_productos, registrar_producto, comprar_producto, vender_producto

def menu_opciones():
    while(True):
        print("--- MENU ---")
        print("1. Listar productos")
        print("2. Registrar producto")
        print("3. Comprar stock de producto")
        print("4. Vender producto")
        print("5. Salir")
        eleccion = int(input("Ingrese lo que desea hacer: "))

        if eleccion == 1:
            listar_productos()
        elif eleccion == 2:
            registrar_producto()
        elif eleccion == 3:
            comprar_producto()
        elif eleccion == 4:
            vender_producto()
        elif eleccion == 5:
            break
