package facaEnquanto;

public class TabuadaCinco {
	/*3) Escreva um programa que leia um número qualquer e mostre a tabuada desse número, usando a estrutura “for”.
			Ex: Digite um valor: 5
			5 x 1 = 5
			5 x 2 = 10
			5 x 3 = 15 ...*/
	public static void main(String[] args) {
		
		int n = 0;
		
		for (int i = 1; i < 11; i++) {
			n+=5;
			System.out.println("5 X "+ i + " = " + n);
			
		}
		
	}
}
