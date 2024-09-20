package facaEnquanto;

import java.util.Scanner;

public class DesafioPa {
	/*DESAFIO  
Desenvolva um programa que leia o primeiro termo e a razão de uma
PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e a soma entre todos os valores da sequência.*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int soma =0;
		int n = 0;
		int r = 0;
		int t =0;
		
		System.out.println("Digite o primeiro termo: ");
		n=scan.nextInt();
		
		System.out.println("Digite a razão: ");
		r = scan.nextInt();
		
		for (int i = 0; i <= 10; i++) {			
		
			t = (n + i) * r;
			System.out.print( t + " ");
			soma += t;
		}
		
		System.out.println("\nResulatado e Soma da Progressão Aritmética: "+soma);
	}
}
