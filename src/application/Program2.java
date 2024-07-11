package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();

		System.out.print("Price: ");
		product.price = sc.nextDouble();

		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();

		System.out.println(product); // Esta fazendo chamada pra product, que entende que tem um toString lá

		sc.close();

	}

}