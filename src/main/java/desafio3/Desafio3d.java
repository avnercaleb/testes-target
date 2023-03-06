package desafio3;

public class Desafio3d {

	public static void main(String[] args) {
		
		int num = 2,
			aux = 0;
		
		for(int i = 2; i <= 8;) {
			num = i * i;			
			System.out.print(num + ", ");			
			i += 2;
			aux = i;
		}
			
		System.out.println("O proximo numero da sequencia e: " + aux * aux);
		System.out.println("O algoritmo da sequencia, e a ordem dos numero naturais pares, elevada ao quadrado");
	}

}
