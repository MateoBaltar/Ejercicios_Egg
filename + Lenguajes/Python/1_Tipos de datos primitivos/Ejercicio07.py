# Realizar el siguiente ejercicio, y después ver el video:
# Dadas las siguientes expresiones:
# False == True
# >= 2 * 4
# 33 / 3 == 11
# True > False
# True * 5 == 2.5 * 2
# Crea un programa que utilice la misma cantidad de variables según la cantidad de expresiones, las cuales serán evaluadas en una nueva variable. 
# Mostrar por pantalla. (En la última variable utiliza los paréntesis para encerrar las expresiones, y puedes separarlas con la coma.)

expresion_1 = False == True
expresion_2 = 10 >= 2 * 4
expresion_3 = 33 / 3 == 11
expresion_4 = True > False
expresion_5 = True * 5 == 2.5 * 2

expresiones = (expresion_1, expresion_2, expresion_3, expresion_4, expresion_5)

print(expresiones)