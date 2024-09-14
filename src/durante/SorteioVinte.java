package durante;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SorteioVinte {
	/* 13) Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e mostre na tela:
			a) Quais foram os números sorteados
			b) Quantos números estão acima de 5
			c) Quantos números são divisíveis por 3*/
	
	public static void main(String[] args) {
		Random r = new Random();
		
		int n = 0;
		int c = 0;
		int tres =0;
		int cinco = 0;
		String v ="";
		List<Integer> vl = new ArrayList<Integer>(); // lista de 20 numeros sorteados
		
		System.out.println("Sorteio de 20 números entre 0 a 10.");
		
		while (c < 20 ) {
			c++;
			n = r.nextInt(11);
			vl.add(n);
			
			if (n < 5) {
				cinco++;
			} 
			if(n % 3 ==0 && n !=0) {
				tres++;
			}
				//v += n + " "; 
					}
		
		System.out.println("números sorteados: " + vl);
		System.out.println("acima de 5 são: "+ cinco);
		System.out.println("divisíveis por 3 são: "+tres);
	}
}
