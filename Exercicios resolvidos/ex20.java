import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com um n�mero inteiro: ");
		int numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O n�mero � par!");
		} else {
			System.out.println("O n�mero � impar!");
		}

	}

}
