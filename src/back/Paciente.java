package back;

public class Paciente extends Generica{
	String doenca;
	
	public Paciente(String nome, String doenca) {
		super(nome);
		this.doenca = doenca;
		
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}
	 

}
