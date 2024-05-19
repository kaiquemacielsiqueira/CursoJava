package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class CordenPlano {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("====== Cordenadas em um plano ======");

		System.out.println("Digite o valor do eixo X com uma casa decimal: ");
		double x = sc.nextDouble();
		System.out.println("Digite o valor do eixo Y com uma casa decimal: ");
		double y = sc.nextDouble();

		if (x == 0.0 && y == 0.0) {
			System.out.println("Esta na origem");
		} else if (x == 0.0) {
			System.out.println("Esta no eixo X");
		} else if (y == 0.0) {
			System.out.println("Esta no eixo X");
		} else if (y > 0.0 && x > 0.0) {
			System.out.println("Esta no quadrante 1");
		} else if (y > 0.0 && x < 0.0) {
			System.out.println("Esta no quadrante 2");
		} else if (y < 0.0 && x < 0.0) {
			System.out.println("Esta no quadrante 3");
		} else {
			System.out.println("Esta no quadrante 4");
		}

		sc.close();

	}

}
