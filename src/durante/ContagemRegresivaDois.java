package durante;

public class ContagemRegresivaDois {
	
	/*4) Desenvolva um programa que mostre na tela a seguinte contagem: 100 95 90 85 80 ... 0 Acabou!*/
	
	public static void main(String[] args) {
		
		int c=105;
		while (c>=5) {
			c-=5;
			System.out.print(c + " ");
		}
		System.out.println("Acabou!");
	}
}
