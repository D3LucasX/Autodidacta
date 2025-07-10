package EtiquetasSentenciasBucle;

public class EtiquetasSentenciasBucle {

	public static void main(String[] args) {
		
		bucle1:
			for(int i = 0; i < 5 ; i++) {
				if (i == 2) {
					continue bucle1;
				}
				System.out.println(" i = " + i);
			}
		System.out.println("");
		
		bucle2:
			for(int i = 0; i < 3; i++) {
				
				for(int j = 0; j < 3; j++) {
					if (i == 2) {
						continue bucle2;
					}
					System.out.println("i = " + i + ", j = " + j);
				}
			}
		
		System.out.println("");
		bucle3:
			for(int i = 0; i < 3; i++) {
				
				for(int j = 0; j < 3; j++) {
					if (i == 2) {
						continue;
					}
					System.out.println("i = " + i + ", j = " + j);
				}
			}
	}

}
