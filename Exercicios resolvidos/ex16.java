import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Quantos cigarros você fuma por dia em média? ");
		int qntCigarros = leia.nextInt();
		
		System.out.println("Por quantos anos você fuma? ");
		int anos = leia.nextInt();
		
		float dias = anos * 365;
		float min = dias * 1440;
		
		float totalCig = qntCigarros * dias;
		float reducao = (totalCig * 10) / 1440;
		
		System.out.println("Até o momento você fumou cerca de " + totalCig + " cigarros.");
		System.out.println("Você perdeu cerca de " + reducao + " dias de vida");
		
		
	}
}
