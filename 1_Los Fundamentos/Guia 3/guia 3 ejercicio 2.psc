//Realizar una función que valide si un número es impar o no. Si es impar la función debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener
//		mensajes que digan si es par o no, eso debe pasar en el Algoritmo.


Algoritmo error
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	Escribir Paridad(num)
FinAlgoritmo


Funcion retorno <- Paridad ( num )
	Definir retorno Como logico
	retorno = num mod 2 <> 0
Fin Funcion
