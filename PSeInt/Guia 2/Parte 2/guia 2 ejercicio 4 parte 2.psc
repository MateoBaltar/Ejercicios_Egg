//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
//una clave. S�lo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deber�
//	mostrar un mensaje indic�ndonos que hemos agotado esos 3 intentos. Si acertamos la
//	clave se deber� mostrar un mensaje que indique que se ha ingresado al sistema
//	correctamente.

Algoritmo sin_titulo
	Definir contra, palabra, palabramayus Como Caracter
	Definir intentos Como Entero
	intentos = 0
	contra = "EUREKA"
	Hacer
		Escribir Sin Saltar "Ingrese la contrase�a: "
		Leer palabra
		palabramayus = Mayusculas(palabra)
		intentos = intentos + 1
		
		Si palabramayus == contra
			Escribir "Ingreso al sistema correctamente"
		SiNo
			Si intentos == 3
				Escribir "Usaste la cantidad maxima de intentos"
			FinSi
			
		FinSi
		
	Mientras Que (palabramayus <> contra) Y (intentos < 3)
	
	
FinAlgoritmo