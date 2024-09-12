package durante;

public class ContagemRegresiva {
	/* 2) Faça um algoritmo que mostre na tela a seguinte contagem: 10 9 8 7 6 5 4 3 Acabou!*/

	public static void main(String[] args) {
		
		int n = 11;
		
		while (n >= 4) {
			n--;
			System.out.print(n+" ");
		}
		System.out.print("Acabou!");
	}
}
