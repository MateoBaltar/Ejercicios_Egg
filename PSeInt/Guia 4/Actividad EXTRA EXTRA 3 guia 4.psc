//Queremos realizar una encuesta a 6 personas, en esta encuesta:
//	o Indicaremos el sexo 1= masculino, 2=femenino
//	o sí trabaja 1=si trabaja 2=no trabaja
//		o Su sueldo (que estará entre 600 y 2000, valor entero, siempre y cuando trabaje sino
//			es 0)
//		o Calcule y muestre:
//			a) Porcentaje de hombres / porcentaje de mujeres
//			b) Porcentaje de hombres que trabajan / porcentaje de mujeres que
//			trabajan
//			c) Sueldo promedio de los hombres que trabajan / sueldo promedio de
//			las mujeres q trabajan


Algoritmo sin_titulo
	Definir sexo, trabaja, sueldo, i, promedioM, promedioF, porcenM, porcenF, porcenTM, porcenTF, contarF, contarM Como Real
	Dimension sexo(6), trabaja(6), sueldo(6)
	porcenM = 0
	porcenF = 0
	porcenTM = 0
	porcenTF = 0
	contarF = 1
	contarM = 1
	promedioM = 0
	promedioF = 0
	
	Escribir "Ingrese su sexo (1 masculino | 2 femenino)"
	Para i = 0 Hasta 5 Hacer
		Hacer
			Leer sexo(i)
			Si sexo(i) = 1
				porcenM = porcenM + 1
			SiNo
				Si sexo(i) = 2
					porcenF = porcenF + 1
				SiNo
					Si sexo(i) <> 1 o sexo(i) <> 2
						Escribir "El valor ingresado no es valido, intente nuevamente"
					FinSi
				FinSi
			FinSi
			
		Mientras Que sexo(i) <> 1 Y sexo(i) <> 2
	FinPara
	porcenM = (porcenM * 100) / 6
	porcenF = (porcenF * 100) / 6
	
	Escribir "Trabaja? (1 Si | 2 No)"
	Para i = 0 Hasta 5 Hacer
		Hacer
			Leer trabaja(i)
			Si trabaja(i) <> 1 Y trabaja(i) <> 2
				Escribir "El valor ingresado no es valido, intente nuevamente"
			SiNo
				
			FinSi
		Mientras Que trabaja(i) <> 1 Y trabaja(i) <> 2
	FinPara
	
	Para i = 0 Hasta 5 Hacer
		Si sexo(i) == 1 Y trabaja(i) == 1
			porcenTM = porcenTM + 1
		SiNo
			Si sexo(i) == 2 Y trabaja(i) == 1
				porcenTF = porcenTF + 1
			FinSi
		FinSi
	FinPara
	porcenTM = (porcenTM * 100) / 6
	porcenTF = (porcenTF * 100) / 6
	
	Para i = 0 Hasta  5 Hacer
		Si trabaja(i) = 1
			Escribir "Cual es su salario?"
			Para i = 0 Hasta 5 Hacer
				Hacer
					Leer sueldo(i)
					Si sueldo(i) < 600 O sueldo(i) > 2000
						Escribir "El valor ingresado no es valido, intente nuevamente"
					FinSi
				Mientras Que sueldo(i) < 600 Y sueldo(i) > 2000
			FinPara
		FinSi
	FinPara
	Para i = 0 Hasta 5 Hacer
		Si sexo(i) == 1
			promedioM = promedioM + sueldo(i)
			contarM = contarM + 1
		SiNo
			Si sexo(i) == 2
				promedioF = promedioF + sueldo(i)
				contarF = contarF + 1
			FinSi
		FinSi
	FinPara
	promedioM = promedioM / contarM
	promedioM = promedioF / contarF
	
	Escribir "El porcentaje masculino es ", porcenM, "%"
	Escribir "El porcentaje femenino es ", porcenF, "%"
	Escribir " "
	Escribir "El porcentaje masculino que trabaja es ", porcenTM, "%"
	Escribir "El porcentaje femenino que trabaja es ", porcenTF, "%"
	Escribir " "
	Escribir "El salario promedio masculino es es $", promedioM
	Escribir "El salario promedio femenino es $", promedioF
FinAlgoritmo
