import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float numero, dobro, tercaParte;
		
		System.out.println("Digite um número: ");
		numero = leia.nextFloat();
		dobro = numero * 2;
		tercaParte = numero / 3;
		
		System.out.println("O dobro de " + numero + " é " + dobro);
		System.out.println("A terça parte de " + numero + " é " + tercaParte);
		
	}
}
