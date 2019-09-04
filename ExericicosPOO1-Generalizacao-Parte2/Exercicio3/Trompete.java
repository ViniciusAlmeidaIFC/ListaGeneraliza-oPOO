package Exercicio06;

public class Trompete extends Metais {

	private boolean notas;
	private int pistoes;
	
	public boolean isNotas() {
		return notas;
	}
	
	public void setNotas(boolean notas) {
		this.notas = notas;
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
		builder.append("Trompete [notas=");
		builder.append(notas);
		builder.append(", pistoes=");
		builder.append(pistoes);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
