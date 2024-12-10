package EstruturaRepetitiva;

import java.util.Scanner;

public class ParesDeNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n = sc.nextInt();

		double div = 0;
		for (int i = 0; n > i; i++) {
			double p1 = sc.nextInt();
			double p2 = sc.nextInt();
			if (p1 <= 0 && p2 <= 0) {
				System.out.println("Divisão impossivel");
			} else {
				div = p1 / p2;
				System.out.println(div);
			}

		}

		sc.close();

	}

}
