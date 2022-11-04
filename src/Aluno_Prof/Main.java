package Aluno_Prof;

public class Main {

	public static void main(String[] args) {
		
			Aluno aluno = new Aluno(1, "Robson", "Rio do Sul", 226);
			System.out.println(aluno);
			
			Professor prof = new Professor(2, "José", "Itajaí", "Natação");
			System.out.println(prof);
	}
}
