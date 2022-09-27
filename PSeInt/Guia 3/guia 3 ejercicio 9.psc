// Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
// terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
//	cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
//	(incluyendo a las vocales acentuadas) se mantienen sin cambios.
//           							a e i o u
//										@ # $ % *
// Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
// correspondiente. Utilice la estructura "según" para la transformación.
// Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//	La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//	NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.
Algoritmo sin_titulo
	Definir frase, codigo Como Caracter
	Escribir "Ingrese una frase"
	leer frase
	codificador(frase,codigo)
	Escribir "La frase codificada es: ", codigo
	
FinAlgoritmo

SubProceso codificador(frase Por Valor, codigo Por Referencia)
	Definir i, carac Como Entero
	carac = Longitud(frase)
	codigo = ""
	para i <- 0 Hasta carac Hacer
		Segun Subcadena(frase,i,i)
			"A" o "a": codigo = Concatenar(codigo,"@")
				
			"E" o "e": codigo = Concatenar(codigo,"#")
				
			"I" o "i": codigo = Concatenar(codigo,"$")
				
			"O" o "o": codigo = Concatenar(codigo,"%")
				
			"U" o "u": codigo = Concatenar(codigo,"*")
			De Otro Modo:
				codigo = Concatenar(codigo,Subcadena(frase,i,i))
		FinSegun
	FinPara
	
FinSubProceso
	