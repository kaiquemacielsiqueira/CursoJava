package Entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	// Construtor geralmente depois dos atributos da classe (poderia ser outros
	// nomes mas por conveção usamos o mesmo nome).
	public Product(String name, double price, int quantity) {

	}

	public double totalValueStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueStock());

	}

}
