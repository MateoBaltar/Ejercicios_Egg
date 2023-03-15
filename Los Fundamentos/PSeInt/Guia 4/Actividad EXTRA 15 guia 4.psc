//Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
//productos en los 5 días hábiles de la semana. Se desea conocer:
//	a) Total de ventas por cada día de la semana.
//	b) Total de ventas de cada producto a lo largo de la semana.
//	c) El producto más vendido en cada semana.
//	d) El nombre, el día de la semana y la cantidad del producto más vendido.


Algoritmo sin_titulo
	Definir matriz, i, j, masv,producto,dia Como Entero
	Dimension matriz(7,6)
	masv = 0
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 
			matriz(i,j) = Aleatorio(1,100)
		FinPara
	FinPara
	
	Para i = 0 Hasta 4 Hacer
		matriz(i,5) = 0
		matriz(5,i) = 0
		matriz(6,i) = 0
		matriz(5,5) = 0
		matriz(6,5) = 0
	FinPara
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 
			matriz(i,5) = matriz(i,5) + matriz(i,j)
		FinPara
	FinPara
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 
			matriz(5,i) = matriz(5,i) + matriz(j,i)
		FinPara
	FinPara
	
	Para i = 0 Hasta 4 Hacer
		masv = 0
		Para j = 0 Hasta 4 
			Si matriz(j,i) > masv
				masv = matriz(j,i)
				matriz(6,i) = masv
			FinSi
		FinPara
	FinPara
	
	
	
	Para i = 0 Hasta 6 Hacer
		Para j = 0 Hasta 5 Hacer
			Escribir Sin Saltar matriz(i,j), " "
		FinPara
		Escribir ""
	FinPara
	Escribir "---------------------------"
	masv = 0
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 
			Si matriz(i,j) > masv
				masv = matriz(i,j)
				dia = j
				producto = i
			FinSi
		FinPara
	FinPara
	
	Segun dia Hacer
		0: Escribir	"El producto ", producto, " fue el mas vendido con ", masv, " ventas. Fue vendido un dia Lunes"
			
		1:Escribir	"El producto ", producto, " fue el mas vendido con ", masv, " ventas. Fue vendido un dia Martes"
			
		2:Escribir	"El producto ", producto, " fue el mas vendido con ", masv, " ventas. Fue vendido un dia Miercoles"
			
		3:Escribir	"El producto ", producto, " fue el mas vendido con ", masv, " ventas. Fue vendido un dia Jueves"
			
		4:Escribir	"El producto ", producto, " fue el mas vendido con ", masv, " ventas. Fue vendido un dia Viernes"
	FinSegun
	
FinAlgoritmo
