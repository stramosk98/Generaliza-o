package Bomba_Combustivel;

public class BombaDiesel extends Bomba{

	public BombaDiesel(double totalLitros, float valorLitro) {
		super(totalLitros, valorLitro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nBombaDiesel []");
		return builder.toString();
	}
	
	
}
