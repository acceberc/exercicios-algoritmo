import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe seu sal�rio: ");
		float salario = leia.nextFloat();
		
		float salAtualizado = (float) ((float) salario + (salario * 0.15));
		
		System.out.printf("O sal�rio atualizado � de R$ %.2f", salAtualizado);
	}
}
