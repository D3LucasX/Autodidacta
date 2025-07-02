package Assignament6;

import javax.swing.JOptionPane;

public class ObtenerNombreMasLargo {

	public static void main(String[] args) {
		try {
			String persona1 = solicitarNombreCompleto("primera persona");
			String persona2 = solicitarNombreCompleto("segunda persona");
			String persona3 = solicitarNombreCompleto("tercera persona");
			
			String[] nombre1 = persona1.split(" ");
			String[] nombre2 = persona2.split(" ");
			String[] nombre3 = persona3.split(" ");
			
			String max = "";
			if (nombre1[0].length() != nombre2[0].length()) {
				
				max = nombre1[0].length() > nombre2[0].length() ? nombre1[0] : nombre2[0];
				
				max = max.length() == nombre3[0].length() ? max + " y " + nombre3[0] + 
						" son los mas grandes con el mismo número de caracteres" :
							max.length() > nombre3[0].length() ? max + 
									" es el nombre con mas caracteres. " : 
										nombre3[0] + "Es el nombre con mas caracteres.";
							
			}else if (nombre1[0].length() == nombre2[0].length()) {
				
				max = nombre1[0].length() == nombre3[0].length() ? "Los nombres de " + 
						nombre1[0] + ", " + nombre2[0] + ", " + nombre3[0] + " son iguales" : 
							nombre1[0].length() > nombre3[0].length() ? nombre1[0] + " y " + 
								nombre2[0] + " son los nombres mas largos y tienen los mismos caracteres" : 
									nombre3[0] + " es el nombre mas largo";
			}
			
			JOptionPane.showMessageDialog(null, max);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado " + e.getMessage());
		}
	}
	
	private static String solicitarNombreCompleto (String persona) {
		while (true) {
			String input = JOptionPane.showInputDialog(null, "Dime el nombre y el apellido de la " + persona);
			
			if (input == null) {
				JOptionPane.showMessageDialog(null, "No puedes cancelar, introduce un nombre");
				continue;
			}
			if (input.isBlank()) {
				JOptionPane.showMessageDialog(null, "No Puedes dejar la casilla en blanco, introduce el nombre completo por favor.");
				continue;
			}
			String[] partes = input.trim().split("\\s+");
			if (partes.length < 2) {
				JOptionPane.showMessageDialog(null, "Debes de introducir el/los apellidos.");
				continue;
			}
			return input;
		}
	}
}
