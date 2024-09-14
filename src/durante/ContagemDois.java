package durante;

public class ContagemDois {
	
	/* 3) Crie um aplicativo que mostre na tela a seguinte contagem: 0 3 6 9 12 15 18 Acabou!*/
	
	public static void main(String[] args) {
		int n = 0;
		
		while (n <= 18) {
			
			System.out.print(n + " ");
			n+=3;
		}
		System.out.println("Acabou!");
	}
}
