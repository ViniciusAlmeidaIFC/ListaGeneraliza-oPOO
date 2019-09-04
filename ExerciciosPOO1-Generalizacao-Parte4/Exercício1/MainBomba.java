package generalizacao.exe4;

public class MainBomba {

	public static void main (String[] args) {
		
		BombaGasolina gasolina = new BombaGasolina(100, (float)3.60);
		BombaDiesel diesel = new BombaDiesel(200, (float)2.90);
		BombaEtanol etanol = new BombaEtanol(50, (float)2.50);
		
		System.out.println(gasolina.abastecerPorLitro(15));
		System.out.println(gasolina.abastecerPorValor(20));
		System.out.println(gasolina);
		
		System.out.println(diesel.abastecerPorLitro(15));
		System.out.println(diesel.abastecerPorValor(20));
		System.out.println(diesel);
		
		System.out.println(etanol.abastecerPorLitro(15));
		System.out.println(etanol.abastecerPorValor(20));
		System.out.println(etanol);
		
		
	}
	
}
