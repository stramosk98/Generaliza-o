package Simples;

public class ContaSimples extends Conta{
	
	private double saldoPoupanca;

	public ContaSimples(String banco, int agenda, int numeroConta, double saldo, double saldoPoupanca) {
		super(banco, agenda, numeroConta, saldo);
		this.saldoPoupanca = saldoPoupanca;
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		if(saldoPoupanca >= 0)
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public void depositoPoupanca(double valor) {
		setSaldoPoupanca(getSaldoPoupanca() + valor);
	}
	
	public void saquePoupanca(double valor) {
		if(getSaldoPoupanca() >= valor)
		setSaldoPoupanca(getSaldoPoupanca() - valor);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append("]");
		return builder.toString();
	}
	
	
}
