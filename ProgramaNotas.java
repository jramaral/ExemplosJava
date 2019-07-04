import java.util.Scanner;

public class ProgramaNotas {
	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		System.out.println("Digite a nota 1");
		float n1 = teclado.nextFloat();
		
		System.out.println("Digite a nota 2");
		float n2 = teclado.nextFloat();
		
		System.out.println("Digite a nota 3");
		float n3 = teclado.nextFloat();
		
		float media = (n1+n2+n3)/3;
		System.out.printf("A média final é %.2f",media);
		
		
	}
}
