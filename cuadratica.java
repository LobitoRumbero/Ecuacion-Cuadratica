/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "ECUACIONCUADRATICA.java."

import java.io.*;
import java.math.*;

public class ecuacioncuadratica {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		double discriminante;
		double x1;
		double x2;
		System.out.print("Ingresa el valor de a:");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingresa el valor de b:");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingresa el valor de c:");
		c = Double.parseDouble(bufEntrada.readLine());
		discriminante = b*b-4.0*a*c;
		if (discriminante<0) {
			discriminante = -discriminante;
			System.out.println("Soluciones imaginarias");
		} else {
			System.out.println("Soluciones reales");
		}
		if (a!=0) {
			x1 = (-b+Math.sqrt(discriminante))/2.0/a;
			x2 = (-b-Math.sqrt(discriminante))/2.0/a;
		} else {
			x1 = 0;
			x2 = 0;
			System.out.println("No es una ecuación cuadrática");
		}
		System.out.println("Valor de discriminante: "+discriminante);
		System.out.println("Valor de x1: "+x1);
		System.out.println("Valor de x2: "+x2);
	}


}

