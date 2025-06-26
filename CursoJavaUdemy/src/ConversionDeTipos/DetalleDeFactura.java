package ConversionDeTipos;

import java.util.Scanner;

public class DetalleDeFactura {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el nombre de la factura");
		String nombre = entrada.nextLine();
		System.out.println("El precio del primer producto");
		double producto1 = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("El precio del segundo producto");
		double producto2 = entrada.nextDouble();
		entrada.nextLine();
		
		// operacion
		double incremento = 0;
		double suma = producto1 + producto2;
		incremento = suma * 0.19;
		double total = suma + incremento;
		System.out.println("La factura producto de oficina tiene un total bruto de " + suma + " con un impuesto de " + incremento + " y el monto despues del impuesto es de " + total);

	}

}
