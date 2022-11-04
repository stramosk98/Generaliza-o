package Veiculo;

public class Caminhao extends Veiculo{
	private int eixos;

	public Caminhao(boolean motor, int eixos) {
		super(motor);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		if(eixos > 0)
		this.eixos = eixos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nCaminhao [eixos=");
		builder.append(eixos);
		builder.append("]");
		return builder.toString();
	}
}
