//Necesitamos crear un sistema para una máquina de reciclaje de botellas automática. Dicha
//	máquina nos pagará dinero por la cantidad de plástico reciclado. Tenemos que ingresar nuestro
//	usuario y contraseña para que se nos cargue el saldo por sistema a nuestra cuenta.
//	? Condición simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
//	verdadero, validaremos si la contraseña es "caramelosDeLimon". Si la contraseña es correcta
//	haremos que una variable llamada Login sea verdadera.
//	? Bucle Mientras: Este bloque de validación de la contraseña lo encerraremos en un bucle
//	Mientras para darle al usuario sólo 3 intentos para poner la contraseña.
//	? Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al menú de
//	opciones: "Ingresar botellas", "Consultar saldo" y "Salir"
//	? Ingresar Botellas: Primero preguntaremos cuántas botellas se va a ingresar al sistema. Una vez
//	que tenemos el número vamos a usar un bucle para, a fin de ir ingresando cada botella. En
//	cada ciclo del bucle se debe generar un número aleatorio entre 100 y 3000 gr, que va a ser el
//	peso de las botellas a reciclar (simulando que el usuario está ingresando botellas en la
//	máquina). Una vez generado, según el peso del material, usaremos un condicional múltiple
//	para asignarle un valor monetario:
//	? Si es menos de 500 gr, corresponden $50
//	? Si es entre 501 gr y 1500 gr, corresponden $125
//	 Si es más de 1501 gr, corresponden $200
//	 Hecho esto, el programa debe informar al usuario por pantalla el valor que se le ofrece. Si el
//	usuario acepta, lo acreditamos a su saldo, sino se debe devolver el material (sólo mostrar en
//  pantalla "Devolviendo material"). Para esto usaremos un condicional doble.
//  Consultar saldo: revisaremos el valor monetario que tiene asignada la variable "saldo".
//? Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al menú principal.

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
			Escribir "Ingrese una contraseña"
			leer contra
			Mientras (contra <> "caramelosDeLimon") Y (intento <> 3) Hacer
			Si contra == "caramelosDeLimon"
				Escribir "La contraseña es correcta"
			SiNo
				intento = intento + 1
				Escribir "La contraseña es incorrecta"
				Escribir "Ingrese la contraseña nuevamente"
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
			Escribir "Uso la maxima cantidad de intentos, intente de nuevo más tarde"
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
