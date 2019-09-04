package Exercicio06;

public class Percussao extends InstrumentoMusical {

	private boolean altura;
	
	public boolean isAltura() {
		return altura;
	}

	public void setAltura(boolean altura) {
		this.altura = altura;
	}

	public boolean ativacao(boolean impacto) {
		if(impacto)
			return true;
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Percussao [altura=");
		builder.append(altura);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
