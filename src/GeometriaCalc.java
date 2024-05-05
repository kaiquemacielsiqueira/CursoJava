import java.util.Locale;
import java.util.Scanner;

public class GeometriaCalc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("--- Calculo de area formas Geometricas ---");
		System.out.println("Digite os valores de A, B e C respectivamente: ");

		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		triangulo = a * c / 2.0;
		circulo = 3.14158 * c * c;
		trapezio = (a + b) / 2.0 * c;
		quadrado = b * b;
		retangulo = a * b;

		System.out.println("-------------------------------------------------");
		System.out.println("Valores digitados: " + a + " , " + b + " e " + c);
		System.out.println("-------------------------------------------------");
		System.out.println("Área do triângulo retângulo que tem A por base e C por altura.");
		System.out.printf("Triangulo: %.3f%n", triangulo);
		System.out.println("-------------------------------------------------");
		System.out.println("Área do círculo de raio C.");
		System.out.printf("Circulo: %.3f%n", circulo);
		System.out.println("-------------------------------------------------");
		System.out.println("Área do trapézio que tem A e B por bases e C por altura.");
		System.out.printf("Trapézio: %.3f%n", trapezio);
		System.out.println("-------------------------------------------------");
		System.out.println("Área do quadrado que tem lado B.");
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.println("-------------------------------------------------");
		System.out.println("Área do retângulo que tem lados A e B.");
		System.out.printf("Retangulo: %.3f%n", retangulo);
		System.out.println("-------------------------------------------------");
		sc.close();

	}

}
