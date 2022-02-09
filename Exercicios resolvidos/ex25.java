import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com valor1: ");
		int valor1 = leia.nextInt();
		System.out.println("Entre com valor2: ");
		int valor2 = leia.nextInt();
		System.out.println("Entre com valor3: ");
		int valor3 = leia.nextInt();
		
		if (valor1 + valor2 >= valor3 & valor2 + valor3 >= valor1 & valor3 + valor1 >= valor2) {
			System.out.println("É possível formar um triangulo");
		} else {
			System.out.println("Não é possível formar um triangulo");
		}

	}

}
