package durante;

import java.util.Scanner;

public class IdadeGenero {
	/*
	 * 16) Faça um programa que leia a idade e o gênero de 5 pessoas, mostrando no final: 
	 * 		a) Quantos homens foram cadastrados 
	 * 		b) Quantas mulheres foram cadastradas 
	 * 		c) A média de idade do grupo 
	 * 		d) A média de idade dos homens 
	 * 		e) Quantas mulheres tem mais de 20 anos
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String genero; // genero
		int idade =0;
		int totalIdade = 0;
		int c= 0;
		int totalHomem =0;
		int totalMulher =0;
		double mediaIdadeGrupo = 0;
		double idadeHomem = 0;
		int mulherMais20 = 0;
		double mediaHomens =0;
		
		while (c < 5) {

			System.out.println("Digite seu idade: ");
			idade = scan.nextInt();
			
			scan.nextLine();
			
			System.out.println("Digite sua genero masculino ou feminino ( M / F ): ");
			genero = scan.nextLine();
			
			if(genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("masculino")) {
				totalHomem++;
				idadeHomem+=idade;
			}
			
			if (genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("feminino")) {
				totalMulher++;
				if (idade > 20 ) {
					mulherMais20++;
				}
			}
			
			totalIdade += idade;
			c++;
		}
		
		mediaIdadeGrupo = idade + idade / 5;

		System.out.println("Quantos homens foram cadastrados: "+ totalHomem);
		System.out.println("Quantas mulheres foram cadastradas: "+ totalMulher);
		System.out.println("A média de idade do grupo: " + mediaIdadeGrupo);
		System.out.println("A média de idade dos homens: "+ idadeHomem);
		System.out.println("Quantas mulheres tem mais de 20 anos: "+mulherMais20);
		
	}
}

/*totalIdade+= idade;

if (genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("masculino")) {
	homem++;
	mediaHomem+=idade;
}

if (genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("feminino")) {
	mulher++;
	if(idade > 20) {
		maisVinte++;
	}
}

c++;	*/