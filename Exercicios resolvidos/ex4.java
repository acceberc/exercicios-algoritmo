import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor1, valor2;
		
		System.out.println("Digite um valor: ");
		valor1 = leia.nextInt();
		System.out.println("Digite outro valor: ");
		valor2 = leia.nextInt();
		
		System.out.println("\nA soma entre " + valor1 + " e " + valor2 + " é igual a " + (valor1 + valor2));

	}

}
