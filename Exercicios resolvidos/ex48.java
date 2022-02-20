import java.util.Scanner;

public class ex48 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com o valor 1: ");
		int v1 = leia.nextInt();
		System.out.println("Entre com o valor 2: ");
		int v2 = leia.nextInt();
		System.out.println("Entre com o valor 3: ");
		int v3 = leia.nextInt();
		System.out.println("Entre com o valor 4: ");
		int v4 = leia.nextInt();
		System.out.println("Entre com o valor 5: ");
		int v5 = leia.nextInt();
		System.out.println("Entre com o valor 6: ");
		int v6 = leia.nextInt();
		System.out.println("Entre com o valor 7: ");
		int v7 = leia.nextInt();

		int soma = v1 + v2 + v3 + v4 + v5 + v6 + v7;
		
		System.out.println(soma);
	}

}
