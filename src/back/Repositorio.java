package back;

import java.util.ArrayList;

public class Repositorio {
	private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
	
	public ArrayList<Usuario>getUsuarios(){
		return listaUsuario;
	}
	public void addUsuario(Usuario user){
		listaUsuario.add(user);
	}
}
