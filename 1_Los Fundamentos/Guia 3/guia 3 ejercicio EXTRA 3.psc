// Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y que
// devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es "asdasd".
//		Además, la función calculara el número de intentos que se ha usado para loguearse, tenemos
//			solo 3 intentos, si nos quedamos sin intentos la función devolverá Falso.

Algoritmo sin_titulo
	Definir usuario, contra Como Caracter
	Definir intentos como entero
	intentos = 0
	Hacer	
		Escribir "Ingrese un nombre de usuario"
		Leer usuario
		
		Escribir "Ingrese la contraseña"
		leer contra
		intentos = intentos + 1
	Mientras Que (Login(usuario, contra) == Falso) Y intentos <> 3
	
	Si Login(usuario, contra) == Verdadero
		Escribir "Inicio de sesion exitoso"
	SiNo
		Escribir Login(usuario, contra)
	FinSi
	
FinAlgoritmo

Funcion VoF <- Login(usuario, contra)
	Definir VoF Como Logico
	
	Si usuario == "usuario1" Y contra == "asdasd"
		VoF = Verdadero
	FinSi
FinFuncion
