package EstruturaCondicional;

import java.util.Locale;

public class ExpreCondTernaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// Exemplo abaixo de como uma expressão condicional ternaria pode ser uma opção
		// em situações em que queremos decidir um valor com base em uma condição
		// Abaixo o mesmo codigo em if-else e em Expressão ternaria.

		double preco = 34.5;
		double desconto;

		// exemplo if-else
		if (preco < 20.0) {
			desconto = preco * 0.01;
		} else {
			desconto = preco * 0.05;
		}

		// exemplo expressão condicional ternaria
		double preco1 = 34.5;
		double desconto1 = (preco1 < 20.0) ? preco1 * 0.01 : preco1 * 0.05;
		// decidir valor por condição - =(condição)se verdadeira : se falsa.

		// Para decidir o desconto crio uma condição se preco1 é menor que 20.0, quando
		// a condição for verdadeira ele irá execurar o primeiro calculo antes do :,
		// quando for falsa ira executar o segundo depois do :

	}

}
