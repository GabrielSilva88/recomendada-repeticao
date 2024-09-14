package durante;

public class SomaRepeticao {
	/* 9) Crie um programa que calcule e mostre na tela o resultado da soma entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.*/

	public static void main(String[] args) {
		
		int i = 6;
		int soma =0;
		
		while (i < 102) {
			
			System.out.print(i +" + ");
			i +=2;
			soma = soma + i;
		}
		System.out.println( "\nA soma é " + soma);
	}
}
