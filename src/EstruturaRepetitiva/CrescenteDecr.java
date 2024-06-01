package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class CrescenteDecr {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		while (X != Y) {
			if (X < Y) {
				System.out.println("Digitos crescentes");
			} else {
				System.out.println("Digitos decrescentes");
			}
			X = sc.nextInt();
			Y = sc.nextInt();

		}

		sc.close();

	}

}
