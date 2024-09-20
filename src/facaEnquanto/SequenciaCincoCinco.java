package facaEnquanto;

public class SequenciaCincoCinco {
	/*
	1) Desenvolva um programa usando a estrutura “for” que mostre na tela a
	seguinte contagem:
	0 5 10 15 20 25 30 35 40 Acabou!
	*/
	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i++) {
			
			System.out.print(i + " ");
			i+=4;
		}
		
		System.out.println("Acabou!");
	}
}
