package EjemploStringTestRendimiento;

public class EjemploStringTestRendimiento {

	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		String c = a;
		
		// Creamos un ´String con el uso del metodo append y del metodo toString
		// Esto es mutable, no como un String común.
		StringBuilder sb = new StringBuilder(a);
		
		//Aqui lo que obtendremos es el tiempo actual en milisegundos, de tipo de dato long, por eso inicio es long
		long inicio = System.currentTimeMillis();
		
		// Bucle for para en 500 iteraciones ver cual es la opcion que menos tarda
		for(int i = 0; i < 500; i++) {
			//c = c.concat(a).concat(b).concat("\n");  **500 -> de 2 a 4 ms**
			//c += a + b + "\n";                       **500 -> 21 ms**
			//sb.append(a).append(b).append("\n");     **500 -> 0 ms, el mas rapido con diferencia**
			
		}
		
		long fin = System.currentTimeMillis();
		// Para sacar lo que tardó, restamos el fin menos el inicio
		System.out.println(fin - inicio);
		System.out.println("c = " + c );
		System.out.println("sb = " + sb.toString());
			
			

	}

}
