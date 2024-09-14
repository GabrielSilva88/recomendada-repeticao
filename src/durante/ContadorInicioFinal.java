package durante;

import java.util.Scanner;

public class ContadorInicioFinal {
	/*7) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o incremento, 
	 * 	 mostrando em seguida todos os valores no intervalo:
			Ex: Digite o primeiro Valor: 3
			Digite o último Valor: 10
			Digite o incremento: 2
			Contagem: 3 5 7 9 Acabou!*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ini = 0;
		int end = 0;
		int inc = 0;
		
		System.out.println("Digite o valor inicial: ");
		ini=scan.nextInt();
		System.out.println("Digite o valor final: ");
		end = scan.nextInt();
		System.out.println("Digite o valor do incremento: ");
		inc = scan.nextInt();
		
		while (ini < end) {	
			System.out.print(ini+" ");
			ini +=inc;
		}
		System.out.println("Acabou!");
	}
}
