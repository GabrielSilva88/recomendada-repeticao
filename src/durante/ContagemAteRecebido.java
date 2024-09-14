package durante;

import java.util.Scanner;

public class ContagemAteRecebido {
	/*5) Faça um algoritmo que pergunte ao usuário um número inteiro e positivo qualquer e mostre uma contagem até esse valor:
		Ex: Digite um valor: 35 
		Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!*/
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		
		 int r = 0;
		 int c = 0;
		 
		 System.out.println("Digite um numero: ");
		 r = scan.nextInt();
		 
		 while(c < r) {
			 c++;
			 System.out.print(c + " ");
		 }
		 System.out.println("Acabou!");
	}
}
