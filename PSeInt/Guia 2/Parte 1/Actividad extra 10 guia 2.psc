//Una verdulería ofrece las manzanas con descuento según la siguiente tabla:
//	No DE KILOS COMPRADOS % DESCUENTO
//			0 - 2     		 0%
//			2.01 - 5		10%
//			5.01 - 10		15%
//		10.01 en adelante	20%
//Determinar cuánto pagará una persona que compre manzanas en esa verdulería

Algoritmo sin_titulo
	Definir manzanas, total, precio, unidad Como Real
	Escribir "Ingrese cuantas manzanas desea comprar"
	Leer manzanas
	Escribir "Ingrese el precio del kilo de manzana"
	Leer precio
	
	Si manzanas <= 2 Entonces
		total = manzanas * precio 
		Escribir "El total a pagar es de: ", total
	SiNo
		Si (manzanas > 2) Y (manzanas <= 5) Entonces
			total = manzanas * ((90 * precio) / 100) 
			Escribir "El total a pagar es de: ", total
		SiNo
			Si (manzanas > 5) Y (manzanas <= 10) Entonces
				total = manzanas * ((85 * precio) / 100)
				Escribir "El total a pagar es de: ", total
			SiNo
				Si manzanas > 10 Entonces
					total = manzanas * ((80 * precio) / 100)
					unidad = total / manzanas
					Escribir "El total a pagar es de: ", total
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
