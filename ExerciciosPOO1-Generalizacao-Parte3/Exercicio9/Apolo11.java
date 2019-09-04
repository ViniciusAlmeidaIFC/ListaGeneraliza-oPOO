package generalizacao.exe3;

public class Apolo11 extends NaveEspacial {

	private String tipoCombustivel;

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		if (tipoCombustivel.length() > 0)
			this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Apolo11 [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
