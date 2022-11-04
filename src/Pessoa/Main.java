package Pessoa;

public class Main {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Zeka", "Budag", "111.222.333-44", "Solteiro");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Severino", "SP", "111.222.333-44", "Simples");
		System.out.println(pj);
	}

}
