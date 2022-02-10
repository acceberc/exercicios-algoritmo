import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha o numero referente a sua opção: ");
		System.out.println("[0] Pedra");
		System.out.println("[1] Papel");
		System.out.println("[2] Tesoura");
		
		System.out.println("Jogador 1: ");
		int opcao1 = leia.nextInt();
		
		System.out.println("Jogador 2: ");
		int opcao2 = leia.nextInt();
		
		switch (opcao1){
			case 0: 
				switch (opcao2){
					case 0:
						System.out.println("Empate");
						break;
					case 1:
						System.out.println("Jogador 2 ganhou");
						break;
					case 2:
						System.out.println("Jogador 1 ganhou");
						break;
						default: 
							System.out.println ("USUARIO BURRO DO CARALHO");
				} break;
			case 1:
				switch(opcao2) {
					case 0: 
						System.out.println("Jogador 1 ganhou");
						break;
					case 1:
						System.out.println(" Empatou");
						break;
					case 2:
						System.out.println("Jogador 2 ganhou");
						break;
					default: 
						System.out.println ("Opção inválida");
				} break;
			case 2:
				switch(opcao2) {
						case 0:
							System.out.println("Jogador 2 ganhou");
							break;
						case 1:
							System.out.println("Jogador 1 ganhou");
							break;
						case 2:
							System.out.println("Empate");
							break;
						default: 
				            System.out.println ("Opção inválida");
				} break;
			default: 
				System.out.println ("Opção inválida");
		}
		
		
	}

}
