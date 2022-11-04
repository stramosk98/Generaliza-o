package Xadrez;

public class Main {

	public static void main(String[] args) {
		Torre t = new Torre(1, 1, true, 3);
		t.mover(5, 1);
		System.out.println(t);

	}

}
