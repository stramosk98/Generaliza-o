package Aluno_Prof;

public class Professor extends Pessoa{
	private String disciplina;

	public Professor(int codigo, String nome, String endereco, String disciplina) {
		super(codigo, nome, endereco);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		if(disciplina.length() >= 2)
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nProfessor [disciplina=");
		builder.append(disciplina);
		builder.append("]");
		return builder.toString();
	}
	
	
}
