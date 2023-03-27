# Realizar el siguiente ejercicio, y después ver el video:
# Crear un diccionario con la siguiente estructura: 
# {
#     "artículo": {
#         int: {"nombre": str, "precio": float, "stock": int},
#     }
# }
# El programa permitirá cargar artículos. La clave <int> del diccionario anidado, corresponde al código de un artículo. 
# Cada vez que se añada un nuevo dato, debe imprimirse el contenido del diccionario.
# Crear varios artículos y simular una venta. Informar si no hay stock y el precio final de la compra.

tienda = {"articulo": {

}}

while(True):
    print("---Menu---\n1) Agregar articulo al inventario \n2) Consultar articulos \n3) Comprar articulo \n4) Salir")
    eleccion = int(input("Elige una opción: "))

    if eleccion == 1:
        codigo_articulo = int(input("Ingrese el código del artículo: "))
        nombre_articulo = input("Ingrese el nombre del articulo: ")
        precio_articulo = float(input("Ingrese el precio del articulo: "))
        stock_articulo = int(input("Ingrese el stock del articulo: "))

        tienda["articulo"][codigo_articulo] = {"nombre": nombre_articulo, "precio": precio_articulo, "stock": stock_articulo}
        print(tienda)

    elif eleccion == 2:
        print("Lista de articulos:")
        for key, value in tienda["articulo"].items():
            print(key, value)

    elif eleccion == 3:
        codigo_articulo = int(input("Ingrese el código del artículo: "))
        if codigo_articulo in tienda["articulo"]:
            print("Usted selecciono: ", tienda["articulo"][codigo_articulo])
            
            cantidad = int(input("Ingrese cuantos desea comprar: "))
            if tienda["articulo"][codigo_articulo]["stock"] - cantidad < 0:
                print("No hay suficiente stock")
            else:
                tienda["articulo"][codigo_articulo]["stock"] = tienda["articulo"][codigo_articulo]["stock"] - cantidad
                print("Disfrute de su articulo!")
        else:
            print("El articulo no existe")

    elif eleccion == 4:
        break