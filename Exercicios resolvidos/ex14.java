import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos dias foi alugado? ");
		float dias = leia.nextFloat();
		
		System.out.println("Quantos kilometros foram rodados?");
		float km = leia.nextFloat();
		
		float valorDias = dias * 90;
		float valorKm = (float) (km * 0.20);
		
		System.out.printf("\nValor total diária: R$ %.2f",valorDias);
		System.out.printf("\nValor total km: R$ %.2f",valorKm);
		System.out.printf("\nValor total a pagar: R$ %.2f",(valorDias + valorKm));
		
	}

}
