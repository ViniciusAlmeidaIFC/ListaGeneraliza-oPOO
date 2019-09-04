package Exercicio06;

public class Tambor extends Percussao {

	private boolean membrana;
	private boolean corpo;
	
	public boolean isMembrana() {
		return membrana;
	}
	public void setMembrana(boolean membrana) {
		this.membrana = membrana;
	}
	public boolean isCorpo() {
		return corpo;
	}
	public void setCorpo(boolean corpo) {
		this.corpo = corpo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tambor [membrana=");
		builder.append(membrana);
		builder.append(", corpo=");
		builder.append(corpo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
