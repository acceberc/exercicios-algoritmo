
public class ex43 {

	public static void main(String[] args) {
		int contador = 30;

		while (contador >= 1) {
			if (contador % 4 == 0) {
				System.out.print("[" + contador-- + "] ");
			}			
			System.out.print(contador-- + " ");	
		}

	}

}
