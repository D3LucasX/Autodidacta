package SentenciasBucleEtiquetasBuscar;

public class SentenciasBucleEtiquetasBuscar {

	public static void main(String[] args) {
		//buscar palabra en una frase comparando caracteres.
		
		
		String frase = "Tres tristes tigres tragan trigo en un trigal";
		String palabra = "tigresas";
		int cantidad = 0;
		char letra = 'p';
		boolean coincide = false;
		boolean encontrada = false;
		int longitudF = frase.length();
		int longitudP = palabra.length();
		String[] arrayPalabras = frase.split(" ");
		int cantidadPalabras = arrayPalabras.length;
		int numCoincidencias = 0;
		int posicionPalabra = 0;
		
		//bucles anidados para encontrar la palabra buscada en la frase
		bucle1:
		for (int i = 0; i < cantidadPalabras; i++) {
			posicionPalabra = i;
			numCoincidencias = 0;
			// Comprobamos que la palabra que vamos a revisar tenga el mismo numero
			// de caracteres que la palabra que estamos buscando para que no haya
			// errores de salirse del indice.
			if(arrayPalabras[i].length() != palabra.length()) {
				continue;
			}
			
			bucle2:
			for (int j = 0; j < longitudP; j++ ) {
				if(palabra.charAt(j) != arrayPalabras[i].charAt(j)) {
					coincide = false;
					continue bucle1;
				}else {
					coincide = true;
					numCoincidencias++;
					if (numCoincidencias == longitudP) {
						break bucle1;
					}
				}
			}
		}
		
		// Bucle para saber si esta una letra en una frase y contar cuantas veces
		bucle3:
		for(int i = 0; i < longitudF; i++) {
			if(frase.charAt(i) == letra || frase.charAt(i) == letra+32 || frase.charAt(i) == letra-32) {
				encontrada = true;
				cantidad++;
			}else {
				continue;
			}
		}
		if(coincide) {
			System.out.println("Hemos detectado la palabra " + "\"" + palabra + "\"" + " en la frase el la palabra numero " + (posicionPalabra + 1) + ".");
		}else {
			System.out.println("No hemos detectado la palabra buscada.");
		}
		
		if (encontrada) {
			System.out.println("La leta " + letra + " Se ha encontrado " + cantidad + " veces.");
		}else {
			System.out.println("No hemos encontrado la letra " + "\"" + letra + "\"" + " en la frase.");
		}
	}

}
