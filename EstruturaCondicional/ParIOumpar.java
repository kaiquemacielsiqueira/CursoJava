package EstruturaCondicional;

import java.util.Scanner;

public class ParIOumpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n % 2 == 0) { // Porcentagem representa o resto da divisão, logo o resto da divisão de algo
							// por dois se der 0 é par, se der outro numero é impar.
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

		sc.close();

	}

}
