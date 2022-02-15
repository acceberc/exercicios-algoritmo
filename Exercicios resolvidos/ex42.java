import java.util.Scanner;

public class ex42 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com um número inteiro: ");
		int numero = leia.nextInt();

		int contador = 0;

		while (contador <= numero) {
			System.out.print(contador++ + " ");
		}
		System.out.println("Acabou!");
	}

}
