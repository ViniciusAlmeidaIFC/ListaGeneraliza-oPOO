package generalizacao.exe3;

public class MainNaveEspacial {

	public static void main(String[] args) {

		MilleniumFalcon milFal = new MilleniumFalcon();
		milFal.setClasseHiperpropulsor(04);
		milFal.setTipoCombustivel("Diesel");
		milFal.setVelocidadeMaxima(500);
		
		System.out.println(milFal);

	}

}
