import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com largura: ");
		int largura = leia.nextInt();
		System.out.println("Entre com comprimento: ");
		int comprimento = leia.nextInt();
		
		int area = largura * comprimento;
		
		if (area<100) {
			System.out.println("Terreno popular");
		} else if (area>100 & area<500) {
			System.out.println("Terreno Master");
		} else {
			System.out.println("Terreno VIP");
		}
	}

}
