package Exercicio02;

public class MainItem {

	public static void main(String[] args) {

		Livro livro = new Livro ();
		CD cd = new CD ();
		VHS vhs = new VHS();
		
		livro.setCodigo(123);
		livro.setDescricao("As aventuras de um atleta");
		livro.setAutor("Vinicius");
		
		cd.setCodigo(456);
		cd.setDescricao("AC/DC");
		cd.setGravadora("Sony");
		cd.setDuracao("2 hrs");
		cd.setAlbum("Hell's Bells");
		cd.setArtista("AC/DC");
		cd.setFaixas(15);
		
		vhs.setCodigo(789);
		vhs.setDescricao("Legião Urbana");
		vhs.setDuracao("2 hrs");
		vhs.setGravadora("EMI");
		vhs.setTitulo("Dois");
		
		System.out.println(livro);
		System.out.println(cd);
		System.out.println(vhs);
		

	}

}
