package durante;

import java.util.Scanner;

public class FimUmUmUm {

	public static void main(String[] args) {

		/*
		 * 18) Crie um programa que leia vários números pelo teclado e mostre no final o
		 * somatório entre eles. Obs: O programa será interrompido quando o número 1111
		 * for digitado
		 */

		Scanner scan = new Scanner(System.in);

		int c = 0;
		int n = 0;
		int totalN = 0;

		while (n != 1111) {
			System.out.println("Digite um número: ");
			n = scan.nextInt();

			if (n != 1111) {
				totalN += n;
				c++;
			}

		}

		System.out.println("Somatorio do números recebidos é " + totalN);
		System.out.println("Quantidade de números digitados é " + c);
	}
}
