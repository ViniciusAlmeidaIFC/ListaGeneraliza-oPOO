package Exercicio06;

public class Cordas extends InstrumentoMusical {

	private int cordas;
	private boolean tensaoCorda;
	private boolean cavalete;
	
	public int getCordas() {
		return cordas;
	}

	public void setCordas(int cordas) {
		this.cordas = cordas;
	}

	public boolean isTensaoCorda() {
		return tensaoCorda;
	}

	public void setTensaoCorda(boolean tensaoCorda) {
		this.tensaoCorda = tensaoCorda;
	}

	public boolean isCavalete() {
		return cavalete;
	}

	public void setCavalete(boolean cavalete) {
		this.cavalete = cavalete;
	}

	public boolean ativacao(boolean vibracaoCordas) {
		if(vibracaoCordas)
			return true;
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cordas [cordas=");
		builder.append(cordas);
		builder.append(", tensaoCorda=");
		builder.append(tensaoCorda);
		builder.append(", cavalete=");
		builder.append(cavalete);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
