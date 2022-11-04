package Item;

public class VHS extends Midia{
	
	private String titulo;

	public VHS(int codigo, String descricao, String gravadora, float duracao, String titulo) {
		super(codigo, descricao, gravadora, duracao);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if(titulo.length() >= 2)
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nVHS [titulo=");
		builder.append(titulo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
