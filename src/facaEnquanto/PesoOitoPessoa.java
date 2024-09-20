package facaEnquanto;

import java.util.Iterator;
import java.util.Scanner;

public class PesoOitoPessoa {
	/*5) Crie um programa que leia gênero e peso de 8 pessoas, usando a estrutura
“for”. No final, mostre na tela:
a) Quantas mulheres foram cadastradas
b) Quantos homens pesam mais de 100Kg
c) A média de peso entre as mulheres
d) O maior peso entre os homens*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String genero;
		int mulher = 0;
		int homem =0;
		double mediaPesoMulher=0;
		int maiorPesoHomem = 0;
		double peso=0;
		double pesoMulher=0;
		double totalPeso=0;
		
		
	for (int i = 0; i < 8; i++) {
		
		System.out.println("Digite seu peso: ");
		peso = scan.nextDouble();
		
		scan.nextLine();
		
		System.out.println("Digite o gênero, F ou M: ");
		genero=scan.nextLine();
				
		if (genero.equalsIgnoreCase("F")) {
			mulher++;
			pesoMulher += peso;
		}
		if (genero.equalsIgnoreCase("M")) {
			if(peso > 100) {
				homem++;
				maiorPesoHomem+=peso;
				}
			}
		
	}
	mediaPesoMulher = pesoMulher / mulher;
	
	System.out.printf("Quantas mulheres foram cadastradas %d\n", mulher);
	System.out.printf("Quantos homens pesam mais de 100Kg %d\n", homem);
	System.out.printf("A média de peso entre as mulheres %.2f\n", mediaPesoMulher);
	System.out.printf("O maior peso entre os homens %.2f\n", maiorPesoHomem );
	
	
	
	}
}
