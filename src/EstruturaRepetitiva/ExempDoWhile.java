package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExempDoWhile {

	public static void main(String[] args) {
		// Condição é testada no final, garante
		// ao menos uma execução do bloco de codigo.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;

		do {
			System.out.print("Digite a temperatura em Celsius para converter: ");
			double c = sc.nextDouble();
			double f = c * 9.0 / 5.0 + 32.0;
			System.out.printf("O equivalente em Fahrenheit: %.2f%n", f);
			System.out.print("Desenha repetir? (s/n): ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();

	}

}
