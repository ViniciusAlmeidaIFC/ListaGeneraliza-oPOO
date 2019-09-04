package Exercicio05;

public class Cao extends Mamifero {

	private boolean pelo;
	private int dentes;
	
	public boolean isPelo() {
		return pelo;
	}

	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}

	public int getDentes() {
		return dentes;
	}

	public void setDentes(int dentes) {
		this.dentes = dentes;
	}

	public boolean latir(boolean feliz) {
		if (feliz)
			return true;
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cao [pelo=");
		builder.append(pelo);
		builder.append(", dentes=");
		builder.append(dentes);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
