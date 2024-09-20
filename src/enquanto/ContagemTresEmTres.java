package enquanto;

public class ContagemTresEmTres {
	/*
	 * 1) Crie um programa que mostre na tela a seguinte contagem, usando a
	 * estrutura “do-while” 0 3 6 9 12 15 18 21 24 27 30 Acabou!
	 */
	
	public static void main(String[] args) {
		
		int n = 0;
		
		do {
			
			System.out.print(n + " ");
			n+=3;
			
		} while (n < 31);
		
		System.out.println("Acabou!");
	}
}
