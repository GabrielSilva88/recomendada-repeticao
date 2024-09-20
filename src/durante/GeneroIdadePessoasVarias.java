package durante;

import java.util.Scanner;

public class GeneroIdadePessoasVarias {
/*21) Crie um programa que leia o gênero e a idade de várias pessoas. O programa vai perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
a) qual é a maior idade lida
b) quantos homens foram cadastrados
c) qual é a idade da mulher mais jovem
d) qual é a média de idade entre os homens*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*		a) qual é a maior idade lida
				b) quantos homens foram cadastrados
				c) qual é a idade da mulher mais jovem
				d) qual é a média de idade entre os homens
		 */
		
		int maiorIdade =Integer.MAX_VALUE;
		int qtdHomem =0;
		int maisJovem = Integer.MIN_VALUE;
		double media =0;
		int idade =0;
		int totalIdade = 0;
		String cont = "S";
		String genero = "";
		
		while(!genero.equalsIgnoreCase("s")) {
			
			System.out.println("Digite a idade: ");
			idade = scan.nextInt();
			
			System.out.println("Digite o genero: ");
			genero = scan.nextLine();
			
			totalIdade += idade;
			
			if(genero.equalsIgnoreCase("m")) {
				qtdHomem++;
			}
			if(genero.equalsIgnoreCase("f") && idade < 18) {
				maisJovem++;
			}
			
			System.out.println("Deseja encerrar o programa, (S) sim ou (N) não: ");
			cont = scan.nextLine();
			
		}
		
		media = totalIdade / qtdHomem;
	}
}
