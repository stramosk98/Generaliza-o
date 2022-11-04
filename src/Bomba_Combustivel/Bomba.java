package Bomba_Combustivel;

public class Bomba {
	private double totalLitros;
	private float valorLitro;
	
	public Bomba(double totalLitros, float valorLitro) {
		super();
		this.totalLitros = totalLitros;
		this.valorLitro = valorLitro;
	}
	
	public double getTotalLitros() {
		return totalLitros;
	}
	public void setTotalLitros(double totalLitros) {
		if(valorLitro >= 0)
		this.totalLitros = totalLitros;
	}
	public float getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(float valorLitro) {
		if(valorLitro >= 0)
		this.valorLitro = valorLitro;
	}
	
	public void abastecerPorLitro(int litros) {
		if(litros <= getTotalLitros())
		setTotalLitros(getTotalLitros() - litros);
	}
	
	public void abastecerPorValor(double valor) {
		if(valor / getValorLitro() <= getTotalLitros()) {
			setTotalLitros(getTotalLitros() - (valor / getValorLitro()));
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}
	
	
}
