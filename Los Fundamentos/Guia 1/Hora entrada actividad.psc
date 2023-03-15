///Realizar un programa que pida al usuario el horario en el que se conectó al zoom. Si ese horario
///está entre la hora de ingreso y la hora de ingreso + los 15? de tardanza, mostrará un mensaje por
///pantalla que diga "Llegaste a tiempo, tienes presente". Si el horario de ingreso supera ese límite,
///se mostrará un mensaje por pantalla que diga "Hoy tendrás tardanza. Recuerda avisarle a tus
///coaches cuando llegarás tarde. Mañana te esperamos a tiempo, tu participación en el equipo es
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
