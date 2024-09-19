package durante;

import java.util.Scanner;

public class IdadeLeitura {

	public static void main(String[] args) {

		/*
		 * 15) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final: a)
		 * Qual é a média de idade do grupo b) Quantas pessoas tem mais de 18 anos c)
		 * Quantas pessoas tem menos de 5 anos d) Qual foi a maior idade lida
		 */

		Scanner scan = new Scanner(System.in);

		int c = 0;
		int dezoito = 0;
		int cinco = 0;
		double media = 0;
		int maior = 0;
		int total =0;
		
		while (c < 10) {

			System.out.println("Digite sua idade: ");
			int id = scan.nextInt();

			total = total + id;

			if (id >= 18) {
				dezoito++;
			}

			if (id <= 5) {
				cinco++;
			}

			if (id > maior) {
				maior = id;
			}

			c++;
		}

		media = (double) total / 10;

		System.out.println("Média de idade do grupo: " + media);
		System.out.println("Pessoas mais de 18 anos: " + dezoito);
		System.out.println("Pessoas tem menos de 5 anos: " + cinco);
		System.out.println("A maior idade lida: " + maior);
	}
}
