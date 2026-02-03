package Primeros_Pasos;

import java.util.Scanner;

public class Calculo_Factura {
	public static void main(String[] args) {
		// Deficinión de variables
		Scanner teclado =  new Scanner(System.in);
		double importe_producto, importe_total, tipo_iva, calculo_iva, total_factura, descuento = 0.0;
		int unidades = 0;
		//Entrada de datos
		System.out.println("Introduce el valor del producto: ");
		importe_producto  =  teclado.nextDouble();
		System.out.println("Introduce el número de unidades: ");
		unidades  =  teclado.nextInt();
		System.out.println("Introduce el descuento a aplicar: ");
		descuento  =  teclado.nextDouble();
		//Main
		tipo_iva = 21;
		importe_total = (importe_producto * unidades) - ((importe_producto * unidades) * (descuento / 100));
		calculo_iva = importe_total * (tipo_iva / 100);
		total_factura = importe_total + calculo_iva;
		//Impresion de resultados
		System.out.println("***** Resultado *****");
		System.out.println("El importe del producto es: " + importe_producto + "€");
		System.out.println("El descuento es de : " + descuento + "%");
		System.out.println("El importe total del producto es: " + importe_total + "€");
		System.out.println("El iva a aplicar es del: " + tipo_iva + "%" + ". El importe es: " + calculo_iva + "€");
		System.out.println("**************************************************");
		System.out.println("* El total de la factura es: " + String.format ("%.2f",total_factura) + "€");
		System.out.println("**************************************************");
		teclado.close();
	}

}
