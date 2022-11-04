package Bomba_Combustivel;

public class BombaEtanol extends Bomba{
	
	public BombaEtanol(double totalLitros, float valorLitro) {
		super(totalLitros, valorLitro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nBombaEtanol []");
		return builder.toString();
	}

	
	
}
