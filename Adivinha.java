package basicojava;

import java.util.Random;
import java.util.Scanner;

public class Adivinha {
	static Random random = new Random();
	private static Scanner teclado;

	public static void main(String[] args) {

		teclado = new  Scanner(System.in);
		
		boolean acertou=false;
		
		int secreto = random.nextInt(15);

		int tentativa=0;
		
		System.out.println("Digite um n�mero entre 0 e 15");
		int entrada = teclado.nextInt();
		
	    while(!acertou)
	    {
	    	if(secreto==entrada) {
	    		tentativa++;
	    		System.out.println("Parab�ns voc� acertou em "+ tentativa +" tentativa(s) !!!");
	    		acertou=true;
	    		
	    	}else {
	    		tentativa++;
	    		System.out.println("Voc� Errou!!");
	    		System.out.println("Digite novamente!!");
	    		entrada = teclado.nextInt();
	    	}
	    }
		
		System.out.println("O numero secreto � " + secreto);

	}
}
