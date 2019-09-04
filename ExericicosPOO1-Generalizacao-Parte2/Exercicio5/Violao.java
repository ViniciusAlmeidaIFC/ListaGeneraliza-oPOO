package Exercicio06;

public class Violao extends Cordas {

	private boolean braco;
	private boolean pestana;
	
	public boolean isBraco() {
		return braco;
	}
	public void setBraco(boolean braco) {
		this.braco = braco;
	}
	public boolean isPestana() {
		return pestana;
	}
	public void setPestana(boolean pestana) {
		this.pestana = pestana;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Violao [braco=");
		builder.append(braco);
		builder.append(", pestana=");
		builder.append(pestana);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
