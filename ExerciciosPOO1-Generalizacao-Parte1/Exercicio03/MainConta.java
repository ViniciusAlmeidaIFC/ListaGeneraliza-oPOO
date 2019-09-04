package Exercicio03;

public class MainConta {

	public static void main(String[] args) {

		ContaSimples cs = new ContaSimples();
		ContaEspecial ce = new ContaEspecial();
		
		cs.setBanco("NuBank");
		cs.setAgencia(01);
		cs.setNumeroConta(320);
		cs.setSaldo(100000);
		cs.setSaldoPoupanca(20000);
		
		System.out.println(cs.saque(200));
		System.out.println(cs.deposito(20000));
		System.out.println(cs.saquePoupanca(500));
		System.out.println(cs.depositoPoupanca(1000));
		
		
		ce.setBanco("NuBank");
		ce.setAgencia(01);
		ce.setNumeroConta(320);
		ce.setSaldo(200000);
		ce.setDiasSemJuros(5);
		ce.setLimite(1000);
		
		System.out.println(ce.saque(3000));
		System.out.println(ce.deposito(400));
		System.out.println(ce.saqueEspecial(400));
		
		System.out.println(cs);
		System.out.println(ce);
		
	}

}
