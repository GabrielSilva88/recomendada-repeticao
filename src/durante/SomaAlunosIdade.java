package durante;

import java.util.Scanner;

public class SomaAlunosIdade {
	/*
	 * 20) Faça um algoritmo que leia a idade de vários alunos de uma turma. O
	 * programa vai parar quando for digitada a idade 999. No final, mostre quantos
	 * alunos existem na turma e qual é a média de idade do grupo.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int idade =0;
		int totalIdade =0;
		int qtdAluno =0;
		double media =0;
		
		while (idade != 999) {
			
			System.out.println("digite a idade do aluno: ");
			idade = scan.nextInt();
		
			qtdAluno++;
			
			totalIdade+=idade;	
			
		}
		
		media = totalIdade / qtdAluno;
		
		System.out.println("Total do alunos é "+qtdAluno);
		System.out.println("Media de idade é "+ media);
		
		
		
		
	}
}
