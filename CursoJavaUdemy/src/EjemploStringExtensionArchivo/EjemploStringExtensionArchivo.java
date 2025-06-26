package EjemploStringExtensionArchivo;

public class EjemploStringExtensionArchivo {

	public static void main(String[] args) {
		// Esto es una manera muy rustica de sacar la extension del archivo.
		// No esta muy automatizado ya que si la extension en vez de tener 4 caracteres tiene 2, ya no saca la extension bien
		String archivo = "alguna_imagen.jpeg";
		System.out.println("archivo.lengtj() = " + archivo.length());
		System.out.println("srchivo.Substring(14) = " + archivo.substring(archivo.length() - 4));
		
		
		// Para ello podriamos usar el index off:
		// Devuelve un int con la posicion donde se encuentra el caracter que queremos buscar:
		int i = archivo.indexOf(".");
		System.out.println(archivo);
		// Si haces de i, te incluye el punto
		System.out.println("srchivo.Substring(del index) = " + archivo.substring(i));
		// Si haces de i + 1 no te lo incluye
		System.out.println("srchivo.Substring(del index + 1) = " + archivo.substring(i + 1));
		
		
		// Si tuviera varios puntos, el index of fallaría
		// Usamos lastIndexOf para que no nos de error:
		String archivo2 = "alguna.imagen.jpeg";
		int j = archivo2.lastIndexOf(".");
		System.out.println(archivo2);
		System.out.println("srchivo2.Substring(del index) = " + archivo2.substring(i));
		System.out.println("srchivo2.Substring(del index + 1) = " + archivo2.substring(i + 1));
		
		// o tambien podriamos usar el metodo split
		// crea un arreglo de las patres de un String, separando el string por una expresion regular/patron que le demos
		// y la ultima parte sera la extension:
		String[] arregloPatron = archivo2.split("\\."); // se pone ls '\\' para definir que es un caracter, porque esta 
														// reservado en las regex, o si no se pone entre corchetes ' [.]'
		int longitud = arregloPatron.length;            // los corchetes tambien se usan para agrupar un conjunto de caracteres
		for(int k = 0; k < longitud; k++) {
			System.out.println(k + " : " + arregloPatron[k]);
		}
	}

}
