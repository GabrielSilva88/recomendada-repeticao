package facaEnquanto;

import java.util.Scanner;

public class DesafioFibonacci {
/*DESAFIO 
Faça um programa que mostre os 10 primeiros elementos da Sequência
de Fibonacci:
1 1 2 3 5 8 13 21...*/
	
	public static void main(String[] args) {
		
		int t1 = 0;
		int t2 = 1;
		
		for (int i = 0; i < 10; i++) {
	
			int pt = t1 + t2;
			t1 = t2;
			t2 = pt;
	
			System.out.print(pt + " ");
			
		}
		
	}
}
