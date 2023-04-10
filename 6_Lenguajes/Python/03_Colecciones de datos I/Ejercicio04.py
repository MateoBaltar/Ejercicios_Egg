# Escribir un programa que pregunte al usuario cuántas tareas quiere anotar. Ir agregando cada tarea que el usuario vaya ingresando a una colección. 
# Mostrar por pantalla la lista de tareas en orden alfabético.
tareas = []
cantidad_tareas = int(input("Ingrese cuantas tareas desea anotar: "))

for x in range(cantidad_tareas):
    tarea = input("Ingrese la tarea " + str(x+1) + ": ")
    tareas.append(tarea)
    
tareas.sort()
print(tareas)