import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com valor1: ");
		int valor1 = leia.nextInt();
		System.out.println("Entre com valor2: ");
		int valor2 = leia.nextInt();
		System.out.println("Entre com valor3: ");
		int valor3 = leia.nextInt();
		
		if (valor1 == valor2 & valor2 == valor3) {
			System.out.println("EQUILÁTERO: todos os lados iguais");
		} else if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3) {
			System.out.println("ISÓSCELES: dois lados iguais");
		} else {
			System.out.println("ESCALENO: todos os lados diferentes");
		}

	}

}
