# A partir de la sección anterior, Colecciones de datos II, mejora el último ejercicio usando funciones. Solamente realiza la parte de los "artículos". 

def agregar_articulo():
    global tienda
    codigo_articulo = int(input("Ingrese el código del artículo: "))
    nombre_articulo = input("Ingrese el nombre del articulo: ")
    precio_articulo = float(input("Ingrese el precio del articulo: "))
    stock_articulo = int(input("Ingrese el stock del articulo: "))

    tienda[codigo_articulo] = {"nombre": nombre_articulo, "precio": precio_articulo, "stock": stock_articulo}


def comprar_articulo():
    global tienda
    codigo_articulo = int(input("Ingrese el código del artículo: "))
    if codigo_articulo in tienda:
        print("Usted selecciono: ", tienda[codigo_articulo])
            
        cantidad = int(input("Ingrese cuantos desea comprar: "))
        if tienda[codigo_articulo]["stock"] - cantidad < 0:
            print("No hay suficiente stock")
        else:
            tienda[codigo_articulo]["stock"] = tienda[codigo_articulo]["stock"] - cantidad
            print("Disfrute de su articulo!")
    else:
        print("El articulo no existe")


tienda = {}

while(True):
    print("---Menu---\n1) Agregar articulo al inventario \n2) Consultar articulos \n3) Comprar articulo \n4) Salir")
    eleccion = int(input("Elige una opción: "))

    if eleccion == 1:
        agregar_articulo()
        print(tienda)

    elif eleccion == 2:
        print("Lista de articulos:")
        print(tienda)

    elif eleccion == 3:
        comprar_articulo()

    elif eleccion == 4:
        break