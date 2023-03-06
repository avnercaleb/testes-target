package desafio3;

public class Desafio3e {

	public static void main(String[] args) {
		
		int atual = 1,
			ant = 1,
			aux = 0;
			
		System.out.print(ant + ", ");
		System.out.print(atual + ", ");
		
		for(int i = 0; i <= 3; i++) {
			aux = atual;
			atual += ant;
			ant = aux;
			System.out.print(atual + ", ");
		}
		
		System.out.println("o proximo numero da sequencia e: " + (atual += ant));
		System.out.println("O algoritmo da sequencia, e a sequencia de Fibonacci, onde o proximo numero, e a soma do numero atual mais o numero anterior a ele");
	}

}
