import java.util.Scanner;

public class ex45 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int ini, fin, incr;
		
		System.out.println("Entre com o valor inicial da contagem: ");
		ini = leia.nextInt();
		System.out.println("Entre com o valor final da contagem: ");
		fin = leia.nextInt();
		
		if (ini >= fin) {
			System.out.println("O valor inicial é maior ou igual ao valor final");
		} else {
			System.out.println("Entre com o valor para incremento: ");
			incr = leia.nextInt();
			
			while (ini < fin) {
				System.out.print(ini + " ");
				ini += incr; 
			}
			System.out.print("Acabou!");
		}
		
	}

}
