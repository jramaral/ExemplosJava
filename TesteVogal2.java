import java.util.Scanner;

public class TesteVogal2 {

	private static Scanner teclado;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);

		System.out.println("Digite uma vogal Maiuscula ");
		char vogal = teclado.next().charAt(0);

		switch (vogal) {
		case 'A':
			System.out.println("Você digitou a vogal A");
			break;
		case 'E':
			System.out.println("Você digitou a vogal E");
			break;
		case 'I':
			System.out.println("Você digitou a vogal I");
			break;
		case 'O':
			System.out.println("Você digitou a vogal O");
			break;
		case 'U':
			System.out.println("Você digitou a vogal U");
			break;

		default:
			System.out.println("Você não  digitou uma vogal Maiúscula");
			break;
		}

	}
}
