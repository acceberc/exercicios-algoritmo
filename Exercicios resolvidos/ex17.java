import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a velocidade do carro: ");
		int velocidade = leia.nextInt();
		
		int multa = (velocidade - 80) * 5;
		
		if (velocidade > 80) {
			System.out.println("Você está acima da velocidade e será multado em R$" + multa);
		} else {
			System.out.println("Você está dentro da velocidade permitida.");
		}

	}

}
