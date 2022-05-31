# -*- coding: iso-8859-15 -*-
# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).
from math import sqrt

if __name__ == '__main__':
	a = float(input("Ingresa el valor de a: "))
	b = float(input("Ingresa el valor de b: "))
	c = float(input("Ingresa el valor de c: "))
	discriminante = b*b-4.0*a*c
	if discriminante<0:
		discriminante = -discriminante
		print ("Soluciones imaginarias")
	else:
		print ("Soluciones reales")
	if a!=0:
		x1 = (-b+sqrt(discriminante))/2.0/a
		x2 = (-b-sqrt(discriminante))/2.0/a
	else:
		x1 = 0
		x2 = 0
		print ("No es una ecuación cuadrática")
	print ("Valor de discriminante: ",discriminante)
	print ("Valor de x1: " ,x1)
	print ("Valor de x2: " ,x2)

