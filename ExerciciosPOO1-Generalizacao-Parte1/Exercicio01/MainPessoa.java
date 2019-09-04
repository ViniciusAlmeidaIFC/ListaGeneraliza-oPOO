package Exercicio01;

public class MainPessoa {

	public static void main(String[] args) {

		PessoaFisica pesF = new PessoaFisica();
		PessoaJuridica pesJ = new PessoaJuridica();
		
		pesF.setCodigo(1);
		pesF.setNome("Vinicius");
		pesF.setIdade(18);
		pesF.setEndereco("São Joaquim");
		pesF.setCpf("123.456.789-01");
		
		pesJ.setNome("SerraFrutas LTDA");
		pesJ.setCodigo(123456123);
		pesJ.setIdade(10);
		pesJ.setEndereco("Rio do Sul");
		pesJ.setCnpj("54.719.195/0001-53");
		pesJ.setTipoEmpresa("Pequena Empresa");
		
		
		System.out.println(pesF);
		System.out.println(pesJ);
		
	}

}
