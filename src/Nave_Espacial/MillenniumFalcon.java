package Nave_Espacial;

public class MillenniumFalcon extends Apolo11{
	private float classeHiperpropulsor;

	public MillenniumFalcon(double velocidadeMaxima, String tipoCombustivel, float classeHiperpropulsor) {
		super(velocidadeMaxima, tipoCombustivel);
		this.classeHiperpropulsor = classeHiperpropulsor;
	}

	public float getClasseHiperpropulsor() {
		return classeHiperpropulsor;
	}

	public void setClasseHiperpropulsor(float classeHiperpropulsor) {
		this.classeHiperpropulsor = classeHiperpropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nMillenniumFalcon [classeHiperpropulsor=");
		builder.append(classeHiperpropulsor);
		builder.append("]");
		return builder.toString();
	}
	
	

}
