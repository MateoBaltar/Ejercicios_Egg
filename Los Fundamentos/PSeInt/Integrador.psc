Algoritmo sin_titulo
	Definir i, j, n, m, x, diagonal, diagonal2 Como Entero
	Definir matriz, frase Como Caracter
	Definir valido Como logico
	x = 0
	diagonal = 0
	diagonal2 = 0
	Hacer
		valido = Verdadero
		Escribir "Ingrese una secuencia de caracteres: "
		Leer frase
		Si Longitud(frase) <> 9 Y Longitud(frase) <> 16 Y Longitud(frase) <> 1369
			valido = Falso
		FinSi
		Para i = 0 Hasta Longitud(frase)-1
			Si Subcadena(frase,i,i) <> "A" Y Subcadena(frase,i,i) <> "B" Y Subcadena(frase,i,i) <> "C" Y Subcadena(frase,i,i) <> "D"
				valido = Falso
			FinSi
		FinPara
		Si valido = Falso
			Escribir "La secuencia introducida no es valida, intente nuevamente"
		FinSi
	Mientras Que valido <> Verdadero
	
	Si Longitud(frase) = 9
		m = 3
		n = 3
	SiNo
		Si Longitud(frase) = 16
			m = 4
			n = 4
		SiNo
			Si Longitud(frase) = 1369
				m = 37
				n = 37
			FinSi
		FinSi
	FinSi
	
	Dimension matriz(m,n)
	llenar(matriz, frase,m,n)
	verificar(matriz, diagonal, diagonal2, n, m,x)
	Para i = 0 Hasta m-1
		Para j = 0 Hasta n-1
			Escribir Sin Saltar matriz(i,j), " "
		FinPara
		Escribir ""
	FinPara
	
	Si diagonal == M Y diagonal2 == N
		Escribir "Se ha detectado el gen Z"
	SiNo
		Escribir "No se ha detectado el gen Z"
	FinSi
	
FinAlgoritmo


SubProceso llenar(matriz Por Referencia, frase Por Valor,m Por Valor, n Por Valor)
	Definir i, j, x Como Entero
	x = 0
	Para i = 0 Hasta m-1
		Para j = 0 Hasta n-1
			matriz(i,j) = Subcadena(frase,x,x)
			x = x + 1
		FinPara
	FinPara
FinSubProceso

SubProceso verificar(matriz Por Referencia, diagonal Por Referencia, diagonal2 Por Referencia,n Por Valor, m Por Valor, x Por Referencia)
	Definir i, j Como Entero
	x = n-1
	Para i = 0 Hasta m-1
		Para j = 0 Hasta n-1
			Si i == j Entonces
				Si matriz(i,j) == matriz(0,0)
					diagonal = diagonal + 1
				FinSi
			FinSi
		FinPara
	FinPara
	
	Para i = 0 Hasta m-1
		Para j = 0 Hasta n-1
			Si j == x Entonces
				Si matriz(i,j) == matriz(0,n-1)
					diagonal2 = diagonal2 + 1
					x = x - 1
				FinSi
			FinSi
		FinPara
	FinPara
	
FinSubProceso
	