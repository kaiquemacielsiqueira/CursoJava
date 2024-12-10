package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class IrRombus {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(" --- Imposto da cidade ficticia de Lisarb --- ");
		System.out.println("Digite o salario com duas casas decimais: ");
		double salario = sc.nextDouble();
		double imposto;

		if (salario <= 2000.00) {
			imposto = 0.00;

		} else if (salario <= 3000.00) {
			imposto = (salario - 2000) * 0.08;

		} else if (salario <= 4500.00) {
			imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
		} else {
			imposto = (salario - 4500) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
		}
		if (imposto == 0.00) {
			System.out.println("Isento");
		} else {
			System.out.printf("Imposto a pagar R$ %.2f%n", imposto);
		}

		sc.close();

	}

}
