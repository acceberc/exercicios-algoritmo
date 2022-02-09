import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o ano de nascimento: ");
		int ano = leia.nextInt();
		
		int idade = 2022 - ano;
		
		if (idade >= 18) {
			System.out.println("Você deve votar");
		} else if (idade >= 16 & idade <17) {
			System.out.println("Voto opcional");
		} else {
			System.out.println("Você não pode votar");
		}

	}

}
