package durante;

import java.util.Scanner;

public class ContadorInicioFinalMaiorQue {
	/*
	 * 8) O programa acima vai ter um problema quando digitarmos o primeiro valor
	 * 	 maior que o último. Resolva esse problema com um código que funcione em
	 * 	 qualquer situação.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cont = 0;
		int p = 0;
		int u = 0;
		int i = 0;
		
		System.out.println("Digite o primeiro número: ");
		p = scan.nextInt();
		
		System.out.println("Digite o último número: ");
		 u =scan.nextInt();
		
		System.out.println("Digite o intervalo: " );
		i = scan.nextInt();
		
		if( p > u) {
			cont = p;
			p = u;
			u=cont;
		
		}
		
		while (p < u) {
			System.out.print(p + " ");
			p+= i;
		}
		System.out.println("Acabou!");
	}
}
