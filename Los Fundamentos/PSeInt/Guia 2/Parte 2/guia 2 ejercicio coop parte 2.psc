//Necesitamos crear un sistema para una m�quina de reciclaje de botellas autom�tica. Dicha
//	m�quina nos pagar� dinero por la cantidad de pl�stico reciclado. Tenemos que ingresar nuestro
//	usuario y contrase�a para que se nos cargue el saldo por sistema a nuestra cuenta.
//	? Condici�n simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
//	verdadero, validaremos si la contrase�a es "caramelosDeLimon". Si la contrase�a es correcta
//	haremos que una variable llamada Login sea verdadera.
//	? Bucle Mientras: Este bloque de validaci�n de la contrase�a lo encerraremos en un bucle
//	Mientras para darle al usuario s�lo 3 intentos para poner la contrase�a.
//	? Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al men� de
//	opciones: "Ingresar botellas", "Consultar saldo" y "Salir"
//	? Ingresar Botellas: Primero preguntaremos cu�ntas botellas se va a ingresar al sistema. Una vez
//	que tenemos el n�mero vamos a usar un bucle para, a fin de ir ingresando cada botella. En
//	cada ciclo del bucle se debe generar un n�mero aleatorio entre 100 y 3000 gr, que va a ser el
//	peso de las botellas a reciclar (simulando que el usuario est� ingresando botellas en la
//	m�quina). Una vez generado, seg�n el peso del material, usaremos un condicional m�ltiple
//	para asignarle un valor monetario:
//	? Si es menos de 500 gr, corresponden $50
//	? Si es entre 501 gr y 1500 gr, corresponden $125
//	 Si es m�s de 1501 gr, corresponden $200
//	 Hecho esto, el programa debe informar al usuario por pantalla el valor que se le ofrece. Si el
//	usuario acepta, lo acreditamos a su saldo, sino se debe devolver el material (s�lo mostrar en
//  pantalla "Devolviendo material"). Para esto usaremos un condicional doble.
//  Consultar saldo: revisaremos el valor monetario que tiene asignada la variable "saldo".
//? Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al men� principal.

Algoritmo sin_titulo
	Definir usuario, contra, menu, acepta Como Caracter
	Definir intento, botellas, i, peso, saldo, banco Como Entero
	Definir Login Como Logico
	Dimension peso[100]
	intento = 1
	Login = Falso
	saldo = 0
	banco = 0
	
	Mientras Login = Falso Y (intento <> 3) Hacer
		Escribir "Ingrese un nombre de usuario"
		Leer usuario
		Si usuario == "Albus_D"
			Escribir "Ingrese una contrase�a"
			leer contra
			Mientras (contra <> "caramelosDeLimon") Y (intento <> 3) Hacer
			Si contra == "caramelosDeLimon"
				Escribir "La contrase�a es correcta"
			SiNo
				intento = intento + 1
				Escribir "La contrase�a es incorrecta"
				Escribir "Ingrese la contrase�a nuevamente"
				leer contra
			FinSi
		FinMientras
		SiNo
			Escribir "El usuario es incorrecto"
		FinSi
		Si usuario == "Albus_D" Y contra == "caramelosDeLimon"
			Login = Verdadero
		FinSi
		Si intento == 3
			Escribir "Uso la maxima cantidad de intentos, intente de nuevo m�s tarde"
		FinSi
	FinMientras
	
	Si Login = Verdadero
	Hacer
		Escribir "------- Menu -------"
		Escribir "Seleccione una de las opciones:"
		Escribir "A. Ingresar botellas"
		Escribir "B. Consultar saldo"
		Escribir "C. Salir"
		leer menu
		Segun menu Hacer
			"A":
				Escribir "Cuantas botellas desea ingresar?"
				Leer botellas
				Para i <- 1 Hasta botellas Hacer
					peso[i] = aleatorio(100,3000)
					Si peso[i] <= 500
						saldo = saldo + 50
					SiNo
						Si peso[i] >= 501 Y peso[i] <= 1500
							saldo = saldo + 125
						SiNo
							Si peso[i] >= 1501
								saldo = saldo + 200
							FinSi
						FinSi
					FinSi
				FinPara
				Escribir "El valor total de las botellas es $", saldo, ". Acepta el saldo? (Y/N)"
				Leer acepta
				Si	acepta == "Y"
					banco = saldo
				SiNo
					Escribir "Devolviendo material"
					saldo = 0
				FinSi
			"B":
				Escribir "Su saldo actual es $", banco
			"C":
				Escribir "Usted a salido exitosamente"
		Fin Segun
	Mientras Que Login = Verdadero Y menu <> "C"
FinSi

FinAlgoritmo
