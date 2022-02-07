import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com valor para A: ");
		int A = leia.nextInt();
		System.out.println("Entre com valor para B: ");
		int B = leia.nextInt();
		System.out.println("Entre com valor para C: ");
		int C = leia.nextInt();
		
		int delta = (int) (Math.pow(B,2) - (4 *(A * C)));
		
		System.out.println("O valor de delta é: " + delta);

	}

}
