import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salario;
		
		System.out.println("Entre com nome do funcion�rio: ");
		String nome = leia.next();
		System.out.println("Entre com valor do sal�rio: ");
		salario = leia.nextFloat();
		
		System.out.println("\nNome do funcion�rio: " + nome);
		System.out.println("Sal�rio: " + salario);
		System.out.println("O funcion�rio " + nome + " tem um sal�rio de R$ " + salario + " em Junho.");

	}

}
