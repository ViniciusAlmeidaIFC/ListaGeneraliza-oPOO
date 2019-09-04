package Exercicio05;

public class Animal {

	private String habitat;
	private int idade;
	private String alimentacao;
	
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public boolean locomocao(int qtdMetros) {
		if (qtdMetros > 0)
			return true;
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [habitat=");
		builder.append(habitat);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", alimentacao=");
		builder.append(alimentacao);
		builder.append("]");
		return builder.toString();
	}

}
