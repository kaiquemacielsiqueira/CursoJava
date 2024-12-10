package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class PostoDeCombustiveis {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alco = 0;
		int gaso = 0;
		int dies = 0;

		int combustivel = sc.nextInt();

		while (combustivel != 4) {
			if (combustivel == 1) {
				alco += 1;
			} else if (combustivel == 2) {
				gaso += 1;
			} else if (combustivel == 3) {
				dies += 1;
			}

			combustivel = sc.nextInt();

		}
		System.out.println("Muito obrigado");
		System.out.println("Alcool: " + alco);
		System.out.println("Gasolina: " + gaso);
		System.out.println("Diesel: " + dies);

		sc.close();

	}

}
