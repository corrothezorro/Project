package details;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class DozentDet extends JFrame{
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	public DozentDet() {
		setTitle("Dozent Detailansicht");
		getContentPane().setLayout(null);
		
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
		
		passwordField = new JPasswordField();
		passwordField.setBounds(116, 81, 120, 17);
		getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(116, 51, 120, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 26, 120, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRolle = new JLabel("Rolle:");
		lblRolle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRolle.setBounds(45, 109, 46, 14);
		getContentPane().add(lblRolle);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dozent", "Fachgruppenreferent", "Admin"}));
		comboBox.setBounds(116, 109, 120, 14);
		getContentPane().add(comboBox);
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.setBounds(69, 134, 89, 23);
		getContentPane().add(btnSpeichern);
		
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(168, 134, 89, 23);
		getContentPane().add(btnAbbrechen);
	}
}
