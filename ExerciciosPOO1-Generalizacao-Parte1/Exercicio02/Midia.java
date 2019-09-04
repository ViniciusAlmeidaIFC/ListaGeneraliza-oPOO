package Exercicio02;

public class Midia extends Item {

	private String gravadora;
	private String duracao;

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		if (gravadora.length() > 0)
			this.gravadora = gravadora;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		if (duracao.length() > 0)
			this.duracao = duracao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
