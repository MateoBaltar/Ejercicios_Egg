Algoritmo  ejercicioContraseña
	Definir intentos Como Entero
	contra<-"EUREKA"
	intentos<-0
	
	Hacer
		Escribir Sin Saltar"Ingrese la contraseña"
		Leer palabra
		intentos<-intentos + 1
		palabraMayus<-Mayusculas(palabra)
		
		Si palabraMayus == contra
			Escribir  "Ingreso al sistema correctamente"
		SiNo
			si intentos == 3
			Escribir "Usaste la cantidad maxima de intentos"
		FinSi
		
		FinSi
		
	Mientras Que palabraMayus <> contra
	
	
	
FinAlgoritmo

