import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o tipo de carro: ");
		System.out.println("\n[1] Popular \n[2] Luxo");
		int tipo = leia.nextInt();
		System.out.println("Por quantos dias o carro foi alugado?");
		int dias = leia.nextInt();
		System.out.println("Quantos km foram percorridos?");
		int km = leia.nextInt();
		
		double aluguelP = 90;
		double aluguelL = 150;
		
		if (tipo == 1 & km < 100) {
			System.out.println("O valor a ser pago é R$ " + ((km * 0.2) + aluguelP));
		} else if (tipo == 1 & km >= 100) {
			System.out.println("O valor a ser pago é R$ " + ((km * 0.1) + aluguelP));
		}
		
		if (tipo == 2 & km < 200) {
			System.out.println("O valor a ser pago é R$ " + ((km * 0.3) + aluguelL));
		} else if (tipo == 2 & km >= 200) {
			System.out.println("O valor a ser pago é R$ " + ((km * 0.25) + aluguelL));
		}

	}

}
