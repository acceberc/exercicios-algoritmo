import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float dinheiro, dolar;
		
		System.out.println("Quanto voc� tem em dinheiro? ");
		dinheiro = leia.nextFloat();
		
		dolar = (float) (dinheiro / 3.45);
		
		System.out.println("Voc� pode comprar US$ " + dolar);				

	}

}
