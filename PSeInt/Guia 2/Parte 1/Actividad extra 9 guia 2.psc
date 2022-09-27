//Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto
//bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible
//	por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta
//	bisiesto. Nota: recuerde la función mod de PseInt

Algoritmo sin_titulo
	Definir ano, bis, bis2, bis3 Como Real
	Escribir "Ingrese un año para saber si es bisiesto:"
	leer ano
	
	bis = ano mod 4
	bis2 = ano mod 100
	bis3 = ano mod 400
	
	Si (bis == 0) Y (bis2 <> 0)
		Escribir "El año es bisiesto"
	SiNo
		si (bis2 == 0) Y (bis == 0)
			Escribir "El año es bisiesto"
		SiNo
			Escribir "El año no es bisiesto"
		FinSi
	FinSi
	
FinAlgoritmo
