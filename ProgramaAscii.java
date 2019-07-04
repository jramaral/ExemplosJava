package basicojava;

public class ProgramaAscii {

	public static void main(String[] args) {

				
		System.out.println("\t-----------------------------------------------------------------");
		System.out.println("\t                       TABELA ASCII                        ");
		System.out.println("\t-----------------------------------------------------------------");
		
        //variavel para controlar a quantidade de tabulacao
		int contador = 0; 
		
		for (char i = 33; i < 255; i++) {
			
			System.out.print("\t" +  i);
			
			contador++;
			
			if(contador==9) {
				
				System.out.println();
				
				contador=0;
			}

		}

	}
}
