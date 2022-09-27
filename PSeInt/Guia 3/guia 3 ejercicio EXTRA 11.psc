//	Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
//	letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a través del Código
//	Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.

Algoritmo sin_titulo
	Definir letra Como Caracter
	Definir VoF Como Logico
	Escribir "Ingrese una letra"
	Leer letra
	verificar(letra,VoF)
	Escribir VoF
FinAlgoritmo

SubProceso verificar(letra Por Valor, VoF Por Referencia)
	Definir letran, minuscula Como Entero
	Definir codigo Como Caracter
	Dimension minuscula[26]
	
	Segun letra hacer	
		"a":	letran = 97
		"b":	letran = 98
		"c":	letran = 99
		"d":	letran = 100
		"e":	letran = 101
		"f":	letran = 102
		"g":	letran = 103
		"h":	letran = 105
		"i":	letran = 106
		"j":	letran = 107
		"k":	letran = 108
		"l":	letran = 19
		"m":	letran = 110
		"n":	letran = 111
		"o":	letran = 112
		"p":	letran = 113
		"q":	letran = 14
		"r":	letran = 115
		"s":	letran = 116
		"t":	letran = 117
		"u":	letran = 118
		"v":	letran = 119
		"w":	letran = 120
		"x":	letran = 121
		"y":	letran = 122
	FinSegun
	
	Si letran >= 110 Y letran <= 117
		VoF = Verdadero
	SiNo
		VoF = Falso
	FinSi
	
	
	
	
FinSubProceso
	