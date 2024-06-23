package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class MediaValores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double c1 = sc.nextDouble();
			double c2 = sc.nextDouble();
			double c3 = sc.nextDouble();
			double media = (c1 * 2.0 + c2 * 3.0 + c3 * 5.0) / 10.0;
			System.out.printf("%.1f%n", media);
		}

		sc.close();

	}

}
