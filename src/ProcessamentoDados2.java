import java.util.Scanner;

public class ProcessamentoDados2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;

		x = sc.nextInt();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// O s1 vai aparecer vazio, pois o "enter" que foi a quebra de lnha consumiu
		// ele. Sempre que for usar outro comando diferente do nextLine, o nextline ira
		// consumir a quebra de linha. Isso se resolve fazendo um NextLine extra, antes
		// do nextLine de seu interesse, sem a variavel so colocar mesmo
		// "sc.nextLine();"

	}

}
