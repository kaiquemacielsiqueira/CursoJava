package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class MemEstatDollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();

		System.out.println("How many dollar will be bought?");
		double numberDollar = sc.nextDouble();

		double payDollar = CurrencyConverter.realToDollar(dollarPrice, numberDollar);
		System.out.printf("Amount to be paid in reais = %.2f%n ", payDollar);

		sc.close();

	}

}
