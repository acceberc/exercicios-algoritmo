import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a velocidade do carro: ");
		int velocidade = leia.nextInt();
		
		int multa = (velocidade - 80) * 5;
		
		if (velocidade > 80) {
			System.out.println("Voc� est� acima da velocidade e ser� multado em R$" + multa);
		} else {
			System.out.println("Voc� est� dentro da velocidade permitida.");
		}

	}

}
