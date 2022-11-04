package Xadrez;

public class Torre extends Peca{

	public Torre(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
		// TODO Auto-generated constructor stub
	}
	
	public void mover(int linha, int coluna) {
		setLinha(linha);
		setColuna(coluna);
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nTorre []");
		return builder.toString();
	}
	
}
