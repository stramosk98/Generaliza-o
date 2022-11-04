package Animal;

public class Reptil extends Animal{
	private boolean marinho;

	public Reptil(String origem, boolean estimacao, boolean marinho) {
		super(origem, estimacao);
		this.marinho = marinho;
	}

	public boolean isMarinho() {
		return marinho;
	}

	public void setMarinho(boolean marinho) {
		this.marinho = marinho;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nReptil [marinho=");
		builder.append(marinho);
		builder.append("]");
		return builder.toString();
	}
	
	
}
