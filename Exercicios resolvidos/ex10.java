import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float largura, altura, area, tinta;
		
		System.out.println("Entre com a altura em metro: ");
		altura = leia.nextFloat();
		System.out.println("Entre com a largura em metro: ");
		largura = leia.nextFloat();

		area = altura * largura;
		tinta = area / 2;
		
		System.out.println("\nA area a ser pintada é de: " + area + " metros quadrados");
		System.out.println("Será necessário " + tinta + " litros de tinta.");
		
	}

}
