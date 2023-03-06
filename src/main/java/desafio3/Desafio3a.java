package desafio3;

public class Desafio3a {

	
	public static void main(String[] args) {
		
		int num = 1;
		System.out.print(num + ", ");
		
		for(int i = 1; i <= 3; i++) {
			num += 2;
			System.out.print(num + ", ");
		}
		
		System.out.print("o proximo numero da sequencia e: " + (num + 2)+ "\n");
		System.out.println("O algoritmo da sequencia, soma o numero atual a 2 pra gerar o proximo numero");
	}

}
