package Exercicio06;

public class MainInstrumentoMusical {

	public static void main(String[] args) {

		Fagote fagote  = new Fagote();
		fagote.setPalhetaDupla(true);
		fagote.setTuboConico((float)2.5);
		fagote.setPalheta("Palheta Dupla");
		fagote.setVibracaoPalhetasDeMadeira(true);
		fagote.setCor("Vermelho");
		fagote.setRegistro("Grave");
		fagote.setTessitura("Dó2 – Dó4");
		fagote.setTimbre(144);
		
		System.out.println(fagote.produzirSom("si, si, lá, dó, dó, mi"));
		System.out.println(fagote);
		
		Saxofone saxofone = new Saxofone();
		saxofone.setChaves(23);
		saxofone.setLatao(true);
		saxofone.setBocal(true);
		saxofone.setCampanula(true);
		saxofone.setTuboConico(true);
		saxofone.setCor("Dourado");
		saxofone.setRegistro("Grave");
		saxofone.setTessitura("Dó2 – Dó4");
		saxofone.setTimbre(144);
		
		System.out.println(saxofone.ativacao(true));
		System.out.println(saxofone.produzirSom("dó, dó, dó, fá, si, si"));
		System.out.println(saxofone);
		
		Trompete trompete = new Trompete();
		trompete.setNotas(true);
		trompete.setPistoes(3);
		trompete.setBocal(true);
		trompete.setCampanula(true);
		trompete.setTuboConico(true);
		trompete.setCor("Dourado");
		trompete.setRegistro("Agudo");
		trompete.setTessitura("Dó2 – Dó4");
		trompete.setTimbre(144);
		
		System.out.println(trompete.ativacao(true));
		System.out.println(trompete.produzirSom("dó, ré, mi"));
		System.out.println(trompete);
		
		Tuba tuba = new Tuba();
		tuba.setPistoes(4);
		tuba.setValvula(true);
		tuba.setBocal(true);
		tuba.setCampanula(true);
		tuba.setTuboConico(true);
		tuba.setCor("Dourado");
		tuba.setRegistro("Agudo");
		tuba.setTessitura("Dó-1 - Fá3");
		tuba.setTimbre(144);
		
		System.out.println(tuba.ativacao(true));
		System.out.println(tuba.produzirSom("ré, ré, mi, fá, sol"));
		System.out.println(tuba);
		
		Violao violao = new Violao();
		violao.setBraco(true);
		violao.setPestana(true);
		violao.setCavalete(true);
		violao.setCordas(6);
		violao.setTensaoCorda(true);
		violao.setCor("Azul");
		violao.setRegistro("Agudo");
		violao.setTessitura("Mi - Mi");
		violao.setTimbre(144);
		
		System.out.println(violao.ativacao(true));
		System.out.println(violao.produzirSom("dó, dó, ré, ré, mi, fá, sol"));
		System.out.println(violao);
		
		Piano piano = new Piano();
		piano.setMartelo(true);
		piano.setPedais(2);
		piano.setTeclas(88);
		piano.setCavalete(true);
		piano.setCordas(88);
		piano.setTensaoCorda(true);
		piano.setCor("Marron");
		piano.setRegistro("Agudo");
		piano.setTessitura("Mi - Mi");
		piano.setTimbre(144);
		
		System.out.println(piano.ativacao(true));
		System.out.println(piano.produzirSom("dó, dó, ré, ré, mi, mi, fá, fá"));
		System.out.println(piano);
		
		Tambor tambor = new Tambor();
		tambor.setCorpo(true);
		tambor.setMembrana(true);
		tambor.setAltura(true);
		tambor.setCor("Branco");
		tambor.setRegistro("Grave");
		tambor.setTessitura("Dó");
		tambor.setTimbre(144);
		
		System.out.println(tambor.ativacao(true));
		System.out.println(tambor.produzirSom("mi, mi, fá, fá, sol, sol"));
		System.out.println(piano);
		
		Prato prato = new Prato();
		prato.setCategoria("Prato de Choque");
		prato.setLigaDeMetal(true);
		prato.setAltura(true);
		prato.setCor("Prata");
		prato.setRegistro("Grave");
		prato.setTessitura("Ré");
		prato.setTimbre(144);
		
		System.out.println(prato.ativacao(true));
		System.out.println(prato.produzirSom("ré, ré, dó, dó"));
		System.out.println(prato);
		
	}
}
