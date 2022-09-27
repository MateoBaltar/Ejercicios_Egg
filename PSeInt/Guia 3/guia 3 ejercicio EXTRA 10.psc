//Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
//una cadena con un espacio adicional tras cada letra.
//Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
//dicho procedimiento.

Algoritmo sin_titulo
	Definir frase, espaciado Como Caracter
	espaciado = ""
	Escribir "Ingrese una frase"
	Leer frase
	convertirEspaciado(frase,espaciado)
	Escribir espaciado
FinAlgoritmo


SubProceso convertirEspaciado(frase Por Valor,espaciado Por Referencia)
	Definir i Como Entero
	
	Para i <- 0 Hasta Longitud(frase)
		espaciado = concatenar(espaciado, Subcadena(frase,i,i))
		espaciado = Concatenar(espaciado, " ")
	FinPara
	
	
	
FinSubProceso
