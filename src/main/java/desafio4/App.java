package desafio4;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Para a resolução desse problema, precisamos definir um ponto de referencia
		 * para o calculo. O ponto escolhido foi a cidade de Ribeirão Preto.
		 * Foram necessarios calculos do tempo de viagem de cada veiculo.
		 * Assim como foi necessario calcular a velocidade media do caminhão,
		 * ja que com as 2 paradas, sua velocidade não se mantem constante.
		 * Com base nesses resultados obtidos, precisamos apenas calcular o ponto
		 * onde eles se encontram*/
		
		DecimalFormat df = new DecimalFormat("0.0");
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		Double distancia = 100d;
		Veiculo caminhao = new Veiculo(80d, 10d);
		Veiculo carro = new Veiculo(110d, 0d);
		
		Double tempoViagemCaminhao = caminhao.tempoDeViagem(caminhao, distancia);
		Double tempoViagemCarro = carro.tempoDeViagem(carro, distancia);
		Double velocidadeMediaCaminhao = caminhao.velocidadeMedia(distancia, tempoViagemCaminhao);
		
		Double encontro = (carro.getVelocidade() * distancia) / (carro.getVelocidade() + velocidadeMediaCaminhao);
		
		System.out.println("O tempo de viagem do caminhao foi de: " + df.format(tempoViagemCaminhao) + "h");
		System.out.println("O tempo de viagem do carro foi de: " + df.format(tempoViagemCarro) + "h");
		System.out.println("A velocidade media do caminhao e de: " + df.format(velocidadeMediaCaminhao) + "KM/h");
		System.out.println("Os veiculos se encontraram a uma distancia de: " + df.format(encontro) + "Km de Ribeirao Preto");
		System.out.println("Portanto estao ambos a mesma distancia da cidade");
	}

}
