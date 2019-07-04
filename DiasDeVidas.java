import java.util.Scanner;

public class DiasDeVidas {

	private static Scanner teclado;
	
	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		int totalDias = idade * 365;
		System.out.println("Você tem "+ totalDias + " dias de vida.");
		
	}
	
}
