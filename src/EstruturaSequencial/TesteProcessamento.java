package EstruturaSequencial;

public class TesteProcessamento {

	public static void main(String[] args) {

		int y, x;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);

		int b, B, h;
		b = 6;
		B = 8;
		h = 5;
		int area = (b + B) / 2 * h;
		System.out.println(area);

		int e, f;
		double resultado;
		e = 5;
		f = 2;
		resultado = (double) 5 / 2; // Daria 2.0, pq divisão de numeros interioros, mas colocando double ele faz um
									// casting, que seria a conversão explicita destes valores.
		System.out.println(resultado);

	}

}
