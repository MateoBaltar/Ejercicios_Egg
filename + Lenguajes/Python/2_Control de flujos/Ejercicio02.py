#Crear un bucle que sume los pares del 0 al 100.

total = 0

for i in range (101):
    if i % 2 == 0:
        total += i

print(total)