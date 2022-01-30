import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salario;
		
		System.out.println("Entre com nome do funcionário: ");
		String nome = leia.next();
		System.out.println("Entre com valor do salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\nNome do funcionário: " + nome);
		System.out.println("Salário: " + salario);
		System.out.println("O funcionário " + nome + " tem um salário de R$ " + salario + " em Junho.");

	}

}
