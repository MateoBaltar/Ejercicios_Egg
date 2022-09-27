//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//capic�a o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
//		transformar el numero a cadena para realizar el ejercicio.

Algoritmo sin_titulo
	Definir num Como Entero
	Escribir "Ingrese un n�mero para saber si es capic�a"
	Leer num
	
	Escribir "El n�mero ingresado es capic�a: ", capicua(num)
FinAlgoritmo

Funcion VoF <- capicua(num)
	Definir a,b,c,d Como Entero
	Definir VoF Como Logico
	
	Si num <= 99
		a = trunc(num/10)
		b = num mod 10
		Si a == b
			VoF = Verdadero
		FinSi
	FinSi
	
	Si num >= 100 Y num <= 999
		a = trunc(num/100)
		b = num mod 10
		Si a == b Entonces
			VoF = Verdadero
		FinSi
	FinSi
	
	Si num >= 1000 Y num <= 9999
		a = trunc(num/1000)
		d = num mod 10
		b = trunc(num/100) mod 10
		c = trunc((num mod 100) / 10)
		Si a == d y b == c Entonces
			VoF = Verdadero
		FinSi
	FinSi
	
FinFuncion
