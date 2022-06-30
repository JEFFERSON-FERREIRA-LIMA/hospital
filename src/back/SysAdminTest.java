package back;

public class SysAdminTest {

	public static void main(String[] args) {
		String listaPacientes[] = {"Augusto", "Emanoel", "Lucas"};
		String agendaCirurgica[] = {"23/06/2022", "15/09/2022"};
		String enfermeiro[] = {"Lídia","Fernando", "Cecília"};
		String medicosAux[] = {};
		char password[] = {'A','d','m','i','n'};
		
		
		SysAdmin admin1 = new SysAdmin("Jefferson", listaPacientes, agendaCirurgica, enfermeiro, medicosAux, "Jefferson", password);
		System.out.println(admin1.getNomeMedico());

}
}
