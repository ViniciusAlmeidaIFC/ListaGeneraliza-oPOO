package Exercicio05;

public class MainAnimal {

	public static void main(String[] args) {

		Cao cao = new Cao();
		cao.setDentes(44);
		cao.setPelo(true);
		cao.setGlandulasMamarias(true);
		cao.setTemperaturaConstante(true);
		cao.setAlimentacao("Ração");
		cao.setHabitat("Casa");
		cao.setIdade(4);
		
		System.out.println(cao.locomocao(50));
		System.out.println(cao.Brincar(true));
		System.out.println(cao.latir(true));
		System.out.println(cao);
		
		Gato gato = new Gato();
		gato.setDentes(33);
		gato.setPelo(true);
		gato.setGlandulasMamarias(true);
		gato.setTemperaturaConstante(true);
		gato.setAlimentacao("Ração");
		gato.setHabitat("Casa");
		gato.setIdade(4);
		
		System.out.println(gato.locomocao(10));
		System.out.println(gato.Brincar(true));
		System.out.println(gato.subirNaArvore(true));
		System.out.println(gato.miar(true));
		System.out.println(gato);
		
		Tartaruga tartaruga = new Tartaruga();
		tartaruga.setCorCasca("Verde");
		tartaruga.setPeleGrossa(true);
		tartaruga.setVertebradosTetrapodes(true);
		tartaruga.setAlimentacao("Folhas");
		tartaruga.setHabitat("Mar");
		tartaruga.setIdade(100);
		
		System.out.println(tartaruga.locomocao(01));
		System.out.println(tartaruga);
		
		
		Lagarto lagarto = new Lagarto();
		lagarto.setTamanhocauda(1);
		lagarto.setVeneno(true);
		lagarto.setPeleGrossa(true);
		lagarto.setVertebradosTetrapodes(true);
		lagarto.setAlimentacao("Folhas");
		lagarto.setHabitat("Mato");
		lagarto.setIdade(8);
		
		System.out.println(lagarto.locomocao(05));
		System.out.println(lagarto);

	}
}
