package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("             Hitss Treinamento");
		System.out.println("");
		try {
			int num1, num2, num3;
			System.out.println("Digite o 1º número:");
			Scanner teclado = new Scanner(System.in);
			num1 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 2º número:");
			num2 = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o 3º número:");
			num3 = teclado.nextInt();
			System.out.println("");
			if ((num1 < num2) && (num1 < num3)) {
				System.out.println("O 1º número é o menor.");
			} else if ((num2 < num1) && (num2 < num3)) {
				System.out.println("O 2º número é o menor.");
			} else if ((num3 < num2) && (num3 < num1)) {
				System.out.println("O 3º número é o menor.");
			} else {
				System.out.println("Por favor, refaça a redigitagem");
			}
 			
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
