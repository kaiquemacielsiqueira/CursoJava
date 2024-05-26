package EstruturaRepetitiva;

import java.util.Scanner;

public class ExemploWhile {
	// While é uma estrutura de controle que repete um bloco de comando
	// ENQUANTO a condição for verdadeira.
	// É usada quando não sabemos previamente a quantidade de repetições que será
	// realizada.
	// è bem parecido com o if, a diferença é que ele volta e o if não.

	// exemplo abaixo de programa que solicita que digite numeros até o zero ser
	// digitado
	// quando zero for digitado ele soma todos os numeros digitados.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma = soma + x; // ou soma +=x;
			x = sc.nextInt();
		}

		System.out.println(soma);

		sc.close();

	}

}
