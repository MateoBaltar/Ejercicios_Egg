///Es tu turno, diseña un condicional anidado que le pregunte al usuario si quiere tomar té o café y
///en caso de que quiera tomar café, preguntar si solo o cortado y en caso de ser cortado, si prefiere
///leche vegetal.

Algoritmo sin_titulo
	Definir bebida, tipo, leche Como Caracter
	Escribir "Que prefiere tomar, té o café?"
	Leer bebida
	
	Si	bebida == "café" Entonces
		Escribir "Lo quiere solo o cortado?"
		Leer tipo
		Si tipo == "cortado" Entonces
			Escribir "Lo prefiere con leche vegetal?"
			Leer leche
			Si leche == "si" Entonces
				Escribir "Disfrute su café cortado con leche vegetal"
			SiNo
				Si leche == "no" Entonces
					Escribir "Disfrute su café cortado con leche animal"
				FinSi
				
				FinSi
		SiNo
			Si tipo == "solo" Entonces
				Escribir "Disfrute su café solo"
			FinSi
		FinSi
			
		SiNo
			Si bebida == "té" Entonces
				Escribir "Disfrute su té"
			SiNo
				Escribir "No es una bebida disponible"
		FinSi
	FinSi
	
FinAlgoritmo
