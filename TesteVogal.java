import java.util.Scanner;

public class TesteVogal {

	private static Scanner teclado;
	public static void main(String[] args) {
		
		teclado=  new Scanner(System.in);
		
		System.out.println("Digite uma vogal Maiuscula ");
		char vogal = teclado.next().charAt(0);
		
		if(vogal=='A') {
			System.out.println("Voc� digitou a vogal A");
		}else if(vogal == 'E') {
			System.out.println("Voc� digitou a vogal B");
		}else if(vogal == 'I') {
			System.out.println("Voc� digitou a vogal I");
		}else if(vogal == 'O') {
			System.out.println("Voc� digitou a vogal O");
		}else if(vogal == 'U') {
			System.out.println("Voc� digitou a vogal U");
		}else {
			System.out.println("Voc� n�o  digitou uma vogal Mai�scula");
		}
		
	}
}
