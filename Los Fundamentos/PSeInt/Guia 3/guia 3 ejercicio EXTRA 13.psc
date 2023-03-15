Algoritmo sin_titulo
	Definir frase, frase2 Como caracter
	frase2 = ""
	Escribir "Ingrese una frase"
	Leer frase
	
	removedor(frase, frase2)
	
	Escribir frase2
	
FinAlgoritmo

SubProceso removedor(frase Por Valor, frase2 Por Referencia)
	Definir n, a,e,i,p,u Como Entero
	a = 0
	e = 0
	i = 0
	p = 0
	u = 0
	Para n = 0 Hasta Longitud(frase)
		Segun Subcadena(frase,n,n) Hacer
			"A" o "a": Si a == 0 Entonces
					frase2 = Concatenar(frase2,Subcadena(frase,n,n))
					a = a + 1
				SiNo
					frase2 = Concatenar(frase2,"")
				FinSi
				
			"E" o "e": Si e == 0 Entonces
				frase2 = Concatenar(frase2,Subcadena(frase,n,n))
				e = e + 1
			SiNo
				frase2 = Concatenar(frase2,"")
			FinSi
				
			"I" o "i": Si i == 0 Entonces
				frase2 = Concatenar(frase2,Subcadena(frase,n,n))
				i = i + 1
			SiNo
				frase2 = Concatenar(frase2,"")
			FinSi
				
			"O" o "o": Si p == 0 Entonces
				frase2 = Concatenar(frase2,Subcadena(frase,n,n))
				p = p + 1
			SiNo
				frase2 = Concatenar(frase2,"")
			FinSi
				
			"U" o "u": Si u == 0 Entonces
					frase2 = Concatenar(frase2,Subcadena(frase,n,n))
					u = u + 1
				SiNo
					frase2 = Concatenar(frase2,"")
				FinSi
			De Otro Modo:
				frase2 = Concatenar(frase2,Subcadena(frase,n,n))
		FinSegun
		
	FinPara
	
FinSubProceso
