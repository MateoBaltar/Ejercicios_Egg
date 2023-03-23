//Diseña un programa que guarde una vocal secreta en una variable, debemos pedirle al usuario
//que intente adivinar la vocal secreta, e intentará tantas veces como sea necesario hasta que la
//adivine.

Algoritmo sin_titulo
	Definir vocal, intento Como Caracter
	
	vocal = "i" 
	
	Escribir "Intente adivinar la vocal secreta"
	Leer intento
	
	Mientras intento <> vocal
		Escribir "Intente adivinar nuevamente"
		Leer intento
	FinMientras
	
	Escribir "Adivino correctamente."
	
FinAlgoritmo
