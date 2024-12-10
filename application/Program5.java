package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Student;

public class Program5 {

	public static void main(String[] args) {
		Student stud = new Student();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome do aluno: ");
		stud.name = sc.nextLine();
		System.out.println("Nota 1: ");
		stud.grade1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		stud.grade2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		stud.grade3 = sc.nextDouble();

		System.out.println(stud);
		if (stud.finalGrade() < 60.0) {
			System.out.println("Esta reprovado");
			System.out.printf("Faltou %.2f pontos", stud.missingPoint());
		} else {
			System.out.println("Esta aprovado!!!");
		}

		sc.close();

	}

}
