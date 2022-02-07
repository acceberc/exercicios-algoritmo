import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe seu salário: ");
		float salario = leia.nextFloat();
		
		float salAtualizado = (float) ((float) salario + (salario * 0.15));
		
		System.out.printf("O salário atualizado é de R$ %.2f", salAtualizado);
	}
}
