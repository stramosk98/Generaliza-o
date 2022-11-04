package Animal;

public class Mamifero extends Animal{
	private boolean terrestre;

	public Mamifero(String origem, boolean estimacao, boolean terrestre) {
		super(origem, estimacao);
		this.terrestre = terrestre;
	}

	public boolean isTerrestre() {
		return terrestre;
	}

	public void setTerrestre(boolean terrestre) {
		this.terrestre = terrestre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nMamifero [terrestre=");
		builder.append(terrestre);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
