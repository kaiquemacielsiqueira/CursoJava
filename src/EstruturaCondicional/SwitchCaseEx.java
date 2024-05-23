package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Digite o dia da semana em número: ");
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "invalido/Erro";
		}

		System.out.println("Dia da semana é " + dia);

		sc.close();

	}

}
