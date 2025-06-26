package Assignament3;

import java.util.Scanner;

public class ProgramaManejoDeNombres {

	public static void main(String[] args) {
		
		String punto = ".";
		
		Scanner entrada = new Scanner(System.in);
		
		// Familiar 1
		System.out.println("1º Familiar: ");
		String familiar1 = entrada.nextLine();
		char mayus1 = familiar1.toUpperCase().charAt(1);
		String mayus11 = Character.toString(mayus1);
		int longNomb1 = familiar1.length();
		
		// Familiar 2
		System.out.println("2º Familiar: ");
		String familiar2 = entrada.nextLine();
		char mayus2 = familiar2.toUpperCase().charAt(1);
		String mayus22 = Character.toString(mayus2);
		int longNomb2 = familiar2.length();
		
		// Familiar 3
		System.out.println("3º Familiar: ");
		String familiar3 = entrada.nextLine();
		char mayus3 = familiar3.toUpperCase().charAt(1);
		String mayus33 = Character.toString(mayus3);
		int longNomb3 = familiar3.length();
		
		
		System.out.println(mayus11.concat(punto).concat(familiar1.substring(longNomb1-2).concat("_").concat(mayus22).concat(punto).concat(familiar2.substring(longNomb2-2).concat("_").concat(mayus33).concat(punto).concat(familiar3.substring(longNomb3-2)))));

	}

}
