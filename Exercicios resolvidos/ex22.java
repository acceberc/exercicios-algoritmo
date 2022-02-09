import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o ano de nascimento: ");
		int ano = leia.nextInt();
		
		int idade = 2022 - ano;
		int atraso = idade - 18;
		int falta = 18 - idade;
		
		if(idade > 19) {
			System.out.println("Você deve se alistar e está em atraso há " + atraso + " ano(s).");
		} else if (idade <= 18) {
			System.out.println("Você deve se alistar em " + falta + " ano(s).");
		}
		

	}

}
