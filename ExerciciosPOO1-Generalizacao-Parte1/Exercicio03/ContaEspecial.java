package Exercicio03;

public class ContaEspecial extends Conta {

	private int diasSemJuros;
	private double limite;

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		if (diasSemJuros > 0)
			this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		if (limite > 0)
			this.limite = limite;
	}
	
	public boolean saqueEspecial(double valor) {
		if(Math.abs(getSaldo()) + Math.abs(limite) >= valor) {
			setSaldo(getSaldo() - valor);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append("]");
		return builder.toString();
	}

}
