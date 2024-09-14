package durante;

import java.util.Scanner;

public class ParesInteiros {
	
	/* 12) Crie um programa que leia 6 números inteiros e no final mostre quantos deles são pares e quantos são ímpares. */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int par =0;
		int cont =0;
		int impar = 0;
		
		while (cont < 7) {
			System.out.println("Digite um número: ");
			int t = scan.nextInt();
			if( t % 2 ==0 ) {
				par++;
			}else {
				impar++;
			}
			cont++;
		}
		
		System.out.println("Números pares são: " + par);
		System.out.println("Números pares são: " + impar);
		
	}
}
