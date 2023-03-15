//Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
//entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000.
//Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las
//llantas que compra, y el monto total que tiene que pagar por el total de la compra.

Algoritmo sin_titulo
	Definir llantas, total Como Entero
	Escribir "Ingrese el total de llantas que compró:"
	leer llantas
	
	Si llantas < 5 Entonces
		total = 3000 * llantas
		Escribir "El total a pagar es de: ", total, ". Paga $3000 por llanta."
	SiNo
		Si (llantas >= 5) Y (llantas <= 10)
			total = 2500 * llantas
			Escribir "El total a pagar es de: ", total, ". Paga $2500 por llanta."
		SiNo
			Si (llantas > 10)
				total = 2000 * llantas
				Escribir "El total a pagar es de: ", total, ". Paga $2000 por llanta."
			FinSi
		FinSi
	FinSi
FinAlgoritmo
