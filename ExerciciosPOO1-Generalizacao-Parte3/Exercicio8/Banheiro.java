package generalizacao.exe2;

public class Banheiro extends Ambiente {

	private boolean banheira;

	public boolean isBanheira() {
		return banheira;
	}

	public void setBanheira(boolean banheira) {
		if (banheira == true || banheira == false)
			this.banheira = banheira;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banheiro [banheira=");
		builder.append(banheira);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
