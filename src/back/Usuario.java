package back;

public class Usuario {
	String nome, especializacao, senha;
	int id;
	
	public Usuario (String nome, String especializacao, String senha) {
		this.nome = nome;
		this.especializacao = especializacao;
		this.senha = senha;
		
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
}

