package details;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;

import javax.swing.SwingConstants;

import Controller.SelbstinformationController;

public class Selbstinformation extends JFrame{
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField;
	private SelbstinformationController selbstinformationController = new SelbstinformationController();
	private JTextField textField_1;
	
	public Selbstinformation(final String nutzername, Connection con) {
		setTitle("Pr\u00FCfungsverwaltung Passwort \u00E4ndern");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nutzername:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(-33, 25, 109, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Passwort:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(-18, 87, 94, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Wiederholen:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(2, 119, 74, 14);
		getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(97, 84, 96, 20);
		getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(97, 116, 96, 20);
		getContentPane().add(passwordField_1);
		
		textField = new JTextField(nutzername);
		textField.setEnabled(false);
		textField.setBounds(97, 22, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Speichern");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] pw1 = passwordField.getPassword();
				char[] pw2 = passwordField_1.getPassword();
				
				if(selbstinformationController.passwoerterGleich(pw1, pw2)){
					selbstinformationController.passwortSpeichern(nutzername);
					
				}else{
					
				}
				
			}
		});
		btnNewButton.setBounds(29, 147, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Abbrechen");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(128, 147, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(31, 56, 46, 14);
		getContentPane().add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 53, 96, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
