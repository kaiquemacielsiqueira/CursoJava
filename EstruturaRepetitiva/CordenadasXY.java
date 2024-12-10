package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class CordenadasXY {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as cordenadas do plano cartesinano: (X e Y) ");
		double X = sc.nextDouble();
		double Y = sc.nextDouble();

		while (X != 0 && Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("Primeiro quadrante");

			} else if (X < 0 && Y > 0) {
				System.out.println("Segundo quadrante");

			} else if (X < 0 && Y < 0) {
				System.out.println("Terceiro quadrante");

			} else {
				System.out.println("Quarto quadrante");

			}
			X = sc.nextDouble();
			Y = sc.nextDouble();
		}

		sc.close();

	}

}
