# A partir del siguiente diccionario: 
# {"Euro": "€", "Dólar": "$", "Yen": "¥"}
# Preguntar al usuario por una moneda, y luego mostrar su símbolo, o un mensaje si la moda no está en el diccionario.

monedas = {"Euro": "€", "Dólar": "$", "Yen": "¥"}

while(True):
    pregunta = input("Ingrese una moneda (o 0 para salir): ")
    if pregunta == "0":
        break
    else:
        if pregunta in monedas:
            print(monedas[pregunta])
        else:
            print("Esa moneda no está en el diccionario")