package Aluno_Prof;

public class Aluno extends Pessoa{
	private int matricula;

	public Aluno(int codigo, String nome, String endereco, int matricula) {
		super(codigo, nome, endereco);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		if(matricula > 0)
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nAluno [matricula=");
		builder.append(matricula);
		builder.append("]");
		return builder.toString();
	}
}
