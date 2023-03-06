package desafio3;

public class Desafio3c {

	public static void main(String[] args) {
		
		int num = 0,
			aux = 0;
		System.out.print(num + ", ");
		
		for(int i = 1; i <= 6; i++) {
			num = i * i;			
			System.out.print(num + ", ");
			aux = i + 1;
		}
			
		System.out.println("O proximo numero da sequencia e: " + aux * aux);
		System.out.println("O algoritmo da sequencia, e a ordem dos numero naturais, elevada ao quadrado");
	}

}
