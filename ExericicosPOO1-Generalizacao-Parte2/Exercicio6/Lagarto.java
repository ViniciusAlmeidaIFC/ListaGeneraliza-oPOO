package Exercicio05;

public class Lagarto extends Reptil {

	private int tamanhocauda;
	private boolean veneno;
	
	public int getTamanhocauda() {
		return tamanhocauda;
	}
	public void setTamanhocauda(int tamanhocauda) {
		this.tamanhocauda = tamanhocauda;
	}
	public boolean isVeneno() {
		return veneno;
	}
	public void setVeneno(boolean veneno) {
		this.veneno = veneno;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lagarto [tamanhocauda=");
		builder.append(tamanhocauda);
		builder.append(", veneno=");
		builder.append(veneno);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
