///Escriba un programa para obtener el grado de eficiencia de un operario de una fábrica de
///tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un período
///de prueba:
///? Producir menos de 200 tornillos defectuosos.
///? Producir más de 10000 tornillos sin defectos.
///? El grado de eficiencia se determina de la siguiente manera:
/// Si no cumple ninguna de las condiciones, grado 5.
///? Si sólo cumple la primera condición, grado 6.
///? Si sólo cumple la segunda condición, grado 7.
///? Si cumple las dos condiciones, grado 8
///Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el
///	ejercicio. No hacer todos al mismo tiempo y después probar.

Algoritmo sin_titulo
	Definir eficiencia, def, ok Como Entero
	Escribir Sin Saltar "Ingrese la cantidad de tornillos con defectos: "
	leer def
	Escribir Sin Saltar "Ingree la cantidad de tornillos sin defectos: "
	leer ok	
	
	Si def > 200 y ok < 10000
		Escribir "Su grado de eficiencia es de 5"
	SiNo
		Si def < 200 y ok < 10000
			Escribir "Su grado de eficiencia es de 6"
		SiNo
			Si def > 200 y ok > 10000
				Escribir "Su grado de eficiencia es de 7"
			SiNo
				Si def < 200 Y ok > 10000
					Escribir "Su grado de eficiencia es de 8"
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
