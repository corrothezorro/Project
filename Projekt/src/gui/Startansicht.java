package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Startansicht extends JFrame{
	
	public Startansicht() {
		setTitle("Pr\u00FCfungsverwaltung");
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(31, 41, 46, 14);
		getContentPane().add(lblName);
		
		JLabel lblJlblname = new JLabel("lblName");
		lblJlblname.setHorizontalAlignment(SwingConstants.LEFT);
		lblJlblname.setBounds(109, 41, 46, 14);
		getContentPane().add(lblJlblname);
		
		JLabel lblNewLabel = new JLabel("Rolle:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(31, 66, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblLblrolle = new JLabel("lblRolle");
		lblLblrolle.setHorizontalAlignment(SwingConstants.LEFT);
		lblLblrolle.setBounds(109, 66, 46, 14);
		getContentPane().add(lblLblrolle);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 91, 586, 2);
		getContentPane().add(separator);
		
		JTextPane txtpnTabelleMitInformationen = new JTextPane();
		txtpnTabelleMitInformationen.setText("Tabelle mit Informationen zu den Pr\u00FCfungen f\u00FCr die der angemeldete Dozent eingetragen ist");
		txtpnTabelleMitInformationen.setBounds(31, 131, 556, 93);
		getContentPane().add(txtpnTabelleMitInformationen);
		
		JLabel lblBenutzer = new JLabel("Benutzer:");
		lblBenutzer.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBenutzer.setBounds(10, 16, 67, 14);
		getContentPane().add(lblBenutzer);
		
		JLabel lblLblbenutzer = new JLabel("lblBenutzer");
		lblLblbenutzer.setHorizontalAlignment(SwingConstants.LEFT);
		lblLblbenutzer.setBounds(109, 16, 77, 14);
		getContentPane().add(lblLblbenutzer);
		
		JButton btnNewButton_1 = new JButton("Bearbeiten");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(498, 245, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblAlsPrferEingetragen = new JLabel("Dozent: eigenePr\u00FCfungen                      Fachgruppenreferent: alle Pr\u00FCfungen der Fachgruppe");
		lblAlsPrferEingetragen.setBounds(31, 106, 556, 14);
		getContentPane().add(lblAlsPrferEingetragen);
		
		JButton btnEigenePrfungen = new JButton("eigene Pr\u00FCfungen");
		btnEigenePrfungen.setBounds(357, 245, 131, 23);
		getContentPane().add(btnEigenePrfungen);
		
		JButton btnAllePrfungen = new JButton("alle Pr\u00FCfungen");
		btnAllePrfungen.setBounds(245, 245, 101, 23);
		getContentPane().add(btnAllePrfungen);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(29, 235, 588, 2);
		getContentPane().add(separator_1);
		
		JLabel lblNurFr = new JLabel("// nur f\u00FCr Fachgruppenreferenten");
		lblNurFr.setBounds(39, 249, 199, 14);
		getContentPane().add(lblNurFr);
		setBounds(100, 100, 677, 400);
	}
}
