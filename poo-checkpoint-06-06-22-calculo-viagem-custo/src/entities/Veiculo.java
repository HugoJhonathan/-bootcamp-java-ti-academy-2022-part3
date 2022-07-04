package entities;

public class Veiculo {
	private int qtdPassageiros;
	private double capacidadeTanque;
	private double consumo;
	
	public Veiculo(int qtdPassageiros, double capacidadeTanque, double consumo) {
		this.qtdPassageiros = qtdPassageiros;
		this.capacidadeTanque = capacidadeTanque;
		this.consumo = consumo;
	}
	
	public double getcapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setcapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public double getqtdPassageiros() {
		return qtdPassageiros;
	}

	public void setqtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public double tanqueViagem(double quilometro) {
		return quilometro/(capacidadeTanque*consumo);
	}
	public double dividirDespesas(double quilometro, double combustivel) {
		return quilometro/consumo*combustivel/qtdPassageiros;
	}
	
	public String toString() {
		return "O veículo comporta "+qtdPassageiros
		+ " pessoas, tem uma capacidade de "+capacidadeTanque
		+ " Litros de combustível, e faz "+consumo
		+ " KM/L";
	}
	
	
}
