import java.util.Scanner;

public class TesteVogal4 {
	private static Scanner teclado;

	public static void main(String[] args) {

				
		teclado = new Scanner(System.in);

		System.out.println("Digite uma vogal ");
		String vogal = teclado.next().toUpperCase();

		switch (vogal) {
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			System.out.println("Voc� digitou a vogal " + vogal);
			break;
		default:
			System.out.println("Voc� n�o  digitou uma vogal");
			break;
		}

	}
}
