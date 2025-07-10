package SentenciaFor;

import java.util.Scanner;

public class sentencia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("De cuanta altura quieres que sea el triangulo? : ");
		int altura = entrada.nextInt();
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura -i; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < i*2+1; k++) {
				if(k == 0 || k == i * 2) {
					System.out.print(" ");
				}else {
					System.out.print(" ");
				}
			}
			for(int l = altura; l < altura*2 - i; l++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < altura * 2 ; i++) {
			if(i < altura * 2) {
				System.out.print("*");
			}
			if(i == altura - 1) {
				System.out.print(" ");
			}
		}
	}
}
