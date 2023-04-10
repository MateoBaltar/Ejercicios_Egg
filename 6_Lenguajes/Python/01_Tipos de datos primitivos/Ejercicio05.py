# Preguntar al usuario cuántas horas trabaja y cuánto le pagan por hora. Mostrar el salario que le corresponde por 20 días hábiles de trabajo. 
# Utiliza el nombre de las variables según el estilo aconsejado.

horas_trabajadas = int(input("Ingrese cuantas horas trabaja: "))
salario_por_hora = float(input("Ingrese el salario por hora: "))

salario_correspondiente = (horas_trabajadas * 20) * salario_por_hora

print(f"A usted le corresponden ${salario_correspondiente} por 20 dias de trabajo")