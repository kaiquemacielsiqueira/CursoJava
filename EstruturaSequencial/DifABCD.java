package EstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class DifABCD {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor do produto 1: ");
		int a = sc.nextInt();
		System.out.println("Digite o segundo valor do produto 1: ");
		int b = sc.nextInt();
		System.out.println("Digite o primeiro valor do produto 2: ");
		int c = sc.nextInt();
		System.out.println("Digite o segundo valor do produto 2: ");
		int d = sc.nextInt();

		int prod1 = a * b;
		int prod2 = c * d;
		int dif = prod1 - prod2;

		System.out.println("Valor do produto 1: " + prod1 + " / Valor do produto 2: " + prod2);
		System.out.println("A diferênça dos dois produtos é de: " + dif);

		sc.close();

	}

}
