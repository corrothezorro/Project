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

public class UserDet extends JFrame{
	private JPasswordField pwPasswort;
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
		
		JLabel lblPasswort = new JLabel("Passwort:");
		lblPasswort.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPasswort.setBounds(10, 84, 81, 14);
		getContentPane().add(lblPasswort);
		
		pwPasswort = new JPasswordField();
		pwPasswort.setBounds(116, 81, 120, 17);
		getContentPane().add(pwPasswort);
		
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
		lblRolle.setBounds(45, 109, 46, 14);
		getContentPane().add(lblRolle);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dozent", "Fachgruppenreferent", "Admin"}));
		comboBox.setBounds(116, 109, 120, 18);
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
		btnSpeichern.setBounds(29, 134, 120, 23);
		getContentPane().add(btnSpeichern);
		setBounds(100, 100, 677, 400);
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(159, 134, 105, 23);
		getContentPane().add(btnAbbrechen);
	}
}
