# Crea una función llamada intermedio. Recibirá dos argumentos de tipo float. 
# Devolverá el número intermedio. El número intermedio de dos números corresponde a la suma de los dos números dividida entre 2. Documenta la función.

def intermedio(num1, num2):
    """ Recibe 2 argumentos de tipo float por parametro, luego retorna la suma de ambos divividos por 2 """
    return (num1 + num2) / 2

num1 = float(input("Ingrese el primer numero: "))
num2 = float(input("Ingrese el segundo numero: "))

print(f"El numero intermedio entre {num1} y {num2} es {intermedio(num1,num2)}")