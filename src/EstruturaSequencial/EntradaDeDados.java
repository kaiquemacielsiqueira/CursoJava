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
		// Observe que o printf saiu com virgula e o println com ponto, pois no brasil o
		// padrão é virgula mas o println faz a conversão sozinho, para imprimir com
		// virgua preciso colocar o printf.

		char y;
		System.out.println("Digite a palavra para mostrar a primeira letra: ");
		y = sc.next().charAt(0);
		System.out.println("Você digitou " + y);
		// na hora que eu chamei o leitor, chamei junto uma função para armazenar o
		// char, como é para armazenar apenas uma letra, você pode até digitar mais, mas
		// só ira mostrar a primeira letra da palavra.
		sc.close();

	}

}
