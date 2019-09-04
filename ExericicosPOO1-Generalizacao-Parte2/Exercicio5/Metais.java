package Exercicio06;

public class Metais extends InstrumentoMusical {

	private boolean bocal;
	private boolean campanula;
	private boolean tuboConico;
	
	public boolean isBocal() {
		return bocal;
	}

	public void setBocal(boolean bocal) {
		this.bocal = bocal;
	}

	public boolean isCampanula() {
		return campanula;
	}

	public void setCampanula(boolean campanula) {
		this.campanula = campanula;
	}

	public boolean isTuboConico() {
		return tuboConico;
	}
	
	public void setTuboConico(boolean tuboConico) {
		this.tuboConico = tuboConico;
	}
	
	public boolean ativacao(boolean vibracaoLabios) {
		if(vibracaoLabios)
			return true;
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Metais [bocal=");
		builder.append(bocal);
		builder.append(", campanula=");
		builder.append(campanula);
		builder.append(", tuboConico=");
		builder.append(tuboConico);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
