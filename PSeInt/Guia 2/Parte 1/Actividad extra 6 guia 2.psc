//Leer tres n�meros que denoten una fecha (d�a, mes, a�o) y comprobar que sea una fecha
//v�lida. Si la fecha no es v�lida escribir un mensaje de error por pantalla. Si la fecha es
//		v�lida se debe imprimir la fecha cambiando el n�mero que representa el mes por su
//	nombre. Por ejemplo: si se introduce 1 2 2006, se deber� imprimir "1 de febrero de 2006".

Algoritmo sin_titulo
	Definir dia, mes, ano Como Entero
	Escribir "Ingrese un dia, un mes y un a�o"
	Leer dia, mes, ano
	
	Segun mes Hacer
		1: 
			Si dia <= 31 Entonces
				Escribir dia, " de enero de ", ano
			SiNo
				Escribir "La fecha no es valida"
			FinSi
		2:
			Si dia <= 28 Entonces
				Escribir dia, " de febrero de ", ano
			SiNo
				Escribir "La fecha no es valida"
			FinSi
		3:
			Si dia <= 31 Entonces
				Escribir dia, " de marzo de ", ano
			SiNo
				Escribir "La fecha no es valida"
			FinSi
		4:
			Si dia <= 30 Entonces
				Escribir dia, " de abril de ", ano
			SiNo
				Escribir "La fecha no es valida"
			FinSi
		5:
			Si dia <= 31 Entonces
				Escribir dia, " de mayo de ", ano
			SiNo
				Escribir "La fecha no es valida"
			FinSi
		6:
			Si dia <= 30 Entonces
				Escribir dia, " de junio de ", ano
			SiNo
				Escribir "La fecha no es valida"
			FinSi
		7:
			Si dia <= 31 Entonces
				Escribir dia, " de julio de ", ano
			SiNo
				Escribir "La fecha no es valida"
			FinSi
		8:
			Si dia <= 31 Entonces
				Escribir dia, " de agosto de ", ano
			SiNo
				Escribir "La fecha no es valida"
			FinSi
		9:
			Si dia <= 30 Entonces
				Escribir dia, " de septiembre de ", ano
			SiNo
				Escribir "La fecha no es valida"
			FinSi
		10:
			Si dia <= 31 Entonces
				Escribir dia, " de octubre de ", ano
			SiNo
				Escribir "La fecha no es valida"
			FinSi
		11:
			Si dia <= 30 Entonces
				Escribir dia, " de noviembre de ", ano
			SiNo
				Escribir "La fecha no es valida"
			FinSi
		12:
			Si dia <= 31 Entonces
				Escribir dia, " de diciembre de ", ano
			SiNo
				Escribir "La fecha no es valida"
			FinSi
	FinSegun
FinAlgoritmo
