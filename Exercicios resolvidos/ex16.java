import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Quantos cigarros voc� fuma por dia em m�dia? ");
		int qntCigarros = leia.nextInt();
		
		System.out.println("Por quantos anos voc� fuma? ");
		int anos = leia.nextInt();
		
		float dias = anos * 365;
		float min = dias * 1440;
		
		float totalCig = qntCigarros * dias;
		float reducao = (totalCig * 10) / 1440;
		
		System.out.println("At� o momento voc� fumou cerca de " + totalCig + " cigarros.");
		System.out.println("Voc� perdeu cerca de " + reducao + " dias de vida");
		
		
	}
}
