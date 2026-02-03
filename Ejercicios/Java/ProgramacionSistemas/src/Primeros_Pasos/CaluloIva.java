package Primeros_Pasos;

import java.util.Scanner
;
public class CaluloIva {
	public static void main(String[] args) {
		// Deficinión de variables
		Scanner teclado =  new Scanner(System.in);
		double importe = 0.0;
		double tipo_iva = 0.0;
		double calculo_iva = 0.0;
		double total_factura = 0.0;
		//Entrada de datos
		System.out.println("Introduce el valor del producto: ");
		importe  =  teclado.nextDouble();
		System.out.println("Introduce el valor del iva: ");
		tipo_iva  =  teclado.nextDouble();
		//Main
		calculo_iva = importe * (tipo_iva / 100);
		total_factura = importe + calculo_iva;
		//Impresion de resultados
		System.out.println("***** Resultado *****");
		System.out.println("El importe del producto es: " + importe);
		System.out.println("El iva a aplicar es del: " + tipo_iva + "%" + ". El importe es: " + calculo_iva);
		System.out.println("El total de la factura es: " +  total_factura);
		teclado.close();
	}

}
