package Exercicio06;

public class InstrumentoMusical {

	private String tessitura;
	private String cor;
	private String registro;
	private int timbre;

	public String getTessitura() {
		return tessitura;
	}

	public void setTessitura(String tessitura) {
		this.tessitura = tessitura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public int getTimbre() {
		return timbre;
	}

	public void setTimbre(int timbre) {
		this.timbre = timbre;
	}

	public boolean produzirSom(String acordes) {
		if (acordes.length() > 0)
			return true;
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InstrumentoMusical [tessitura=");
		builder.append(tessitura);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", registro=");
		builder.append(registro);
		builder.append(", timbre=");
		builder.append(timbre);
		builder.append("]");
		return builder.toString();
	}
	
}
