///Realizar un programa que pida un n�mero y determine si ese n�mero es par o impar.
///Mostrar en pantalla un mensaje que indique si el n�mero es par o impar. (para que un
///n�mero sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar
///la funci�n mod de PseInt.

Algoritmo sin_titulo
	Definir num, num2 Como Entero
	Escribir "Ingrese un numero para saber si es par o impar"
	leer num
	
	num2 = num mod 2
	
	Si num2 == 0
		Escribir "El numero es par"
	SiNo
		Escribir "El numero es impar"
	FinSi
FinAlgoritmo
