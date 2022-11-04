package Ambiente;

public class Sala extends Ambiente{
	private boolean tv;

	public Sala(float area, boolean tv) {
		super(area);
		this.tv = tv;
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nSala [tv=");
		builder.append(tv);
		builder.append("]");
		return builder.toString();
	}
	
	
}
