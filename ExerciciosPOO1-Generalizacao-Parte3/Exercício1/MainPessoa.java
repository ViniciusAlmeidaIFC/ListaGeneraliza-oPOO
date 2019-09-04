package generalizacao.exe1;

public class MainPessoa {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setMatricula(123);
		aluno.setCodigo(1);
		aluno.setEndereco("Rua Monte Castelo");
		aluno.setNome("Vinicius");
		
		System.out.println(aluno);
		
		Professor professor = new Professor();
		professor.setDisciplina("Geografia");
		professor.setCodigo(1);
		professor.setEndereco("Rua Sebastião Tomaz de Souza");
		professor.setNome("Marilei");
		
		System.out.println(professor);
		
	}

}
