package Assignament4;

import java.util.Scanner;

public class MayorAMenor {

	public static void main(String[] args) {
		// Ordena dos numeros pedidos por linea de comandos 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		int num1 = Integer.valueOf(entrada.nextInt());
		entrada.nextLine();
		System.out.println("Introduce el segundo numero: ");
		int num2 = Integer.valueOf(entrada.nextInt());
		entrada.nextLine();
		
		int max = num1 > num2 ? num1 : num2;
		System.out.print(max + ", 4");
		int min = num1 < num2 ? num1 : num2;
		System.out.print(min);
	}

}
