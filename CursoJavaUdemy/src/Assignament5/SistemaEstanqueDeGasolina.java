package Assignament5;

import java.util.Scanner;

public class SistemaEstanqueDeGasolina {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double capacidadActual = 0d;
		do {
			System.out.println("introduzca el contenido actual de su estanque de gasolina: ");
			capacidadActual = entrada.nextDouble();
			if (capacidadActual < 0) {
				System.out.println("No puedes tener una cantidad menor que 0, introduce una cantidad válida por favor.");
			}else if(capacidadActual > 70) {
				System.out.println("La capacidad máxima es 70, introduzca un valor válido por favor.");
			}
		}while(capacidadActual < 0 || capacidadActual > 70);
		
		if(capacidadActual == 70) {
			System.out.println("Estanque lleno");
		}else if(capacidadActual >= 60 && capacidadActual < 70) {
			System.out.println("Estanque casi lleno");
		}else if(capacidadActual >= 40 && capacidadActual < 60) {
			System.out.println("Estanque  3/4");
		}else if(capacidadActual >= 35 && capacidadActual < 40) {
			System.out.println("Medio Estanque");
		}else if (capacidadActual >= 20 && capacidadActual < 35){
			System.out.println("Suficiente");
		}else if (capacidadActual >=1 && capacidadActual < 20) {
			System.out.println("Insuficiente");
		}

	}

}
