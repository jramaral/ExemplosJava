
public class TesteArray {

	public static void main(String[] args) {

		int[] numeros = new int[3];

		numeros[0] = 8;
		numeros[1] = 4;
		numeros[2] = 29;

		// imprimindo os valores do array
		System.out.println("-------------------\n" + "usando system out println" + "\n-------------------");
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);

		// usando for
		System.out.println("-------------------\n" + "Usando Laço For" + "\n-------------------");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		// usando While
		System.out.println("-------------------\n" + "Usando Laço While" + "\n-------------------");
		
		int contador=0;
		while (contador<numeros.length) {
			System.out.println(numeros[contador]);
			contador++;
		}
	}
}
