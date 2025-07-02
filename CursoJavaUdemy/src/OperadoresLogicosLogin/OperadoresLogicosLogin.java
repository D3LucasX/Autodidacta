package OperadoresLogicosLogin;

import java.util.Scanner;

public class OperadoresLogicosLogin {

	public static void main(String[] args) {
		String username = "Jose";
		String password = "12345";
		
		String username2 = "admin";
		String password2 = "12345";
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el username: ");
		String usuario = entrada.nextLine();
		System.out.println("Ingrese la contraseña: ");
		String contra = entrada.nextLine();
		
		
		boolean esAutenticado = false;
		
		if (username.equalsIgnoreCase(usuario) && password.equalsIgnoreCase(contra) ||
				username2.equalsIgnoreCase(usuario) && password2.equalsIgnoreCase(contra)) {
			esAutenticado = true;
		}else {
			System.out.println("Usuario o contraseña no válidos.");
		}
		
		
		if (esAutenticado) {
			System.out.println("Bienvenido usuario ".concat(username) + "!");
		}else {
			System.out.println("Lo siento, requiere autenticación.");
		}
	}

}
