package SentenciaSwitchCase;

import java.util.Scanner;

public class SentenciaSwitchCaseNumeroDiasMes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroDias = 0;
		int mes = 0;
		int anio = 0;
		boolean esValido = false;
		
		while(!esValido) {
			System.out.println("Introduce el numero del mes (1-12) ");
			
			if(entrada.hasNextInt()) {
				mes = entrada.nextInt();
				entrada.nextLine();
				esValido = true;
			}else {
				System.out.println("Error, debes de escribir el mes con numeros");
				entrada.nextLine(); 
			}
		}
		esValido = false;
		while(!esValido) {
			System.out.println("Introduce el numero del ayo (y-y-y-y) ");
			if(entrada.hasNextInt()) {
				anio = entrada.nextInt();
				entrada.nextLine();
				esValido = true;
			}else {
				System.out.println("Error, debes de escribir el año con numeros");
			}
		}
		
		switch(mes) {
		// Se puede hacer asi o tembién puedes poner que los casos que sean de 30 días, ponerlos todos juntos con un break al final 
		// y que los casos que sean de 31 dias ponerlos todos juntos también con solo un break al final, así te ahorras el tener que escribir
		// el número de dias por mes porque con que lo escribas una vez, vale por que todos esos meses tienen el mismo número de dias
		// y luego por ultimo otro con el mes de febrero con su lógica.
			case 1:
				numeroDias = 31;
				break;
			case 2:
				if(anio % 400 == 0 || (anio % 4 == 0) && !(anio % 100 == 0)){
					numeroDias = 29;
				}else {
					numeroDias = 28;
				}
				break;
			case 3:
				numeroDias = 31;
				break;
			case 4:
				numeroDias = 30;
				break;
			case 5:
				numeroDias = 31;
				break;
			case 6: 
				numeroDias = 30;
				break;
			case 7:
				numeroDias = 31;
			case 8:
				numeroDias = 31;
				break;
			case 9 :
				numeroDias = 30;
				break;
			case 10:
				numeroDias = 31;
				break;
			case 11:
				numeroDias = 30;
				break;
			case 12:
				numeroDias = 31;
				break;
					default:
						System.out.println("Error. dato inválido");
						break;
		}
		System.out.println("El mes " + mes + " tiene " + numeroDias);

	}

}
