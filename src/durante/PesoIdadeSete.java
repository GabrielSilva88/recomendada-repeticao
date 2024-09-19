package durante;

import java.util.Scanner;

public class PesoIdadeSete {
	/*
	 * 17)Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando no final: 
	 * 			a) Qual foi a média de altura do grupo 
	 * 			b) Quantas pessoas pesam mais de 90Kg 
	 * 			c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
	 * 		 	d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double cont = 0;
		double peso = 0;
		double altura = 0;
		double mediaAltura = 0;
		double totalAltura = 0;
		int peso90 = 0;
		int peso50menos160 = 0;
		int alt190mais100 = 0;

		while (cont < 7) {

			System.out.println("Digite seu peso: ");
			peso = scan.nextDouble();

			scan.nextLine(); // permite as perguntas apareção.

			System.out.println("Digite sua altura: ");
			altura = scan.nextDouble();

			totalAltura += altura;
			// b
			if (peso >= 90) {
				peso90++;
			}
			// c
			if (peso <= 50 && altura <= 1.60) {
				peso50menos160++;
			} // d
			if (altura >= 1.90 && peso >= 100) {
				alt190mais100++;
			}

			cont++;
		}

		mediaAltura = totalAltura / 7;

		System.out.printf("Qual foi a média de altura do grupo: %.2f\n", mediaAltura);
		System.out.printf("Quantas pessoas pesam mais de 90Kg: %d\n", peso90);
		System.out.printf("Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m: %d\n", peso50menos160);
		System.out.printf("Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg: %d\n", alt190mais100);

	}
}
