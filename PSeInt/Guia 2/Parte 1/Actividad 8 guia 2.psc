///Continuando el ejercicio anterior, ahora se pedir� una frase o palabra y se validara si la
///primera letra de la frase es igual a la �ltima letra de la frase. Se deber� de imprimir un
///mensaje por pantalla que diga "CORRECTO", en caso contrario, se deber� imprimir
///"INCORRECTO".
	
Algoritmo sin_titulo
	Definir frase, frasemayus Como Caracter
	Definir num Como Entero
	Escribir "Ingrese una frase o palabra"
	leer frase
	num = Longitud(frase)
	
	Si Subcadena(frase,0,0) == Subcadena(frase,num-1,num-1)
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
			
	FinSi
	
FinAlgoritmo
