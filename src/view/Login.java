package view;

import java.awt.BorderLayout;
import back.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtPasswordLogin;
	private static ArrayList<SysAdmin> listaAdmins = new ArrayList<SysAdmin>();
	private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
	private Autenticacao aut = new Autenticacao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/*
	 * public static void populemedicos() { String listaPacientes[] = {"Augusto",
	 * "Emanoel", "Lucas"}; String agendaCirurgica[] = {"23/06/2022", "15/09/2022"};
	 * String enfermeiro[] = {"Lídia","Fernando", "Cecília"}; String medicosAux[] =
	 * {}; char password[] = {'A','d','m','i','n'};
	 * 
	 * 
	 * 
	 * SysAdmin admin1 = new SysAdmin("Jefferson", listaPacientes, agendaCirurgica,
	 * enfermeiro, medicosAux, "Jefferson", password); listaAdmins.add(admin1); }
	 */

	/**
	 * Create the frame.
	 */
	public Login() {
		aut = new Autenticacao();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(65, 92, 60, 17);
		contentPane.add(lblLogin);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(65, 115, 60, 17);
		contentPane.add(lblSenha);

		JFormattedTextField txtLogin = new JFormattedTextField();
		txtLogin.setBounds(108, 88, 215, 21);
		contentPane.add(txtLogin);

		txtPasswordLogin = new JPasswordField();
		txtPasswordLogin.setBounds(108, 113, 215, 21);
		contentPane.add(txtPasswordLogin);

		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (aut.login(txtLogin.getText(), txtPasswordLogin.getText())) {
					Area_de_Trabalho area = new Area_de_Trabalho();
					area.setVisible(true);
					closeWindow();
				}
			}
		});
		btnOk.setBounds(108, 139, 105, 27);
		contentPane.add(btnOk);

		JButton btnCadastrar = new JButton("Cadastrar...");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastro cadastro = new Cadastro();
				Login login = new Login();
				cadastro.setVisible(true);
			}
		});
		btnCadastrar.setBounds(218, 139, 105, 27);
		contentPane.add(btnCadastrar);
	}
	public void closeWindow() {
		this.setVisible(false);
	}
}
