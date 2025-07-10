package SentenciaWhile;

public class SentenciaWhile {

	public static void main(String[] args) {
		
		int i = 0;
		// Ejecuta un bloque mientras se cumpla la condición.
		while(i < 5){
			System.out.println("i = " + i);
			i++;
		}
		System.out.println();
		
		i = 0;
		boolean prueba = true;
		
		while(prueba) {
			
			if(i == 7) {
				prueba = false;
			}
			System.out.println("i = " + i);
			i++;
		}
		
		//While:
		
		// Esto no se ejecuta ya que le condicion no puede ser falsa, porque al
		// ser falsa directamente no entra en el while, ya que primero comprueba
		// y despues se ejecuta, a diferencia del do While que ahi se ejecuta
		// al menos una vez y luego comprueba la condición.
		prueba = false;
		while(prueba) {
			System.out.println("Nunca se va a ejecutar por que la condicion es falsa");
		}
		
		// Esto si que se ejecuta por que en la condicion, aunque prueba sea
		// falso, la estamos ejecutando con el signo '!' que invierte su valor
		// por lo tanto lo que era false, es true.
		// y sería un bucle infinito por lo que lo igualamos a true, para que al
		// comprobar en el while con el operador '!' sea false, y se acabe el 
		// bucle.
		while(!prueba) {
			System.out.println("Esto si que se va a ejecutar");
			prueba = true;
		}
		
		
		// DO WHILE:
		
		// Al ser la condición falsa, primero ejecuta el bloque que esta en el
		// do, y despues comprueba la condición, en este caso al ser falsa
		// solo se ejecutaría una vez, puesto que se saldría del bucle
		// al tener la condicion falsa, solo se volvería a ejecutar
		// si la condicion fuera verdadera.
		prueba = false;
		do {
			System.out.println("Esto se ejecuta solo una vez, ya que la condicion es falsa y entonces sale del bucle");
		}while(prueba);
		
		i = 0;
		
		// Esto se ejecutará 4 veces ya que parte desde la posición 0 hasta que i == 3,
		// Pero como ejecuta la acción antes de comprobar, se ejecutará una cuarta vez
		// y luego saldrá del bucle.
		do {
			if(i == 3) {
				prueba = true;
			}
			System.out.println("Esto se va a ejecutar hasta que la condicion sea falsa");
			i++;
		}while(!prueba);
	}
}
