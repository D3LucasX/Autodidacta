package ConversionDeTipos;

public class ConversionDeTipos {

	public static void main(String[] args) {
		String numeroStr = "50";
		
		
		int numeroInt = Integer.parseInt(numeroStr);
		System.out.println("numeroInt = " + numeroInt);
		
		String realStr = "989786.43e-4";
		double realDouble = Double.parseDouble(realStr);
		System.out.println("realDouble = " + realDouble);
		
		//Solo aplica con true o t y false o f, no con yes, no, 1 o 0
		String logicoStr = "true";
		boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
		System.out.println("logicoBoolean = " + logicoBoolean);
		
		
		// Ahora pasaremos numeros enteros a Strings
		
		int numeroStr2 = 98;
		String numeroStr23 = String.valueOf(numeroStr2+10);
		System.out.println("numeroStr23 cadena = " + numeroStr23);
		// Se podra hacer con Sstring.valueof o con Integer.toString, al igual que con el resto
		// de tipos de datos.
		
		
		
		// Conversion entre tipos primitivos
		
			// Solo habra perdida de datoa cuando intentas pasar de un tipo de dato
			// mas grande a uno mas pequeño, por ejemplo de int a short, entonces 
			// habría que hacer el casting.
			
			// Haciendo el casting no habría perdida de informacion siempre que el valor del tipo de dato mayor
			// entrara dentro del tipo de dato menor, si no, si quw se haria la conversión pero
			// con perdida de datos.
			int i = 10000;
			short s = (short) i;
			
			// Pero de un tipo de dato mas pequeño a uno mas grande no habría problema
			// ya que no habría perdida de informacion ya que el valor entra en ese 
			// tipo de dato.
			long l = i;
			// No se puede castear un int a un boolean
			// a un char si que se puede.
			
	}

}
