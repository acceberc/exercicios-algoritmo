import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Qual � o seu nome? ");
		String nome = leia.next();
		
		System.out.println("Entre com N1: ");
		double n1 = leia.nextDouble();
		System.out.println("Entre com N2: ");
		double n2 = leia.nextDouble();
		
		double media = (n1+n2)/2;
		
		if(media>=7) {
			System.out.println("Parab�ns, sua nota est� acima da m�dia!");
		}
		
		System.out.println("Ol�, " + nome + "\nSua m�dia �: " + media);
	}

}
