import java.util.Scanner;

public class ex49 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n, num, contPar = 0, contImpar = 0;

		for (n = 1; n <= 6; n++) {
			System.out.println("Entre com o " + n + "� n�mero: ");
			num = leia.nextInt();

			if (num % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}

		}

		System.out.println("Foram digitados " + contPar + " n�meros pares");
		System.out.println("Foram digitados " + contImpar + " n�meros impares");

	}

}
