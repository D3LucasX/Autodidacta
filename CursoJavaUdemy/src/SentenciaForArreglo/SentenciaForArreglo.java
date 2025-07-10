package SentenciaForArreglo;

import javax.swing.JOptionPane;

public class SentenciaForArreglo {

	public static void main(String[] args) {
		//String [] nombres = new String[6]; Se puede hacer así o como abajo.
		String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
		
		int longitud = nombres.length;
		for(int i = 0; i < longitud; i++) {
			if(nombres[i].equalsIgnoreCase("Andres") || nombres[i].equalsIgnoreCase("Pepa")) {
				continue;
			}
			System.out.println(i + "-" + nombres[i]);
		}
		String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\" .");
		System.out.println("Buscar - " + buscar);
		
		
		// Podemos ver como los break y los continue pueden alterar el flujo del programa, a continuación veremos como imprime hasta que que llega al nombre que 
		// buscamos con el JOptionPane.
		boolean encontrado = false;
		for (int i = 0; i < longitud; i++) {
			if(nombres[i].equalsIgnoreCase(buscar)) {
				encontrado = true;
				break;
			}
			System.out.println("nombres = " + nombres[i]);
		}
		if(encontrado) {
			JOptionPane.showMessageDialog(null, buscar + "Fué encontrado .");
		}else {
			JOptionPane.showMessageDialog(null, buscar + " No fué encontrado. ");
		}
	}

}
 