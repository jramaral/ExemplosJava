package basicojava;

public class QuadradoNumero {

	public static void main(String[] args) {

		/*
		 * O quadrado de um numero pode ser feito da seguinte forma: (n * n), onde n é o
		 * numero em questão. Por exemplo 4²=16. Da mesma forma poderia ser a soma dos
		 * primeiros n numeros impares, no caso de 4² seria: 1+3+5+7=16
		 */

		System.out.println("O 4² é (4 * 4) = " + (4 * 4));

		System.out.println("ou também pode ser ");

		int soma = 0;
		String sinal = " + ";
		for (int i = 1; i <= 4; i++) {
			System.out.print(((i - 1) + i) + sinal);
			soma += ((i - 1) + i);
			if(i==3)
				sinal=" = ";

		}
		System.out.println(soma);

	}

}
