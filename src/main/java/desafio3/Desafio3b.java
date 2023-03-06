package desafio3;

public class Desafio3b {

	public static void main(String[] args) {
		
		int num = 2;
		System.out.print(num + ", ");
		
		for(int i = 1; i <= 5; i++) {
			num *= 2;			
			System.out.print(num + ", ");			
		}
			
		System.out.println("O proximo numero da sequencia e: " + num * 2);
		System.out.println("O algoritmo da sequencia, multiplica o numero atual por 2 pra gerar o proximo numero");
	}

}
