package desafio4;

public class Veiculo {
	
	Double velocidade;
	Double atraso;
	
	public Veiculo(Double velocidade, Double atraso) {
		this.velocidade = velocidade;
		this.atraso = atraso;
	}

	public Double getVelocidade() {
		return velocidade;
	}

	public Double getAtraso() {
		return atraso;
	}
	
	public Double tempoDeViagem(Veiculo veiculo, Double distancia) {
		
		Double tempoViagem = (distancia / veiculo.getVelocidade())
							+ (veiculo.getAtraso() / 60);		
		return tempoViagem;
	}
	
	public Double velocidadeMedia(Double distancia, Double tempoDeViagem) {
		return distancia / tempoDeViagem;
	}
}
