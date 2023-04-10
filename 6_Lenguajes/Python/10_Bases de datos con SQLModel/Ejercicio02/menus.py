from funciones import listar_clientes, modificar_cliente, crear_cliente, eliminar_cliente, listar_productos, modificar_producto, crear_producto, eliminar_producto, realizar_venta, listar_ventas, listar_compras_cliente, listar_ventas_producto


def menu_cliente(engine):
    while (True):
        print("--- MENU CLIENTES ---")
        print("1. Listar clientes")
        print("2. Crear cliente")
        print("3. Modificar cliente")
        print("4. Eliminar cliente")
        print("5. Salir")
        opcion = input("Ingrese una opcion: ")
        if opcion == "1":
            listar_clientes(engine)
        elif opcion == "2":
            crear_cliente(engine)
        elif opcion == "3":
            modificar_cliente(engine)
        elif opcion == "4":
            eliminar_cliente(engine)
        elif opcion == "5":
            print("Gracias por utilizar nuestro sistema")
            break


def menu_producto(engine):
    while (True):
        print("--- MENU PRODUCTOS ---")
        print("1. Listar productos")
        print("2. Crear producto")
        print("3. Modificar producto")
        print("4. Eliminar producto")
        print("5. Salir")
        opcion = input("Ingrese una opcion: ")
        if opcion == "1":
            listar_productos(engine)
        elif opcion == "2":
            crear_producto(engine)
        elif opcion == "3":
            modificar_producto(engine)
        elif opcion == "4":
            eliminar_producto(engine)
        elif opcion == "5":
            print("Gracias por utilizar nuestro sistema")
            break


def menu_ventas(engine):
    while (True):
        print("--- MENU VENTAS ---")
        print("1. Listar ventas")
        print("2. Hacer venta")
        print("3. Ver compras de cliente")
        print("4. Ver ventas de producto")
        print("5. Salir")
        opcion = input("Ingrese una opcion: ")
        if opcion == "1":
            listar_ventas(engine)
        elif opcion == "2":
            realizar_venta(engine)
        elif opcion == "3":
            listar_compras_cliente(engine)
        elif opcion == "4":
            listar_ventas_producto(engine)
        elif opcion == "5":
            print("Gracias por utilizar nuestro sistema")
            break
