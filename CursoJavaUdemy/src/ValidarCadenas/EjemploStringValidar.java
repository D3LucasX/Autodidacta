package ValidarCadenas;

public class EjemploStringValidar {

	public static void main(String[] args) {
		String curso = null;
		
		boolean esNulo = curso == null;
		if(esNulo) {
			curso = "DAM";
		}
		System.out.println(curso.toLowerCase());
		System.out.println("Bienvenidos al curso de ".concat(curso));
		
		// Si la cadena esta vacía
		curso = "";
		boolean esVacio = curso.length() == 0; // Si la longitud es 0, es vacía sera true
		if (esVacio) {
			System.out.println("Atencion, su variable curso esta bien inicializada, pero esta vacía, no contiene caracteres");
		}else {
			System.out.println(curso.toLowerCase());
			System.out.println("Bienvenidos al curso de ".concat(curso));
		}
		// tambien podemos usar el metodo isEmpty
		// Hace lo mismo, retorna que si esta vacio es true, por lo tanto si no lo esta es false
		curso = " ";
		boolean isEmpty = curso.isEmpty();
		if(isEmpty) {
			System.out.println("Atencion, su variable esta vacía");
		}else {
			System.out.println("Atencion, según el ejemplo su variable no está vacía ya que contiene un espacio, por lo que sera false e intentara ejecutar este bloque de código");
			System.out.println(curso.toLowerCase());
			System.out.println("Bienvenidos al curso de ".concat(curso));
		}
		// Pero si lo que hay es un espacio en blanco, seguiria siendo false ya que el length seguiría siendo > a 1
		// Por eso usariamos sería .isBlank, que es mas restrictivo, si solo hay espacios tambien considera que es true
		curso = " ";
		boolean esBlanco = curso.isBlank();
		if (!esBlanco) {
			System.out.println(curso.toLowerCase());
			System.out.println("Bienvenidos al curso de ".concat(curso));
		}else {
			System.out.println("Atención, su varable contiene uno o mas espacios en blanco sólamente, no contiene letras ni números");
		}

	}

}
