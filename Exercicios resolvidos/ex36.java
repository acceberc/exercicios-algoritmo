import java.util.Scanner;

public class ex36 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de horas de atividade f�sica foi feita no m�s: ");
		int horas = leia.nextInt();
		
		if (horas < 10) {
			System.out.println("Voc� ganhou " + (horas * 2) + " pontos.");
			System.out.println("Isso equivale a R$ " + ((horas * 2) * .05 ));
		} else if (horas >= 10 & horas < 20) {
			System.out.println("Voc� ganhou " + (horas * 5) + " pontos.");
			System.out.println("Isso equivale a R$ " + ((horas * 5) * .05 ));
		} else {
			System.out.println("Voc� ganhou " + (horas * 10) + " pontos.");
			System.out.println("Isso equivale a R$ " + ((horas * 10) * .05 ));
		}

	}

}
