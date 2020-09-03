package proxy;

public class UniversidadeProxy extends Universidade {

	protected String login;
	
	

	public UniversidadeProxy(String login) {
		this.login = login;

	}

	@Override
	public String getNomeInstituicao() {
		if (verificarLogin()) {
			return super.getNomeInstituicao();
		}
		return null;
	}

	@Override
	public String getNomeCurso() {
		if (verificarLogin()) {
			return super.getNomeCurso();
		}
		return null;
	}

	private boolean verificarLogin() {
		return login == "correto";
	}
	
}
