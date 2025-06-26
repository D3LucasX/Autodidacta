package StringMetodos;

public class EjemploDeStringMetodosArreglo {

	public static void main(String[] args) {
		String trabalenguas = "trabalenguas";
		// To char arrray lo que hace es que conviete el String en un arreglo de caracteres
		System.out.println("trabalenguas = " + trabalenguas.toCharArray());
		// Es de referencia, por lo tanto si lo queremos imprimir imprimira el identificador del array
		// Para mostrar los elementos deberemos de recoorer el array con un bucle y su posición
		for (int i = 0; i < trabalenguas.length(); i++) {
			System.out.println(trabalenguas.toCharArray()[i]);
		}
		System.out.println("\n"); // Salto de linea.
		
		// y guardando las posiciones en un arreglo:
		char[] arreglo = trabalenguas.toCharArray();
		for (int i = 0; i < trabalenguas.length(); i++) {
			System.out.println(arreglo[i]);
		}
		
		System.out.println(); // Salto de linea
		// Dividir un string mediante una expresion regular/patron y las divisiones conformaran un arreglo.
		// Al crear un array, tambien muestra la referencia si quieres imprimirlo tal cual.
		System.out.println("trabalenguas.split = " + trabalenguas.split("a"));
		
		// creamos array donde guardaremos las partes del string que estaran separadas por 'a'.
		String[] arregloStr = trabalenguas.split("a");
		int longitud = arregloStr.length;
		for(int i = 0; i < longitud; i++) {
			System.out.println(arregloStr[i]);
		}
	}

}
