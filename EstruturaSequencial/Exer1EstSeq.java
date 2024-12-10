package EstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class Exer1EstSeq {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int n2 = sc.nextInt();

		int soma = n1 + n2;
		System.out.println("A soma de " + n1 + " + " + n2 + " é: " + soma);

		sc.close();

	}

}
