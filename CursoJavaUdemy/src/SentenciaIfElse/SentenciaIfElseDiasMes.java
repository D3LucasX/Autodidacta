package SentenciaIfElse;

import javax.swing.JOptionPane;

public class SentenciaIfElseDiasMes {

	public static void main(String[] args) {
		
		int mes = pedirNumero("mes.");
		// Queremos determinar si el mes tiene 30 o 31 días			
		int anio = pedirNumero("año.");
		
		int numeroDias = 0;
		
		if(mes == 1 || mes == 3 || mes== 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			numeroDias = 31;
		}else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			numeroDias = 30;
		}else if(mes == 2) {
			// Si es divisible entre 400 o si es divisible entre 4 pero no entre 100
			if(anio % 400 == 0 || (anio % 4 == 0) && !(anio % 100 != 0)) {
				numeroDias = 29;
			}else {
				numeroDias = 28;
			}
		}
			
		System.out.println("Numero de dias = " + numeroDias);		
	}
	private static int pedirNumero(String numero) {
		int numero1 = 0;
		boolean esValido = false;
		
		// Mientras no sea valido == mientras que esValido siga siendo false.
		while (!esValido) {
			String input = JOptionPane.showInputDialog(null, "Introduce el " + numero);
			
			
			if (input == null) {
				JOptionPane.showMessageDialog(null, "No puedes cancelar la entrada del dato.");
			}else {
				try {
					numero1 = Integer.parseInt(input);
					esValido = true;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Debes de introducr un número en dígitos");
				}
			}
		}
		return numero1;
	}

}
