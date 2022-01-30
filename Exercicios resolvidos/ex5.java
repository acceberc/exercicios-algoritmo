import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float n1, n2;
		
		System.out.println("Entre com Nota1: ");
		n1 = leia.nextFloat();
		System.out.println("Entre com Nota2: ");
		n2 = leia.nextFloat();

		System.out.println("A média entre " + n1 + " e " + n2 + " é igual a " + (n1+n2)/2);
		
	}

}
