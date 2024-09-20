package facaEnquanto;

import java.util.Scanner;

public class FimNumeroDigitado {
	/*4) Faça um programa usando a estrutura “for” que leia um número inteiro positivo e mostre na tela uma contagem de 0 até o valor digitado:
Ex: Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma número: ");
		int n = scan.nextInt();
		
		for (int i = 0; i <= n; i++) {
			
			System.out.print(i +", ");
		}
		System.out.println("FIM!");
	}
}
