package details;

import gui.Startansicht;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class UserDet extends JFrame{
	private JTextField textNutzername;
	private JTextField textName;
	
	public UserDet(String name, final String nutzername, char[] passwort, String rolle) {
		setTitle("Dozent Detailansicht");
		getContentPane().setLayout(null);
		setBounds(100, 100, 325, 226);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(-14, 29, 105, 14);
		getContentPane().add(lblName);
		
		JLabel lblBenutzername = new JLabel("Benutzername:");
		lblBenutzername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBenutzername.setBounds(10, 54, 81, 14);
		getContentPane().add(lblBenutzername);
		
		textNutzername = new JTextField();
		textNutzername.setBounds(116, 51, 120, 20);
		getContentPane().add(textNutzername);
		textNutzername.setColumns(10);
		
		textName = new JTextField();
		textName.setBounds(116, 26, 120, 20);
		getContentPane().add(textName);
		textName.setColumns(10);
		
		JLabel lblRolle = new JLabel("Rolle:");
		lblRolle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRolle.setBounds(45, 79, 46, 14);
		getContentPane().add(lblRolle);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dozent", "Fachgruppenreferent", "Admin"}));
		comboBox.setBounds(116, 76, 120, 20);
		getContentPane().add(comboBox);
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Datenbankcommandos
				// Treemap Komando
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							setVisible(false);
							dispose();
							Startansicht frame = new Startansicht(nutzername);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
						
					}
				});
				
			}
		});
		btnSpeichern.setBounds(10, 133, 120, 23);
		getContentPane().add(btnSpeichern);
		setBounds(100, 100, 677, 400);
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(140, 133, 105, 23);
		getContentPane().add(btnAbbrechen);
		
		JCheckBox chckbxAktiv = new JCheckBox("aktiv");
		chckbxAktiv.setBounds(116, 103, 97, 23);
		getContentPane().add(chckbxAktiv);
		
		JLabel lblAktivitt = new JLabel("Aktivit\u00E4t:");
		lblAktivitt.setBounds(45, 104, 46, 14);
		getContentPane().add(lblAktivitt);
	}
}
