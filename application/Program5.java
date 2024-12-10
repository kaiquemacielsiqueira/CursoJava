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

		sc.close();

	}

}
