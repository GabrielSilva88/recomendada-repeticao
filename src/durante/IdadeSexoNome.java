package durante;

import java.util.Scanner;

public class IdadeSexoNome {

	/*22) Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
a) O nome da pessoa mais velha
b) O nome da mulher mais jovem
c) A média de idade do grupo
d) Quantos homens tem mais de 30 anos
e) Quantas mulheres tem menos de 18 anos*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String cont="S";
		String nome="";
		String sexo="";
		String nomePessoa = "";
		String nomeMulher="";
		int maisVelha = Integer.MIN_VALUE;
		int maisJovem = Integer.MAX_VALUE;
		int idade =0;
		int totalIdade =0;
		double mediaIdade = 0;
		int homensMais30 =0;
		int mulherMenos18 =0;
		int n = 0;
		
		while(cont.equalsIgnoreCase("S")) {
			
			System.out.println("Digite a idade: ");
			idade = scan.nextInt();
			
			scan.nextLine();
			
			System.out.println("Digite o sexo: ");
			sexo = scan.nextLine();
			
			System.out.println("Digite o Nome: ");
			nome = scan.nextLine();
			
			totalIdade +=idade;
			n++;
			
			if (idade > maisVelha) {
				maisVelha = idade;
				nomePessoa = nome;
			}
			if (idade < maisJovem && sexo.equalsIgnoreCase("f")) {
				maisJovem = idade;
				nomeMulher =nome;
			}
			if(sexo.equalsIgnoreCase("f") && idade < 18) {
				mulherMenos18++;
			}
			
			if(sexo.equalsIgnoreCase("m") && idade > 30) {
				homensMais30++;
			}
			
			System.out.println("Deseja continuar? ");
			cont = scan.nextLine();
			
		}
		
		mediaIdade = (double) totalIdade / n;
		
		System.out.println("Fim do programa.");
		System.out.println("O nome da pessoa mais velha "+nomePessoa);
		System.out.println("O nome da mulher mais jovem " +nomeMulher);
		System.out.println("A média de idade do grupo "+mediaIdade);
		System.out.println("Quantos homens tem mais de 30 anos " + homensMais30);
		System.out.println("Quantas mulheres tem menos de 18 anos "+ mulherMenos18);
		
	}
}
