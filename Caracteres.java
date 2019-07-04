package basicojava;

public class Caracteres {

	public static void main(String[] args) {

		System.out.println("--------------------------------");
		System.out.println("  Valor ASCII minusculos (a,z)  ");
		System.out.println("-------------------------------" );
		for (char ch = 'a'; ch <= 'z'; ch++) {

			System.out.println("O valor ASCII de " + ch + " é " + (int) ch);

		}
		
		System.out.println("--------------------------------");
		System.out.println("  Valor ASCII maiusculos (A,Z)  ");
		System.out.println("-------------------------------" );

		for (char ch = 'A'; ch <= 'Z'; ch++) {

			System.out.println("O valor ASCII de " + ch + " é " + (int) ch);

		}
		
		System.out.println("--------------------------------");
		System.out.println("  Valor ASCII numericos (0,9)  ");
		System.out.println("-------------------------------" );

		for (char ch = '0'; ch <= '9'; ch++) {

			System.out.println("O valor ASCII de " + ch + " é " + (int) ch);

		}


	}
}
