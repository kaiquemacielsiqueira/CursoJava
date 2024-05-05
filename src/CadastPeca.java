import java.util.Locale;
import java.util.Scanner;

public class CadastPeca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("---- Cadastro de peças ----");
		System.out.println(
				"Digite respectivamente o NÚMERO DO CÓDIGO, NÚMERO DE PEÇAS e VALOR UNITÁRIO da PRIMEIRA PEÇA: ");
		int cod1 = sc.nextInt();
		int numPec1 = sc.nextInt();
		double valUnit1 = sc.nextDouble();

		System.out.println(
				"Digite respectivamente o NÚMERO DO CÓDIGO, NÚMERO DE PEÇAS e VALOR UNITÁRIO da SEGUNDA PEÇA: ");
		int cod2 = sc.nextInt();
		int numPec2 = sc.nextInt();
		double valUnit2 = sc.nextDouble();

		double total = numPec1 * valUnit1 + numPec2 * valUnit2;

		System.out.println("Peça 1 - Codigo: " + cod1 + " Valor unitário: " + valUnit1 + " Quantidade: " + numPec1);
		System.out.println("Peça 2 - Codigo: " + cod2 + " Valor unitário: " + valUnit2 + " Quantidade: " + numPec2);
		System.out.println("Total a pagar: " + " R$ " + total);

		sc.close();

	}

}
