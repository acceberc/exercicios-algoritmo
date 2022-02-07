import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o valor do produto: ");
		float produto = leia.nextFloat();
		
		float promocional = (float) ((float) produto - (produto * 0.15));
		
		System.out.printf("O valor promocional é de R$ %.2f", promocional);
		

	}
}
