///Realizar un programa que pida al usuario el horario en el que se conect� al zoom. Si ese horario
///est� entre la hora de ingreso y la hora de ingreso + los 15? de tardanza, mostrar� un mensaje por
///pantalla que diga "Llegaste a tiempo, tienes presente". Si el horario de ingreso supera ese l�mite,
///se mostrar� un mensaje por pantalla que diga "Hoy tendr�s tardanza. Recuerda avisarle a tus
///coaches cuando llegar�s tarde. Ma�ana te esperamos a tiempo, tu participaci�n en el equipo es
///VITAL"

Algoritmo sin_titulo
	Definir hora, minutos como Entero
	Escribir Sin Saltar "Ingrese la hora en la que entro (Solo las horas) "
	Leer hora
	Escribir Sin Saltar "Ingrese los minutos en los que entro "
	leer minutos
	
	Si hora == 5 Y minutos <= 15
		Escribir "Felicitaciones llegaste a tiempo."
	SiNo
		Escribir "Hoy tendras tardanza."
	FinSi
	
FinAlgoritmo
