import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com seu nome: ");
		String nome = leia.next();
		System.out.println("Qual � o seu salario? ");
		float salario = leia.nextFloat();
		System.out.println("H� quantos anos voc� trabalha na empresa?");
		int anos = leia.nextInt();
		
		if (anos<3) {
			System.out.println("Seu novo sal�rio �: R$ " + (salario + (salario * 0.03)));
		} else if (anos>=3 & anos<10) {
			System.out.println("Seu novo sal�rio �: R$ " + (salario + (salario * 0.125)));
		} else {
			System.out.println("Seu novo sal�rio �: R$ " + (salario + (salario * 0.20)));
		}

	}

}
