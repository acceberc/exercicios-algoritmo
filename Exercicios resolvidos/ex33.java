import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe o valor da casa: ");
		double casa = leia.nextDouble();
		System.out.println("Informe seu sal�rio: ");
		double salario = leia.nextDouble();
		System.out.println("Em quantos anos o pagamento ser� realizado? ");
		int anos = leia.nextInt();
		
		double pagamento = casa / (anos * 12);
				
		
		if (salario * 0.3 > pagamento) {
			System.out.println("O empr�stimo foi aprovado");
			System.out.printf("\nA presta��o mensal � de R$ %.2f",pagamento);
		} else {
			System.out.println("O emprestimo foi negado");
		}


	}

}
