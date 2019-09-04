package generalizacao.exe2;

public class MainAmbiente {

	public static void main(String[] args) {
		
		Quarto quarto = new Quarto();
		quarto.setCapacidade(2);
		quarto.setArea(10);
		
		System.out.println(quarto);
		
		Banheiro banheiro = new Banheiro();
		banheiro.setBanheira(true);
		banheiro.setArea(5);
		
		System.out.println(banheiro);
		
		Sala sala = new Sala();
		sala.setTv(true);
		sala.setArea(15);
		
		System.out.println(sala);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setMicroondas(true);
		cozinha.setArea(15);
		
		System.out.println(cozinha);
	}
}
