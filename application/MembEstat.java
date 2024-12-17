package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class MembEstat {
//Primeiro exemplo de membros estaticos

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		// Como a classe Calculator tem operações e constantes estaticas, eu pude
		// declarar todo mundo na classe como estatico, e usar diretamente as operações
		// através do nome da classe, sem precisar instanciar um objeto.

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();

	}

}
