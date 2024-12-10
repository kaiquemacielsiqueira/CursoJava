package EstruturaCondicional;

import java.util.Scanner;

public class NegativoPositivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		if (numero > 0) {
			System.out.println("Este numero é positivo");
		} else {
			System.out.println("Este numero é negativo");
		}

		sc.close();

	}

}
