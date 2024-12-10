package EstruturaSequencial;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x;
		System.out.println("Digite o valor: ");
		x = sc.nextDouble();
		System.out.println("Você digitou " + x);
		System.out.printf("Você digitou: %.1f%n", x);

		char y;
		System.out.println("Digite a palavra para mostrar a primeira letra: ");
		y = sc.next().charAt(0);
		System.out.println("Você digitou " + y);

		sc.close();

	}

}
