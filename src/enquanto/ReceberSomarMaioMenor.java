package enquanto;

import java.util.Scanner;

public class ReceberSomarMaioMenor {
	/*3) Crie um programa usando a estrutura “do-while” que leia vários números.
A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
tela:
a) O somatório entre todos os valores
b) Qual foi o menor valor digitado
c) A média entre todos os valores
d) Quantos valores são pares*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		int soma =0;
		int menor = Integer.MIN_VALUE;
		double media =0;
		int par =0;
		int n =0;
		String cont ="s";
		
		do {
			System.out.println("Digite o número: ");
			numero = scan.nextInt();
			soma += numero;
			n++;
			if(numero % 2 == 0) {
				par++;
			}
			if(menor < numero) {
				menor = numero;
			}			
			
			scan.nextLine();
			System.out.println("Deseja continuar S ou N ?");
			cont = scan.nextLine();
			
		} while (cont.equalsIgnoreCase("s"));
		
		media = soma / numero;
		
		System.out.println("O somatório entre todos os valores" + soma);
		System.out.println("Qual foi o menor valor digitado "+ menor);
		System.out.printf("A média entre todos os valores ", media);
		System.out.println("Quantos valores são pares "+par);
	}
}
