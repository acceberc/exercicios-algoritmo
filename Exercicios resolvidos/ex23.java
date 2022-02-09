import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome? ");
		String nome = leia.next();
		System.out.println("Informe seu gênero: \n[1] Feminino \n[2] Masculino");
		int genero = leia.nextInt();
		System.out.println("Qual é o valor total da sua compra? ");
		float valor = leia.nextFloat();
		
		float descontoM = (float) (valor - (valor * 0.13));
		float descontoH = (float) (valor - (valor * 0.05));
		
		if(genero <= 1) {
			System.out.println("Parabéns, " + nome + "! \nO valor total da sua compra com 13% de desconto é R$ " + descontoM);
		} else if (genero >= 2) {
			System.out.println("Parabéns, " + nome + "! \nO valor total da sua compra com 5% de desconto é R$ " + descontoH);
		}
		

	}

}
