import java.util.Locale;
import java.util.Scanner;

public class Funcionario1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero do funcionario: ");
		int n = sc.nextInt();
		System.out.println("Digite o numero de horas trabalhadas: ");
		double horTrab = sc.nextDouble();
		System.out.println("Digite o valor por hora trabalhada: ");
		double valHor = sc.nextDouble();

		double salario = horTrab * valHor;

		System.out.println("O salário do funcionario " + n + " é de :");
		System.out.printf("R$ %.2f%n", salario);

		sc.close();

	}

}
