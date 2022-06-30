package back;

import java.util.Arrays;

public class SysAdmin {
		private String nomeMedico;
		private String[] listaPacientes = new String[5];
		private String[] agendaCirurgica = new String[5];
		private String[] enfermeiro = new String[5];
		private String[] medicosAux = new String[5];
		private String userName;
		private char[] password = new char[5];
		
		public SysAdmin(String nomeMedico, String[] listaPacientes, String[] agendaCirurgica, String[] enfermeiro,
				String[] medicosAux, String userName, char[] password) {
			super();
			this.nomeMedico = nomeMedico;
			this.listaPacientes = listaPacientes;
			this.agendaCirurgica = agendaCirurgica;
			this.enfermeiro = enfermeiro;
			this.medicosAux = medicosAux;
			this.userName = userName;
			this.password = password;
		}

		public String getNomeMedico() {
			return nomeMedico;
		}

		public void setNomeMedico(String nomeMedico) {
			this.nomeMedico = nomeMedico;
		}

		@Override
		public String toString() {
			return "SysAdmin [nomeMedico=" + nomeMedico + ", listaPacientes=" + Arrays.toString(listaPacientes)
					+ ", agendaCirurgica=" + Arrays.toString(agendaCirurgica) + ", enfermeiro="
					+ Arrays.toString(enfermeiro) + ", medicosAux=" + Arrays.toString(medicosAux) + ", userName="
					+ userName + ", password=" + Arrays.toString(password) + "]";
		}

		public String[] getListaPacientes() {
			return listaPacientes;
		}

		public void setListaPacientes(String[] listaPacientes) {
			this.listaPacientes = listaPacientes;
		}

		public String[] getAgendaCirurgica() {
			return agendaCirurgica;
		}

		public void setAgendaCirurgica(String[] agendaCirurgica) {
			this.agendaCirurgica = agendaCirurgica;
		}

		public String[] getEnfermeiro() {
			return enfermeiro;
		}

		public void setEnfermeiro(String[] enfermeiro) {
			this.enfermeiro = enfermeiro;
		}

		public String[] getMedicosAux() {
			return medicosAux;
		}

		public void setMedicosAux(String[] medicosAux) {
			this.medicosAux = medicosAux;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public char[] getPassword() {
			return password;
		}

		public void setPassword(char[] password) {
			this.password = password;
		}
		
}
