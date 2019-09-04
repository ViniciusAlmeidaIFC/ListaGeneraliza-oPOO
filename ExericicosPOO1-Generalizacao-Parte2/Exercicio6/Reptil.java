package Exercicio05;

public class Reptil extends Animal {

	private boolean vertebradosTetrapodes;
	private boolean peleGrossa;
	
	public boolean isVertebradosTetrapodes() {
		return vertebradosTetrapodes;
	}
	public void setVertebradosTetrapodes(boolean vertebradosTetrapodes) {
		this.vertebradosTetrapodes = vertebradosTetrapodes;
	}
	public boolean isPeleGrossa() {
		return peleGrossa;
	}
	public void setPeleGrossa(boolean peleGrossa) {
		this.peleGrossa = peleGrossa;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reptil [vertebradosTetrapodes=");
		builder.append(vertebradosTetrapodes);
		builder.append(", peleGrossa=");
		builder.append(peleGrossa);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
