package PrecedenciaOperadores;

public class PrecedenciaOperadores {

	public static void main(String[] args) {
		int i = 14;
		int j = 8;
		int k = 20;
		
		double promedio = (i + j + k) / 3d;
		System.out.println(promedio);
		// Por ejemplo aqui tiene prioridad los parentesis 
		// frente a la división.
		
		promedio = i + j + k / 3d * 10;
		// En este caso el orden de prioridad iria de izquierda
		// a derecha. primero haría la division y luego la 
		// multiplicacion
		
		promedio = ++i + j-- + k / 3d * 10;
		/*
		 * Aqui primero incrementa i, luego suma a j
		 * que despues incrementa, pero la operacion la hace
		 * con el valor de j antes de hacer el decremento,
		 * osea que en la operacion j vale 8, despues de 
		 * realizarse la operacion si imprimieramos el valor
		 * de j, ahora valdría 7		 */
	}

}
