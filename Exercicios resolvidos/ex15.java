import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos dias foram trabalhados? ");
		float dias = leia.nextFloat();
		
		float salario = dias * (8 * 25);
		
		System.out.printf("O salário devido é de R$ %.2f", salario);
		

	}

}
