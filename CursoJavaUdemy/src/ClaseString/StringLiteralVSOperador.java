package ClaseString;

public class StringLiteralVSOperador {

	public static void main(String[] args) {
		String saludo = "Hola me llamo jose";
		String saludoOperador = new String("Hola me llamo jose");
		String saludo3 = "Hola me llamo jose";
		
		// Esto es distinto ya que un objeto esta creado de manera literal y el otro con el operador(new)
		// Por lo tanto son objetos distintos.
		boolean esigual = saludo == saludoOperador;
		System.out.println("saludo == saludoOperador --> " + esigual);
		
		// Aquí no comparamos los objetos, si no su contenido, por lo tanto si que son iguales.
		esigual = saludo.equals(saludoOperador);
		System.out.println("saludo.equals(saludoOperador) --> " + esigual);
		
		// Aquí lo que hace java es asignarle la referencia del valor de la primera variable a la segunda ya que son
		// exactamente iguales para optimizar la creacion de objetos, ya que al contener lo mismo, no haría falta crear 
		// otro objeto por lo tanto si que son iguales ya que, a ojos de java son el mismo objeto.
		esigual = saludo == saludo3;
		System.out.println("saludo == saludo3 --> " + esigual);
		
		
		// Concatenar Strings
			
			// Usando concat.
			// Concat lo que hace es retornar un objeto distinto ya que los Strings son inmutables
			// Crea uno nuevo con lo que le digas y en este caso se le asigna a detallesPersona.
			String nombre = "jose";
			String edad = "23";
			String gustos = "Atletico de Madrid";
			String detallesPersona = nombre.concat(" ".concat(edad).concat(" ".concat(gustos)));
			System.out.println(detallesPersona);
			
			// Usando el operador '+' en un Syso
			System.out.println("nombre: " + nombre + "\n" + "edad: "+ edad);

			// Con el .transform tambien podemos concatenar de una forma mucho mas funcional
			String curso = "DAM";
			String profesor = "Josele";
			
			String resultadoCurso = curso.transform((c) -> {
				return c + " con " + profesor;
			});
			System.out.println("curso = " + curso);
			System.out.println("Resultado de la funcion flecha = " + resultadoCurso);
			String detallesPersona2 = detallesPersona.replace("j","J");
			// Aquí la j seguira siendo minúscula
			System.out.println("Despues de usar replace = " + detallesPersona);
			// Aquí la j será mayúscula
			System.out.println("Despues de haber guardado en una variable lo realizado con el replace = " + detallesPersona2);
			
	}

}
