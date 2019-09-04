package Exercicio06;

public class Piano extends Cordas {

	private boolean martelo;
	private int pedais; // 2
	private int teclas; // 88
	
	public boolean isMartelo() {
		return martelo;
	}
	public void setMartelo(boolean martelo) {
		this.martelo = martelo;
	}
	public int getPedais() {
		return pedais;
	}
	public void setPedais(int pedais) {
		this.pedais = pedais;
	}
	public int getTeclas() {
		return teclas;
	}
	public void setTeclas(int teclas) {
		this.teclas = teclas;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Piano [martelo=");
		builder.append(martelo);
		builder.append(", pedais=");
		builder.append(pedais);
		builder.append(", teclas=");
		builder.append(teclas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
