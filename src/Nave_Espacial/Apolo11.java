package Nave_Espacial;

public class Apolo11 extends NaveEspacial{
	private String tipoCombustivel;

	public Apolo11(double velocidadeMaxima, String tipoCombustivel) {
		super(velocidadeMaxima);
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		if(tipoCombustivel.length() > 0)
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nApolo11 [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append("]");
		return builder.toString();
	}
	
	
}
