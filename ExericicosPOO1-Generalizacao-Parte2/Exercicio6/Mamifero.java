package Exercicio05;

public class Mamifero extends Animal {

	private boolean glandulasMamarias;
	private boolean temperaturaConstante;

	public boolean isGlandulasMamarias() {
		return glandulasMamarias;
	}

	public void setGlandulasMamarias(boolean glandulasMamarias) {
		this.glandulasMamarias = glandulasMamarias;
	}

	public boolean isTemperaturaConstante() {
		return temperaturaConstante;
	}

	public void setTemperaturaConstante(boolean temperaturaConstante) {
		this.temperaturaConstante = temperaturaConstante;
	}

	public boolean Brincar(boolean disposicao) {
		if (disposicao)
			return true;
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [glandulasMamarias=");
		builder.append(glandulasMamarias);
		builder.append(", temperaturaConstante=");
		builder.append(temperaturaConstante);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
