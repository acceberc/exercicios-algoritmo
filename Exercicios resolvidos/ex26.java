import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com primeiro valor: ");
		int n1 = leia.nextInt();
		System.out.println("Entre com segundo valor: ");
		int n2 = leia.nextInt();
		
		if (n1 > n2) {
			System.out.println("O primeiro valor é o maior");
		} else if (n2 > n1) {
			System.out.println("O segundo valor é o maior");
		} else {
			System.out.println("Não existe valor maior, os dois são iguais");
		}
	}

}
