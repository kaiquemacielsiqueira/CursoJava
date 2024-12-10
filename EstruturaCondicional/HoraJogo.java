package EstruturaCondicional;

import java.util.Scanner;

public class HoraJogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora inicial do jogo:");
		int h1 = sc.nextInt();
		System.out.println("Digite a hora final do jogo");
		int h2 = sc.nextInt();

		int duracao;

		if (h1 < h2) {
			duracao = h2 - h1;
		} else {
			duracao = 24 - h1 + h2;
		}

		System.out.println("O jogo durou " + duracao + " Horas ");
		sc.close();

	}

}
