Algoritmo error
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	Escribir Paridad(num)
FinAlgoritmo


Funcion retorno <- Paridad ( num )
	Definir retorno Como caracter
	Si num MOD 2 == 0
		Escribir "El numero es par"
	SiNo
		Escribir "El numero no es par"
	FinSi
Fin Funcion