package back;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Repositorio {

	private static ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();
	private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

	public Repositorio() {
		Usuario user = new Usuario("admin", "admin", "admin");
		listaUsuario.add(user);
	}
	public ArrayList<Paciente> getPaciente() {
		
		listaPaciente.add(new Paciente("Marcos Antonio", "Rubéola"));
		listaPaciente.add(new Paciente("Marcos Aurelio", "Dengue"));
		listaPaciente.add(new Paciente("Mario DellaPenha", "chikungunya"));
		listaPaciente.add(new Paciente("Mano Reis", "Diabetes"));
		listaPaciente.add(new Paciente("Paolla Oliveira", "Asma"));
		return listaPaciente;
	}

	public ArrayList<Usuario> getUsuarios() {
		return listaUsuario;
	}

	public void addUsuario(Usuario user) {
		listaUsuario.add(user);
	}

	public boolean getUserByLogin(String login, String password) {
		for (Usuario a : listaUsuario) {
			if (a.getNome().equals(login)) {
				if (a.getSenha().equals(password)) {
					return true;
				} else {
					JOptionPane.showMessageDialog(null, "Senha não confere!");
					return false;
				}
			} else {
				JOptionPane.showMessageDialog(null, "usuário não encontrado!");
				return false;
			}

		}
		return false;
	}
}