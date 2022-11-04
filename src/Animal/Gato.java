package Animal;

public class Gato extends Mamifero{
	private String nome;
	private int idade;
	private String sexo;
	
	public Gato(String origem, boolean estimacao, boolean terrestre, String nome, int idade, String sexo) {
		super(origem, estimacao, terrestre);
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 1)
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade >= 0)
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		if(sexo.equalsIgnoreCase("macho") || sexo.equalsIgnoreCase("femea"))
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nGato [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
