//Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto
//bajo las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser divisible
//	por 100. Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta
//	bisiesto. Nota: recuerde la funci�n mod de PseInt

Algoritmo sin_titulo
	Definir ano, bis, bis2, bis3 Como Real
	Escribir "Ingrese un a�o para saber si es bisiesto:"
	leer ano
	
	bis = ano mod 4
	bis2 = ano mod 100
	bis3 = ano mod 400
	
	Si (bis == 0) Y (bis2 <> 0)
		Escribir "El a�o es bisiesto"
	SiNo
		si (bis2 == 0) Y (bis == 0)
			Escribir "El a�o es bisiesto"
		SiNo
			Escribir "El a�o no es bisiesto"
		FinSi
	FinSi
	
FinAlgoritmo
