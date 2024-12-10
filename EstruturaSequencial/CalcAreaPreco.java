package EstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class CalcAreaPreco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a largura: ");
		double largura = sc.nextDouble();
		System.out.println("Digite a altura: ");
		double altura = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado: ");
		double precMetroQuad = sc.nextDouble();

		double area = largura * altura;
		double preco = precMetroQuad * area;

		System.out.printf("A area é de %.2f%n", area);
		System.out.printf("O preço é de %.2f%n", preco);

		sc.close();

	}
}
