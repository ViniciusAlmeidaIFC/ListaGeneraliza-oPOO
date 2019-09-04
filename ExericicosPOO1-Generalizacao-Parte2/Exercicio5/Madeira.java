package Exercicio06;

public class Madeira extends InstrumentoMusical {

	private String palheta;
	private boolean vibracaoPalhetasDeMadeira;
	
	public String getPalheta() {
		return palheta;
	}
	public void setPalheta(String palheta) {
		this.palheta = palheta;
	}
	public boolean isVibracaoPalhetasDeMadeira() {
		return vibracaoPalhetasDeMadeira;
	}
	public void setVibracaoPalhetasDeMadeira(boolean vibracaoPalhetasDeMadeira) {
		this.vibracaoPalhetasDeMadeira = vibracaoPalhetasDeMadeira;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Madeira [palheta=");
		builder.append(palheta);
		builder.append(", vibracaoPalhetasDeMadeira=");
		builder.append(vibracaoPalhetasDeMadeira);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
