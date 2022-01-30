import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, antecessor, sucessor;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		antecessor = numero - 1;
		sucessor = numero + 1;
		
		System.out.println("O antecessor de " + numero + " é " + antecessor);
		System.out.println("O sucessor  de " + numero + " é " + sucessor);
	}

}
