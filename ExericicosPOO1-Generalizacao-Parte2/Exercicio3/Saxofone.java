package Exercicio06;

public class Saxofone extends Metais {

	private boolean latao;
	private int chaves;
	
	public boolean isLatao() {
		return latao;
	}
	
	public void setLatao(boolean latao) {
		this.latao = latao;
	}
	
	public int getChaves() {
		return chaves;
	}
	
	public void setChaves(int chaves) {
		this.chaves = chaves;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Saxofone [latao=");
		builder.append(latao);
		builder.append(", chaves=");
		builder.append(chaves);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
