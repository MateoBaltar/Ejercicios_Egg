# Crear una lista de países en letras minúsculas. 
# Luego, por medio de la comprensión de listas, crear una nueva lista con las mismas cadenas, cuya primera letra sea en mayúsculas.

paises_minuscula = ["argentina", "peru", "chile", "estados unidos", "uruguay", "canada", "brasil"]
paises_cased = []
for x in paises_minuscula:
    paises_cased.append(x.capitalize())

print("Paises en minuscula:\n", paises_minuscula)
print("\nPaises con mayúscula:\n", paises_cased)