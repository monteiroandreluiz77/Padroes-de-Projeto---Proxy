package proxy;

public class Universidade{
	
	private String nomeInstituicao;
	private String nomeCurso;


	public Universidade() {
		
		nomeInstituicao = "Universidade Federal";
		nomeCurso = "Curso de Engenharia de Produ��o";	
	}
	


	public String getNomeInstituicao() {
		return new String (nomeInstituicao);
	}
	
	public String getNomeCurso() {
		return new String (nomeCurso);
	}
}
