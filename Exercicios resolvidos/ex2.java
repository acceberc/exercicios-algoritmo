import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual � o seu nome? ");
		String nome = leia.next();
		
		System.out.println("Ol� " + nome + ", � um prazer te conhecer!");
	}

}
