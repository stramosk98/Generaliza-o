package Item;

public class Livro extends Item {
	private String autor;

	public Livro(int codigo, String descricao, String autor) {
		super(codigo, descricao);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if(autor.length() >= 2)
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nLivro [autor=");
		builder.append(autor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
