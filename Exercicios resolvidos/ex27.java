import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com n1: ");
		float n1 = leia.nextInt();
		System.out.println("Entre com n2: ");
		float n2 = leia.nextInt();
		
		float media = (n1+n2)/2;
		
		if(media<=4.9) {
			System.out.println("Reprovado");
		} else if (media >= 5 & media <= 6.9) {
			System.out.println("Recuperação");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		}

	}

}
