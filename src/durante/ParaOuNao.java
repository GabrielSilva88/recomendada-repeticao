package durante;

import java.util.Scanner;

public class ParaOuNao {
	/*
	 * 19) Desenvolva um aplicativo que leia o salário e o gênero de vários
	 * funcionários. No final, mostre o total de salários pagos aos homens e o total
	 * pago às mulheres. O programa vai perguntar ao usuário se ele quer continuar
	 * ou não sempre que ler os dados de um funcionário.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double totalHomem = 0;
		double totalMulher = 0;
		double salario = 0;
		String genero;
		int cont = 0;
		while (cont != 2) {

			System.out.println("Digite o salario: ");
			salario = scan.nextDouble();

			scan.nextLine();

			System.out.println("Digite o genero (F / M): ");
			genero = scan.nextLine();
			
			if (genero.equalsIgnoreCase("f")) {
				totalMulher += salario;

			}
			
			if (genero.equalsIgnoreCase("m")) {
				totalHomem += salario;
			} 
		
			System.out.println("Deseja continuar, 1 para Sim ou 2 para Não?\nDigite: ");
			cont = scan.nextInt();
			
			if(cont >= 3) {
				System.out.println("Opção invalida, digite 1 ou 2.");
			}
		}
		
		System.out.printf("Fim do Programa\nValor total do Salario do homem: %.2f, salario total das mulheres: %.2f",totalHomem, totalMulher);

	}
}
