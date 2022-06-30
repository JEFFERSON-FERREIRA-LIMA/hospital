package back;

public class Autenticacao {
	private Repositorio repositorio;
	
	public Autenticacao() {
		repositorio = new Repositorio();
		
	}
	public void login(String usuario, String senha) {
		Usuario user = repositorio.getUserByLogin(usuario, senha);
	}
	
}
