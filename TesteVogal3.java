import java.util.Scanner;
public class TesteVogal3 {
	private static Scanner teclado;

	public static void main(String[] args) {

		/* Vamos converter o texto digitado para  maiusculo, dessa forma
		 * n�o precisamos nos preocupar como o usuario vai digitar.
		 * Para isso mudamos o tipo da vareavel 'vogal' de 'char' para 'String'
		 * Mudamos tamb�m
		 * 		 case 'A': 
		 * 	Para
		 * 		 case "A":		
		 */
		
		
		teclado = new Scanner(System.in);

		System.out.println("Digite uma vogal ");
		String vogal = teclado.next().toUpperCase();

		switch (vogal) {
		case "A":
			System.out.println("Voc� digitou a vogal A");
			break;
		case "E":
			System.out.println("Voc� digitou a vogal E");
			break;
		case "I":
			System.out.println("Voc� digitou a vogal I");
			break;
		case "O":
			System.out.println("Voc� digitou a vogal O");
			break;
		case "U":
			System.out.println("Voc� digitou a vogal U");
			break;

		default:
			System.out.println("Voc� n�o  digitou uma vogal Mai�scula");
			break;
		}

	}
}
