package Exercicio04;

public class MainVeiculo {

	public static void main(String[] args) {

		Caminhao caminhao = new Caminhao();
		caminhao.setEixos(4);
		caminhao.setMotor(true);
		
		Carro carro = new Carro();
		carro.setPortas(5);
		carro.setMotor(true);
		
		Moto moto = new Moto();
		moto.setCilindradas(200);
		moto.setMotor(true);
		
		System.out.println(caminhao);
		System.out.println(carro);
		System.out.println(moto);
		
	}
}
