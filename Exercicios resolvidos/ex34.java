import java.util.Scanner;

public class ex34 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe seu peso em KG: ");
		float peso = leia.nextFloat();
		System.out.println("Informe sua altura em metro: ");
		float altura = leia.nextFloat();

		float imc = (float) (peso / (Math.pow(altura, 2)));

		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc >= 18.5 & imc < 25) {
			System.out.println("Peso ideal");
		} else if (imc >= 25 & imc < 30) {
			System.out.println("Sobrepeso");
		} else if (imc >= 30 & imc < 40) {
			System.out.println("Obesidade");
		} else {
			System.out.println("Obesidade mórbida");
		}

	}

}
