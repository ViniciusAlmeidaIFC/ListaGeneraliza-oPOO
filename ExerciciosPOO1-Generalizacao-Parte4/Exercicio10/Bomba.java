package generalizacao.exe4;

public class Bomba {

	private double totalLitros;
	private float valorLitro;
	
	public Bomba(double totalLitros, float valorLitro) {
		setTotalLitros(totalLitros);
		setValorLitro(valorLitro);
	}
	
	public double getTotalLitros() {
		return totalLitros;
	}
	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}
	public float getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	
	public boolean abastecerPorLitro(float litros) {
		if(totalLitros >= litros) {
			totalLitros = totalLitros - litros;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean abastecerPorValor(double valor) {
		float litros = (float)valor / valorLitro;
		return abastecerPorLitro(litros);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}
	
}
