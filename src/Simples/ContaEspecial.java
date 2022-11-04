package Simples;

public class ContaEspecial extends Conta{
	private int diasSemJuros;
	private double limite;

	public ContaEspecial(String banco, int agenda, int numeroConta, double saldo, int diasSemJuros, double limite) {
		super(banco, agenda, numeroConta, saldo);
		this.diasSemJuros = diasSemJuros;
		this.limite = limite;
	}

	public int getDiasSemJutos() {
		return diasSemJuros;
	}

	public void setDiasSemJutos(int diasSemJuros) {
		if(diasSemJuros >= 0)
		this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		if(limite > 0)
		this.limite = limite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
