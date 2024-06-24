package Demo;

import java.util.Scanner;

public class FuncaoExemplos {
	/*
	 * Funções são um processamento que possuem um signifcado, exemplo é o
	 * Math.sqrt() que mostra a raiz quadrada, no caso só chamar que ela calcula.
	 * outro exemplo é o System.out.println, que é uma função. Funções tem objetivo
	 * de de ser reaproveitada varias vezes.
	 */

	// Criar uma função inicia com public (para que fique disponivel em outras
	// classes) e o static para que essa função possa ser chamada independente de se
	// criar um objeto

	// Exemplo, encontrar maior numero entre 3:
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// Criando duas funções, uma para armazenar o maior
		// A outra para mostrar o maior

		int higher = max(a, b, c);
		showResult(higher);

		sc.close();

	}

// fora da função padrão, criei uma para retornar quem é o maior, se chama max. 
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

// outra função, para mostrar quem é o maior. 
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
