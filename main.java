package proxy;

public class main {

	public static void main(String[] args) {
		
		Universidade universidade = new UniversidadeProxy("errado");
		System.out.println("Login incorreto");
		System.out.println(universidade.getNomeInstituicao());
		System.out.println(universidade.getNomeCurso());
		
		
		universidade = new UniversidadeProxy("correto");
		System.out.println("Login válido");
		System.out.println(universidade.getNomeInstituicao());
		System.out.println(universidade.getNomeCurso());
		
		
	}

}
