package OperadorInstanceOf;
/*
 * Autor: Jose Maria de Lucas Plata.
 */

public class OperadorInstanceOf {

	public static void main(String[] args) {
		String texto = "Creando un objeto de tipo String...que tal";
		
		Integer num = 7; // Lo mismo con Double, Float, etc..
		// Aqui lo que hacemos es crear un objeto de tipo Integer
		// Esta variable guarda la referencia donde se lmacena el 7
		// Se puede operar con ese 7 directamente aun que lo que guarde la variable
		// sea la referencia del objeto.
		
		int num1 = Integer.valueOf(7); // == int num1 = 7;
		
		// Aquí asignamos un objeto en un tipo primitivo
		// Java por dento coge ese valor primitivo del objeto y lo asigna a la variable
		// por lo que aquñi num si que guardaría el 7.
		
		
		
		// Ahora utilizaremos InstanceOf para saber si un objeto es un tipo de una clase.
		boolean b1 = texto instanceof String;
		System.out.println("Es del tipo String? = " + b1);
		
		b1 = texto instanceof Object;
		System.out.println("Es del tipo Object? = " + b1);
		// Como podemos ver en este caso, b1 es de tipo String y de tipo Object
		// ya que todos los objetos heredan de la clase obkect
		
		/*
		 * Instance of se suele usar cuando: 
		 * 	-Hay metodos genéricos
		 * 	-Para comprobacion previa a casting
		 * 	-Implementaciones donde no se puede aplicar polimorfismo puro 
		 *   (por ejemplo, algunas estructuras de frameworks o 
		 *   parsing de objetos heterogéneos).
		 *   
		 *   	*Parsing de objetos:
		 *   
		 *   	 Por ejemplo cuando lees de un json(Es un String) y quieres trabajar 
		 *   	 con esos datos, deberas de pasar ese String que lees a 
		 *   	 un objeto, para eso te ayudaras de la lireria Gson y crearas una
		 *   	 instancia de el para crear un objeto que luego puedas utilizar:
		 *   		
		 *   		Ejemplo:
		 *   		
		 *   			Persona p = gson.fromJson(json,Persona.class);
		 *   			Ahora que tendrías un objeto deberas saber de que tipo.
		 *   
		 *   	*Estructuras de Frameworks:
		 *   	
		 *   	 Metodos o listeners que reciben objetos generales como
		 *   	 object o event y debes verificar el tipo real para tratarlos.
		 *   
		 *   	  	Ejemplo practico:
		 *   	  		
		 *   			Un sistema con un frontend que manda eventos al backend
		 *   			cuando esos eventos llegan a tu listener no sabes de que
		 *   			tipo son. Entonces tienes que saber a que instancia hacen
		 *   			referencia con el instance of.
		 */
	}

}
