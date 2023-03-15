Algoritmo sin_titulo
	Definir frase, carac, ingresa Como Caracter
	Definir i, pos, espacio, antes, despues,x, contadora, contadord Como Entero
	Dimension carac(20), espacio(20)
	x = 0
	despues = 30
	
	Escribir "Ingrese una frase"
	Leer frase
	
	Para i = 0 Hasta 19 Hacer
		carac(i) = Subcadena(frase,i,i)
		Si Subcadena(frase,i,i) = " " o Subcadena(frase,i,i) == ""
			espacio(x) = i
			x = x + 1
		FinSi
	FinPara
	
	Escribir "Ingrese el caracter que desea ingresar a la frase"
	Leer ingresa
	Escribir "Ahora ingrese la posicion en la que desea ingresar el caracter"
	Leer pos
	antes = 0
	despues = 20
	para i = 0 Hasta x-1 Hacer
		Si espacio(i) < Pos
			antes = espacio(i)
		FinSi
	FinPara
	
	Para i = x-1 Hasta 0 Con Paso -1 Hacer
		Si espacio(i) < despues Y espacio(i) > antes
			despues = espacio(i)
		FinSi
	FinPara
	
	contadord = 0
	Para i = pos Hasta despues
		contadord = contadord + 1
	FinPara
	
	contadora = 0
	Para i = pos Hasta antes Con Paso -1
		contadora = contadora + 1
	FinPara
	
	Si carac(pos) == " " Entonces
		carac(pos) = ingresa
		
		Para i = 0 Hasta largo-1 Hacer
			Escribir Sin Saltar carac(i)
		FinPara
		
	SiNo
		Si contadora < contadord
			Para i = 0 Hasta pos Hacer
				carac(i) = carac(i+1)
			FinPara
			
			carac(pos) = ingresa
			
			Para i = 0 Hasta 19 Hacer
				Escribir Sin Saltar carac(i)
			FinPara
		SiNo
			
			Para i = 19 Hasta pos Con Paso -1 Hacer
				carac(i) = carac(i-1)
			FinPara
			
			carac(pos) = ingresa
			
			Para i = 0 Hasta 19 Hacer
				Escribir Sin Saltar carac(i)
			FinPara
			
		FinSi
	FinSi
	
	
FinAlgoritmo
