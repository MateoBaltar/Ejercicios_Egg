///Escriba un programa que pida 3 notas y valide si esas notas están entre 1 y 10. Si están
///entre esos parámetros se debe poner en verdadero una variable de tipo lógico y si no
///ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la
///variable de tipo lógico.


Algoritmo sin_titulo
	Definir nota1, nota2, nota3 Como Entero
	Definir par1, par2, par3 Como Logico
	Escribir "Ingrese 3 notas entre 1 y 10"
	Leer nota1, nota2, nota3
	
	Si nota1 >= 1 y nota1 <= 10
		par1 = Verdadero
	SiNo
		par1 = Falso
	FinSi
	
	Si nota2 >= 1 y nota2 <= 10
		par2 = Verdadero
	SiNo
		par2 = Falso
	FinSi
	
	Si nota3 >= 1 y nota3 <= 10
		par3 = Verdadero
	SiNo
		par3 = Falso
	FinSi
	
	Si par1 = Verdadero Y par2 = Verdadero y par3 = Verdadero
		Escribir "Las tres notas son correctas"
	SiNo
		Escribir "Por lo menos una de las notas es incorrecta"
	FinSi
FinAlgoritmo
