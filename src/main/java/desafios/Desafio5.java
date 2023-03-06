package desafios;

import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		
		String palavra;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a palavra que deseja inverter: ");
		palavra = sc.next();
		
		System.out.println(invertePalavra(palavra));
		
		
		sc.close();
	}
	
	static String invertePalavra(String palavra) {
		
		String palavraInvertida = "";
		
		for(int i = palavra.length() - 1; 0 <= i; i--) {
			palavraInvertida += palavra.charAt(i);
		}
		return palavraInvertida;
	}
}
