package basicojava;

public class Multiplos3 {
	public static void main(String[] args) {

		/*Imprime os multiplos de 3 entre 3  e 200*/
		
		System.out.println("\t-----------------------------------------------------------------");
		System.out.println("\t                 Multiplos de 3 até 200                          ");
		System.out.println("\t-----------------------------------------------------------------");
		
        //variavel para controlar a quantidade de tabulacao
		int contador = 0; 
		
		for (int i = 3; i <= 200; i+=3) {
			
			System.out.print("\t" + i);
			
			contador++;
			
			if(contador==9) {
				
				System.out.println();
				
				contador=0;
			}

		}

	}
}
