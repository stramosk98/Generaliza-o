package Animal;

public class Animal {
	
	private String origem;
	private boolean estimacao;
	
	public Animal(String origem, boolean estimacao) {
		super();
		this.origem = origem;
		this.estimacao = estimacao;
	}
	
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		if(origem.length() > 1)
		this.origem = origem;
	}

	public boolean isEstimacao() {
		return estimacao;
	}
	public void setEstimacao(boolean estimacao) {
		this.estimacao = estimacao;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [origem=");
		builder.append(origem);
		builder.append(", estimacao=");
		builder.append(estimacao);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
