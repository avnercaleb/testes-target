package desafios;

public class Desafio1 {

	public static void main(String[] args) {
		
		int indice = 13,
			soma = 0,
			k = 0;
		
		while(k < indice) {
			k = k + 1;
			soma = soma + k;
		}
		
		System.out.println("O valor da variavel soma e: " + soma);
	}

}
