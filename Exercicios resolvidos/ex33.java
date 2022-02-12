import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe o valor da casa: ");
		double casa = leia.nextDouble();
		System.out.println("Informe seu salário: ");
		double salario = leia.nextDouble();
		System.out.println("Em quantos anos o pagamento será realizado? ");
		int anos = leia.nextInt();
		
		double pagamento = casa / (anos * 12);
				
		
		if (salario * 0.3 > pagamento) {
			System.out.println("O empréstimo foi aprovado");
			System.out.printf("\nA prestação mensal é de R$ %.2f",pagamento);
		} else {
			System.out.println("O emprestimo foi negado");
		}


	}

}
