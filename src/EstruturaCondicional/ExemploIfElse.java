package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Que horas são? 0 a 24 em inteiros: ");
		int hora = sc.nextInt();

		if (hora >= 0 & hora < 12) {
			System.out.println("Bom dia");
		} else if (hora >= 12 & hora < 18) {
			System.out.println("Boa tarde");
		} else if (hora >= 18 & hora <= 24) {
			System.out.println("Boa noite");
		} else {
			System.out.println("Digito invalido");
		}

		sc.close();

	}

}
