package EstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do raio do circulo: ");
		double raio = sc.nextInt();

		double area = 3.14158 * raio * raio;

		System.out.printf("A area deste circulo é %.4f%n", area);

		sc.close();

	}

}
