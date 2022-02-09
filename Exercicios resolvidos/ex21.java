import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o ano: ");
		int ano = leia.nextInt();
		
		if (ano % 4 == 0 || ano % 400 == 0 || ano % 100 == 0) {
			System.out.println("O ano " + ano + " é bissexto");
		}else {
			System.out.println("O ano " + ano + " não é bissexto");
		}

	}

}
