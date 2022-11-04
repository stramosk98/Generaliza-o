package Item;

public class CD extends Midia{
	private int faixas;
	private String artista;
	private String album;
	
	public CD(int codigo, String descricao, String gravadora, float duracao, int faixas, String artista, String album) {
		super(codigo, descricao, gravadora, duracao);
		this.faixas = faixas;
		this.artista = artista;
		this.album = album;
	}
	
	public int getFaixas() {
		return faixas;
	}
	public void setFaixas(int faixas) {
		if(faixas > 0)
		this.faixas = faixas;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		if(artista.length() >= 2)
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		if(album.length() >= 2)
		this.album = album;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nCD [faixas=");
		builder.append(faixas);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append("]");
		return builder.toString();
	}

	
	
	  	
}
