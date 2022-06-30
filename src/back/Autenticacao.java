package back;

public class Autenticacao {
	private Repositorio repositorio;
	
	public Autenticacao() {
		repositorio = new Repositorio();
		
	}
	public boolean login(String usuario, String senha) {
		return repositorio.getUserByLogin(usuario, senha);
	}
	
}
