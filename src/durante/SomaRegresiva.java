package durante;

public class SomaRegresiva {
	/*10) Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 + 450 + 400 + 350 + 300 + ... + 50 + 0*/
	
	public static void main(String[] args) {
		int i =500;
		int soma=0;
		
		while (i >= 0 ) {
			System.out.print(i +" + ");
			i-=50;
			soma = soma + i;
		}
		System.out.println("\nTotal da soma é "+ soma);
	}
}
