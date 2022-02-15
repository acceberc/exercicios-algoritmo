import java.util.Scanner;

public class ex44 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor inicial da contagem: ");
		int ini = leia.nextInt();
		System.out.println("Entre com o valor final da contagem: ");
		int fin = leia.nextInt();
		System.out.println("Entre com o valor para incremento: ");
		int incr = leia.nextInt();
	
		while (ini <= fin) {
			System.out.print(ini + " ");
			ini += incr; 
		}
		System.out.print("Acabou!");
	}

}
