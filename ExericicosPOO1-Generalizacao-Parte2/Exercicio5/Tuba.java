package Exercicio06;

public class Tuba extends Metais {

	private boolean valvula;
	private int pistoes;
	
	public boolean isValvula() {
		return valvula;
	}
	
	public void setValvula(boolean valvula) {
		this.valvula = valvula;
	}
	
	public int getPistoes() {
		return pistoes;
	}
	
	public void setPistoes(int pistoes) {
		this.pistoes = pistoes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tuba [valvula=");
		builder.append(valvula);
		builder.append(", pistoes=");
		builder.append(pistoes);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
