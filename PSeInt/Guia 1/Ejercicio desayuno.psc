///Es tu turno, dise�a un condicional anidado que le pregunte al usuario si quiere tomar t� o caf� y
///en caso de que quiera tomar caf�, preguntar si solo o cortado y en caso de ser cortado, si prefiere
///leche vegetal.

Algoritmo sin_titulo
	Definir bebida, tipo, leche Como Caracter
	Escribir "Que prefiere tomar, t� o caf�?"
	Leer bebida
	
	Si	bebida == "caf�" Entonces
		Escribir "Lo quiere solo o cortado?"
		Leer tipo
		Si tipo == "cortado" Entonces
			Escribir "Lo prefiere con leche vegetal?"
			Leer leche
			Si leche == "si" Entonces
				Escribir "Disfrute su caf� cortado con leche vegetal"
			SiNo
				Si leche == "no" Entonces
					Escribir "Disfrute su caf� cortado con leche animal"
				FinSi
				
				FinSi
		SiNo
			Si tipo == "solo" Entonces
				Escribir "Disfrute su caf� solo"
			FinSi
		FinSi
			
		SiNo
			Si bebida == "t�" Entonces
				Escribir "Disfrute su t�"
			SiNo
				Escribir "No es una bebida disponible"
		FinSi
	FinSi
	
FinAlgoritmo
