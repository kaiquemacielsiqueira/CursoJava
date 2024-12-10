package EstruturaRepetitiva;

import java.util.Scanner;

public class FatorialDoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int fator = 1;

		for (int i = 1; i <= n; i++) {
			fator = fator * i;
			System.out.println(fator);
		}

		sc.close();

	}

}
