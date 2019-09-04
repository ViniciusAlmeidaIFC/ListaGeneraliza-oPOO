package generalizacao.exe5;

public class Torre extends Peao {

	public Torre(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
	}

	public boolean mover(int linha, int coluna) {

		if ((linha > 0 || coluna > 0) && (linha <= 8 && coluna <= 8)) {
			if ((linha != getLinha() && coluna == getColuna()) || (linha == getLinha() && coluna != getColuna())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
