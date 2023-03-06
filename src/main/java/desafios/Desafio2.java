package desafios;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com um numero e veja se ele pertence a sequencia de Fibonnacci: ");
		Integer consulta = sc.nextInt();
		
		if(consulta == 0 || consulta == 1) {
			System.out.println("O numero pertence a sequencia de Fibonacci!");			
		}
		else {
			fibonacci(consulta);
		}
		
		
		sc.close();
	}
	
	static void fibonacci(int consulta) {
		int numeroAtual = 1,
			numeroAnterior = 0,
			aux = 0;
		
		System.out.print("Sequencia gerada: " );
		System.out.print(numeroAnterior + " ");
		System.out.print(numeroAtual + " ");
		
		while(numeroAtual < consulta) {
			aux = numeroAtual;
			numeroAtual = numeroAtual + numeroAnterior;
			numeroAnterior = aux;	
			
			System.out.print(numeroAtual + " ");
			
			if(numeroAtual == consulta) {
				System.out.println("\n" + "O numero pertence a sequencia de Fibonacci!");
				break;
			}
			else if(numeroAtual > consulta) {
				System.out.println("\n" + "O numero nao pertence a sequencia de Fibonacci!");
				break;
			}
		}
	}
		
}
