package enquanto;

import java.util.Scanner;

public class ReceberDadosUm {
	/*
	 * 2) Faça um programa usando a estrutura “do-while” que leia a idade de várias
	 * pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou não
	 * continuar a digitar dados. No final, quando o usuário decidir parar, mostre
	 * na tela: a) Quantas idades foram digitadas b) Qual é a média entre as idades
	 * digitadas c) Quantas pessoas tem 21 anos ou mais.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int idade = 0;
		int idadeTotal = 0;
		double media = 0;
		int nPessoas = 0;
		int maisVinteUm = 0;
		String c = "s";

		do {
			System.out.println("Digite a idade: ");
			idade = scan.nextInt();
			idadeTotal += idade;
			nPessoas++;
			if (idade > 21) {
				maisVinteUm++;
			}
			scan.nextLine();
			
			System.out.println("Deseja continuar S ou N: ");
			c = scan.nextLine();
			
		} while (c.equalsIgnoreCase("s"));

		media = idadeTotal / nPessoas;

		System.out.println("Quantas idades foram digitadas " + nPessoas);
		System.out.println("Qual é a média entre as idades digitadas " + media);
		System.out.println("Quantas pessoas tem 21 anos ou mais " + maisVinteUm);
	}
}
