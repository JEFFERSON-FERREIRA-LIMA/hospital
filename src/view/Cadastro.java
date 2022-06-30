package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import back.Repositorio;
import back.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField txtespec;
	private JTextField txtid;
	private JPasswordField txtsenha;

	Repositorio repositorio = new Repositorio();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(47, 53, 60, 17);
		contentPane.add(lblId);
		
		JLabel lblNomelogin = new JLabel("Nome/Login:");
		lblNomelogin.setBounds(47, 80, 94, 17);
		contentPane.add(lblNomelogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(47, 127, 60, 17);
		contentPane.add(lblSenha);
		
		JLabel lblEspecializao = new JLabel("Especialização:");
		lblEspecializao.setBounds(47, 104, 100, 17);
		contentPane.add(lblEspecializao);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
			
				repositorio.addUsuario(new Usuario(txtnome.getText(), txtespec.getText(), txtsenha.getText()));
				JOptionPane.showMessageDialog(null, "usuário registrado com sucesso!");
			}
		});
		btnSalvar.setBounds(133, 166, 105, 27);
		contentPane.add(btnSalvar);
		
		JButton btnVoltar = new JButton("Voltar");

 		btnVoltar.addActionListener(e -> {
 
			this.setVisible(false);
		});
		btnVoltar.setBounds(245, 166, 105, 27);
		contentPane.add(btnVoltar);
		
		txtnome = new JTextField();

		txtnome.setColumns(10);
		txtnome.setBounds(128, 76, 223, 21);
		contentPane.add(txtnome);
		
		txtespec = new JTextField();

		txtespec.setColumns(10);
		txtespec.setBounds(139, 101, 211, 21);
		contentPane.add(txtespec);
		
		txtid = new JTextField();

		txtid.setColumns(10);
		txtid.setBounds(68, 52, 282, 21);
		contentPane.add(txtid);
		
		txtsenha = new JPasswordField();
		txtsenha.setBounds(96, 125, 254, 21);
		contentPane.add(txtsenha);
	}
}
