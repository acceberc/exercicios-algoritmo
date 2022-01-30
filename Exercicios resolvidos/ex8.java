import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double distancia, km, hm, dam, dm, cm, mm;
		
		System.out.println("Entre com uma distância em metro:");
		distancia = leia.nextDouble();
		
		km = distancia / 1000;
		hm = distancia / 100;
		dam = distancia / 10;
		dm = distancia * 10;
		cm = distancia * 100;
		mm = distancia * 1000;
		
		System.out.println("A distância de " + distancia + " km corresponde a:");
		System.out.println(km + " km");
		System.out.println(hm + " hm");
		System.out.println(dam + " dam");
		System.out.println(dm + " dm");
		System.out.println(cm + " cm");
		System.out.println(mm + " mm");
		

	}

}
