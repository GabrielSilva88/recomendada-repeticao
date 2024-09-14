package durante;

import java.util.Scanner;

public class SetimoInteiro {
	/*
	 	11) Faça um programa que leia 7 números inteiros e no final mostre o somatório entre eles.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = 0;
		int soma = 0;
		
	
		while (n < 8) {
			System.out.println("Digite um número: ");
			n = scan.nextInt();
			n++;
			soma += n;
		}
		System.out.println(" total " + soma);
	}
}
