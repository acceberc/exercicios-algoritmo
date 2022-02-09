import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a distância desejada em KM: ");
		int km = leia.nextInt();
		
		if(km <= 200) {
			System.out.println("O valor da viagem fica em R$" + km * 0.5);
		} else {
			System.out.println("O valor da viagem fica em R$" + km * 0.45);
		}

	}

}
