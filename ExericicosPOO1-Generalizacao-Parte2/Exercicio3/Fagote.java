package Exercicio06;

public class Fagote extends Madeira {

	private float tuboConico;
	private boolean palhetaDupla;
	
	public float getTuboConico() {
		return tuboConico;
	}
	public void setTuboConico(float tuboConico) {
		this.tuboConico = tuboConico;
	}
	public boolean isPalhetaDupla() {
		return palhetaDupla;
	}
	public void setPalhetaDupla(boolean palhetaDupla) {
		this.palhetaDupla = palhetaDupla;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fagote [tuboConico=");
		builder.append(tuboConico);
		builder.append(", palhetaDupla=");
		builder.append(palhetaDupla);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
