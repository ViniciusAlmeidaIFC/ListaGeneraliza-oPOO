package generalizacao.exe5;

public class MainPeca {

	public static void main(String[] args) {

		Rei rei = new Rei(2, 3, true, 1);
		System.out.println(rei);
		
		Rainha rainha = new Rainha(4, 8, true, 3);
		System.out.println(rainha);
		
		Cavalo cavalo = new Cavalo(1, 3, true, 2);
		System.out.println(cavalo);
		
		Bispo bispo = new Bispo(1, 4, true, 1);
		System.out.println(bispo);
		
		Peao peao = new Peao(8, 8, false, 0);
		System.out.println(peao);
		System.out.println(peao.mover(7, 8));
		System.out.println(peao);
		
		Torre torre = new Torre(4, 1, true, 3);
		System.out.println(torre);
		System.out.println(torre.mover(8, 1));
		System.out.println(torre);
	}

}
