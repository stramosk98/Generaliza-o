package Bomba_Combustivel;

public class BombaGasolina extends Bomba{

	public BombaGasolina(double totalLitros, float valorLitro) {
		super(totalLitros, valorLitro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaGasolina []");
		return builder.toString();
	}
	
}
