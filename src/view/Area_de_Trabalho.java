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
import javax.swing.JTextArea;

public class Area_de_Trabalho extends JFrame {

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
		getContentPane().setLayout(null);
		
		JTextArea txtrEnfermeirosas = new JTextArea();
		txtrEnfermeirosas.setText("Enfermeiros(as)");
		txtrEnfermeirosas.setBounds(158, 134, 91, 17);
		getContentPane().add(txtrEnfermeirosas);
		
		JTextArea txtrListaDePacientes = new JTextArea();
		txtrListaDePacientes.setText("Lista de Pacientes");
		txtrListaDePacientes.setBounds(158, 92, 101, 17);
		getContentPane().add(txtrListaDePacientes);
		
		JTextArea txtrAgendaCirrgica = new JTextArea();
		txtrAgendaCirrgica.setText("Agenda Cirúrgica");
		txtrAgendaCirrgica.setBounds(158, 113, 98, 17);
		getContentPane().add(txtrAgendaCirrgica);
		
		JTextArea txtrMdicosAux = new JTextArea();
		txtrMdicosAux.setText("Médicos Aux.");
		txtrMdicosAux.setBounds(158, 154, 75, 17);
		getContentPane().add(txtrMdicosAux);
		
		JTextArea txtrNomeDoMdico = new JTextArea();
		txtrNomeDoMdico.setText("Nome do Médico");
		txtrNomeDoMdico.setBounds(158, 71, 96, 17);
		getContentPane().add(txtrNomeDoMdico);
	}
}
