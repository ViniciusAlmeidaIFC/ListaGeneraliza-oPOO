package generalizacao.exe5;

public class Peao extends Peca {

	public Peao(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
	}
	
	public boolean mover(int linha, int coluna) {
		//TRUE = BRANCO | FALSE = PRETO
		if((linha > 0 || coluna > 0) && (linha <= 8 && coluna <= 8)) {
			if(isCor() == true) {
				//BRANCO
				if(getMovimentos() == 0) {
					if(((linha == getLinha() + 2 || linha == (getLinha() + 1)) && coluna == getColuna()) || ((coluna == getColuna() + 1 || coluna == getColuna() - 1) && linha == getLinha() + 1)) {
						setLinha(linha);
						setColuna(coluna);
						setMovimentos(getMovimentos() + 1);
						return true;
					}else {
						return false;
					}
				}else {
					if((linha == (getLinha() + 1) && coluna == getColuna()) || ((coluna == getColuna() + 1 || coluna == getColuna() - 1) && linha == getLinha() + 1)) {
						setLinha(linha);
						setColuna(coluna);
						setMovimentos(getMovimentos() + 1);
						return true;
					}else {
						return false;
					}
				}
			}else {
				//PRETO
				if(getMovimentos() == 0) {
					if(((linha == getLinha() - 2 || linha == (getLinha() - 1)) && coluna == getColuna()) || ((coluna == getColuna() + 1 || coluna == getColuna() - 1) && linha == getLinha() - 1)) {
						setLinha(linha);
						setColuna(coluna);
						setMovimentos(getMovimentos() + 1);
						return true;
					}else {
						return false;
					}
				}else {
					if((linha == (getLinha() - 1) && coluna == getColuna()) || ((coluna == getColuna() + 1 || coluna == getColuna() - 1) && linha == getLinha() - 1)) {
						setLinha(linha);
						setColuna(coluna);
						setMovimentos(getMovimentos() + 1);
						return true;
					}else {
						return false;
					}
				}
			}
		}else {
			return false;
		}
		
	}
	
}
