package durante;

import java.util.Scanner;

public class MaiorMenorProduto {

	/*
	 * 14) Faça um aplicativo que leia o preço de 8 produtos. 
	 * No final, mostre na tela qual foi o maior e qual foi o menor preço digitados.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] produto = new double[8];
		double maior = Double.MAX_VALUE;
		double menor = Double.MAX_VALUE;
		int c = 0;
		
		while (c < 7) {
			
			System.out.println("Digite o valor do produto");
			produto[c]= scan.nextDouble();
			
			if(produto[c] > maior) {
				maior = produto[c];
			}else {
				menor = produto[c];
			}
			System.out.println(c+" produto valor: "+produto);
			c++;
			}
		System.out.printf("Valores maior: %.2f", maior);
		System.out.printf("Valores maior: %.2f", menor);
	}
}
