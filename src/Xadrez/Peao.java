package Xadrez;

public class Peao extends Peca{

	public Peao(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
	}
	
	public void mover(int linha, int coluna) {
		setLinha(linha);
		setColuna(coluna);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nPeao []");
		return builder.toString();
	}
}
