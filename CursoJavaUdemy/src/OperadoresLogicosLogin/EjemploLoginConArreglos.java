package OperadoresLogicosLogin;

import java.util.Scanner;
// Gestor de usuarios y contraseñas
public class EjemploLoginConArreglos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cantidadUsuarios = 0;
		String[] arrayUsuarios = new String[100];
		String volverAAñadir = "";
		int i = 2;
		if (cantidadUsuarios == 0) {
			arrayUsuarios[0] = pedirUsuario(entrada);
			arrayUsuarios[1] = pedirPassword(entrada);
			cantidadUsuarios ++;
		}
			System.out.println("Desea registrar a otro usuario?: ");
			volverAAñadir = entrada.nextLine();
			if(volverAAñadir.equalsIgnoreCase("si")) {
				do {
					cantidadUsuarios ++;
					arrayUsuarios[i] = pedirUsuario(entrada);
					i++;
					arrayUsuarios[i] = pedirPassword(entrada);
					i++;
					System.out.println("Desea registrar a otro usuario?: ");
					volverAAñadir = entrada.nextLine();
				}while(volverAAñadir.equalsIgnoreCase("si"));
			}else {
				System.out.println("Gracias, Hasta La proxima!");
			}
			int longitud = cantidadUsuarios * 2;
			int numeroUsuario = 0;
		for (int j = 0; j < longitud; j++) {
			if (j % 2 == 0) {
				System.out.println("Usuario número " + (numeroUsuario +1));
			}
			System.out.println(arrayUsuarios[j]);
			if (j == 1 || j % 2 != 0) {
				if(j > 0) {
					System.out.println();
					numeroUsuario ++;
				}
			}
		}

	}
	public static String pedirUsuario(Scanner entrada) {
		String nuevoUsuario = "";
		boolean esVacia = false;
		do {
			System.out.println("Ingrese el nombre del usuario: ");
			nuevoUsuario = entrada.nextLine();
			esVacia = nuevoUsuario.isBlank();
			if(esVacia) {
				System.out.println("No debe dejar el espacio en blanco, rellene la casilla por favor.");
			}else if(nuevoUsuario.charAt(0) == ' ') {
				System.out.println("No puedes dejar espacios ni al principio ni al final.");
			}else if(nuevoUsuario.charAt(nuevoUsuario.length()-1) == ' ') {
				System.out.println("No puedes dehar espacios ni al principio ni al final");
			}
		}while(esVacia || nuevoUsuario.charAt(0) == ' '|| nuevoUsuario.charAt(nuevoUsuario.length() -1) == ' ');
		return nuevoUsuario;
	}
	public static String pedirPassword(Scanner entrada) {
		String nuevoPassword = "";
		boolean esVacia = false;
		do {
			System.out.println("Ingrese la contraseña: ");
			nuevoPassword = entrada.nextLine();
			esVacia = nuevoPassword.isBlank();
			if(esVacia) {
				System.out.println("No debe dejar el espacio en blanco, rellene la casilla por favor.");
			}else if(nuevoPassword.contains(" ")) {
				System.out.println("No puede haber espacios en la contraseña.");
			}
		}while(esVacia || nuevoPassword.contains(" "));
		return nuevoPassword;
	}

}
