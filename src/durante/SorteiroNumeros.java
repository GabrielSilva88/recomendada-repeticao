package durante;

import java.util.Random;
import java.util.Scanner;

public class SorteiroNumeros {
	/*
	 * DESAFIO Vamos melhorar o jogo que fizemos no exercício de adivinhação. A
	 * partir de agora, o computador vai sortear um número entre 1 e 10 e o jogador
	 * vai ter 4 tentativas para tentar acertar.
	 */

	/*
	 * exercício de adivinhação
	 * 
	 * Crie um jogo onde o computador vai sortear um número entre 1 e 5 o jogador
	 * vai tentar descobrir qual foi o valor sorteado.
	 */

	public static void main(String[] args) {

		Random r = new Random();
		Scanner scan = new Scanner(System.in);

		int c = 0;
		int nAle = r.nextInt(5) + 1;
		int nu = 0;

		System.out.println("Digite um número de 1 a 5");
		
		while (c < 4) {

			System.out.println("Digite um número: ");
			nu = scan.nextInt();
			if (c < 4) {

				if (nAle == nu) {
					System.out.println("Acertou, "+ nu + " é igual "+ nAle);
					break;
				} else {
					System.out.println("Tente novamente.");
				}
			}else {
				System.out.println("4, tentaticas você não ganhou, número do serteio: " + nAle);
			}
			c++;
		}

	}
}
