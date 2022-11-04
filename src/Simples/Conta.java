package Simples;

public class Conta {
	private String banco;
	private int agenda;
	private int numeroConta;
	private double saldo;
	
	public Conta(String banco, int agenda, int numeroConta, double saldo) {
		super();
		this.banco = banco;
		this.agenda = agenda;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		if(banco.length() > 0)
		this.banco = banco;
	}
	public int getAgenda() {
		return agenda;
	}
	public void setAgenda(int agenda) {
		if(agenda >= 0)
		this.agenda = agenda;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		if(numeroConta > 0)
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if(saldo >= 0)
		this.saldo = saldo;
	}
	
	public void deposito(double valor) {
		setSaldo(getSaldo() + valor);
	}
	
	public void saque(double valor) {
		if(getSaldo() >= valor)
		setSaldo(getSaldo() - valor);
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agenda=");
		builder.append(agenda);
		builder.append(", numeroConta=");
		builder.append(numeroConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
