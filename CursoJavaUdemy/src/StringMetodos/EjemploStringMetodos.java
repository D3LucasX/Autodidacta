package StringMetodos;

public class EjemploStringMetodos {

	public static void main(String[] args) {
		String nombre = "jose";
		System.out.println("nombre.length() = " + nombre.length());
		System.out.println("toUperCase y toLowerCase = " + nombre.toLowerCase() + nombre.toUpperCase());
		System.out.println("equals = " + nombre.equals("jose"));
		System.out.println("no equeals = " + nombre.equals("Jose"));
		System.out.println("Equals ignore case = " + nombre.equalsIgnoreCase("jose"));
		System.out.println("CompareTo, devuelve un integer, compara lexicográficamente segun la tabla unicode (Si el valor es 0 significa que son identicos) = " + nombre.compareTo("jose"));
		// Si la posicion que buscas es el length de la palabra, te dará error por que es el /0, si quieres buscar la 
		// letra en la última posicion sera length-1 
		System.out.println("CharAt (Devuelve el caracter que esta en la posicion que buscas)= " + nombre.charAt(0));
		System.out.println("Substring(1) (devilvera un string desde la posicion uno hasta el final -> 'ose') = " + nombre.substring(1));
		System.out.println("substring(1,3) (El inicio si se incluye pero el final no) = " + nombre.substring(1,3));
		System.out.println("substring(1,4) (Si queremos incluir la ultima letra de la palabra, seleccionamos hasta el /0) = " + nombre.substring(1,4));
		String trabaLenguas =  "trablaLenguas";
		System.out.println("trabaLenguas = " + trabaLenguas.replace("a", "."));
		
		
		
		
	}

}
