package EstruturaCondicional;

import java.util.Scanner;

public class CodigoItem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		double total = 0;

		if (codigo == 1) {
			total = quantidade * 4.0;
		} else if (codigo == 2) {
			total = quantidade * 4.50;
		} else if (codigo == 3) {
			total = quantidade * 5.00;
		} else if (codigo == 4) {
			total = quantidade * 2.00;
		} else if (codigo == 5) {
			total = quantidade * 1.50;
		} else {
			System.out.println("Codigo não cadastrado");
		}

		System.out.printf("Total a pagar: %f2%n", total);

		sc.close();

	}

}
