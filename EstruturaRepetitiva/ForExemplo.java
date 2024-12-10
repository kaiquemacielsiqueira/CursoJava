package EstruturaRepetitiva;

import java.util.Scanner;

public class ForExemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int SOMA = 0;

		for (int I = 0; I < N; I++) {
			int X = sc.nextInt();
			SOMA += X;
		}

		System.out.println(SOMA);

		sc.close();

	}

}
