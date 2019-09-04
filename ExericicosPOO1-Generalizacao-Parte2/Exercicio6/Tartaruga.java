package Exercicio05;

public class Tartaruga extends Reptil {
	
	private String corCasca;

	public String getCorCasca() {
		return corCasca;
	}

	public void setCorCasca(String corCasca) {
		this.corCasca = corCasca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tartaruga [corCasca=");
		builder.append(corCasca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
