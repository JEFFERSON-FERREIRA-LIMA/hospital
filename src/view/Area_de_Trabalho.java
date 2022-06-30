package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Area_de_Trabalho extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Area_de_Trabalho frame = new Area_de_Trabalho();
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
	public Area_de_Trabalho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenu mnNomeDoMdico = new JMenu("Nome do Médico");
		mnNomeDoMdico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnNomeDoMdico.setBounds(156, 135, 129, 21);
		contentPane.add(mnNomeDoMdico);
		
		JMenu mnListaDePacientes = new JMenu("Lista de Pacientes");
		mnListaDePacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnListaDePacientes.setBounds(156, 109, 147, 21);
		contentPane.add(mnListaDePacientes);
		
		JMenu mnEnfermeirosas = new JMenu("Enfermeiros(as)");
		mnEnfermeirosas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnEnfermeirosas.setBounds(156, 56, 154, 21);
		contentPane.add(mnEnfermeirosas);
		
		JMenu mnMdicosAux = new JMenu("Médicos Aux.");
		mnMdicosAux.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnMdicosAux.setBounds(155, 161, 121, 21);
		contentPane.add(mnMdicosAux);
		
		JMenu mnAgendaCirrgica = new JMenu("Agenda Cirúrgica");
		mnAgendaCirrgica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnAgendaCirrgica.setBounds(156, 82, 147, 21);
		contentPane.add(mnAgendaCirrgica);
	}
}
