package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Que horas são? 0 a 24 em inteiros: ");
		int hora = sc.nextInt();

		if (hora >= 0 & hora < 12) {
			System.out.println("Bom dia"); // se cair aqui, "Bom dia" existe, se não cair não existe, vai ser desalocado
											// da memoria.
		} else if (hora >= 12 & hora < 18) {
			System.out.println("Boa tarde");
		} else if (hora >= 18 & hora <= 24) {
			System.out.println("Boa noite");
		} else {
			System.out.println("Digito invalido");
		}

		// Qualquer variavel que for declarada dentro de uma estrutura condicional,
		// somente irão existir durante a execução daquela estrutura, exemplo disso
		// é que se eu criar um if-else com uma condição dentro, ela só pode ser
		// inicializada e só ira existir dentro do escopo da estrutura condicional
		// Exemplo disso é que se eu coloco alguma variavel dentro do if-else, ela só
		// existe neste escopo, se você tentar printar fora não irá compilar,
		// pois não irá existir.

		// Exemplo:
		// if (codição) {
		// bloco de codigo que só existe quando a condição for verdadeira, saindo desta
		// condição não existe mais e sai da memória
		// }
		// um System.out.println(bloco de codigo); fora da condição não ira funcionar,
		// pois não existe.

		sc.close();

	}

}
