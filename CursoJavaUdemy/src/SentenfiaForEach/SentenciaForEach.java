package SentenfiaForEach;

public class SentenciaForEach {

	public static void main(String[] args) {
		int[] numeros= {1, 2, 3, 4, 5, 6 ,78, 98};
		for(int num: numeros) {
			System.out.println("num = " + num);
		}
		
		String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
		
		// iterando sobre arreglos o colecciones
		// es mas facil iterar con for Each sobre arreglos o colecciones
		for(String nombre : nombres) {
			System.out.println("nombre = " + nombre);
		}
	}

}
