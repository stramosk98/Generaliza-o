package Ambiente;

public class Quarto extends Ambiente{
	private int capacidade;

	public Quarto(float area, int capacidade) {
		super(area);
		this.capacidade = capacidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		if(capacidade > 0)
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nQuarto [capacidade=");
		builder.append(capacidade);
		builder.append("]");
		return builder.toString();
	}
	
	
}
