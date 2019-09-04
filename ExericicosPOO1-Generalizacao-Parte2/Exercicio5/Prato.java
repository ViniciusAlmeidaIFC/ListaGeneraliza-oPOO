package Exercicio06;

public class Prato extends Percussao {

	private boolean ligaDeMetal;
	private String categoria; // Prato de choque
	
	public boolean isLigaDeMetal() {
		return ligaDeMetal;
	}
	public void setLigaDeMetal(boolean ligaDeMetal) {
		this.ligaDeMetal = ligaDeMetal;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prato [ligaDeMetal=");
		builder.append(ligaDeMetal);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
