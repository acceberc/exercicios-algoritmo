import java.util.Scanner;

public class ex37 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe seu salário atual: ");
		double salario = leia.nextDouble();
		System.out.println("Informe seu genero: ");
		System.out.println("\n[1] Feminino \n[2] Masculino");
		double genero = leia.nextDouble();
		System.out.println("Há quantos anos você trabalha na empresa?");
		double anos = leia.nextDouble();
		
		if (genero == 1 & anos < 15) {
			System.out.println("Seu novo salário é: R$ " + (salario + (salario * 0.05)));
		} else if (genero == 1 & anos >= 15 & anos <20) {
			System.out.println("Seu novo salário é: R$ " + (salario + (salario * 0.12)));
		} else if (genero == 1 & anos >= 20) {
			System.out.println("Seu novo salário é: R$ " + (salario + (salario * 0.23)));
		}
		
		if (genero == 2 & anos < 20) {
			System.out.println("Seu novo salário é: R$ " + (salario + (salario * 0.03)));
		} else if (genero == 2 & anos >= 20 & anos <30) {
			System.out.println("Seu novo salário é: R$ " + (salario + (salario * 0.13)));
		} else if (genero == 2 & anos >= 30) {
			System.out.println("Seu novo salário é: R$ " + (salario + (salario * 0.25)));
		}

	}

}
