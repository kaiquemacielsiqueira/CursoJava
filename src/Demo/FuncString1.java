package Demo;

public class FuncString1 {

	public static void main(String[] args) {
		// Exemplos:

		String original = "Kaique MACIEL SiqueIRA    ";
		System.out.println("Original: - " + original + " - ");

		String s1 = original.toLowerCase();
		System.out.println("toLowerCase: - " + s1 + " - ");

		String s2 = original.toUpperCase();
		System.out.println("toUpperCase: - " + s2 + " - ");

		String s3 = original.trim();
		System.out.println("Trim: - " + s3 + " - ");

		String s4 = original.substring(2);
		System.out.println("substring(2): - " + s4 + " - ");

		String s5 = original.substring(2, 9);
		System.out.println("substring(2,9): - " + s5 + " - ");

		String s6 = original.replace("a", "x");
		System.out.println("replace(a, x): - " + s6 + " - ");

		int i = original.indexOf("a");
		int j = original.lastIndexOf("A");
		System.out.println("i teve sua primeira ocorrencia em: " + i + " e j teve sua ultima ocorrencia em: " + j);

	}

}
