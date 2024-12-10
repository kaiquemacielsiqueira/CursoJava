package EstruturaCondicional;

import java.util.Scanner;

public class ExemMultiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int n2 = sc.nextInt();

		if (n1 % n2 == 0 || n2 % n1 == 0) {// Parece complicado, mas um numero multiplo se dividido um pelo outro da
											// resto da divisão zero.
			System.out.println("Estes numeros são multiplos");
		} else {
			System.out.println("Estes numeros não são multiplos");
		}

		sc.close();

	}

}
