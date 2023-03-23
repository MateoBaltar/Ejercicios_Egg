# Pedir al usuario su peso en kilogramos y su altura en metros. Calcular el índice de masa corporal y guardarla en una variable. 
# Mostrar: "Tu índice de masa corporal es <imc>" donde <imc> es el índice de masa corporal calculado. Redondear con dos decimales usando f-string.

peso = int(input("Ingrese su peso en kilogramos: "))
altura = float(input("Ingrese su altura en metros: "))

indice_masa_corporal = peso / (altura ** 2)

print(f"\nTu índice de masa corporal es {round(indice_masa_corporal, 2)}")