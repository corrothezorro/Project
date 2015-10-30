package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class AnmeldeGUI extends JFrame {
	private JPasswordField passwordField;
	private JTextField textField;

	public AnmeldeGUI() {
		setTitle("Log-In Pr\u00FCfungsverwaltung");
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Benutzer");
		lblNewLabel.setBounds(30, 26, 46, 14);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Passwort");
		lblNewLabel_1.setBounds(30, 61, 46, 14);
		getContentPane().add(lblNewLabel_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(107, 58, 131, 20);
		getContentPane().add(passwordField);

		textField = new JTextField();
		textField.setBounds(107, 23, 131, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnEinloggen = new JButton("Einloggen");
		btnEinloggen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Startansicht frame = new Startansicht();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
						setVisible(false);
						dispose();
					}
				});
			}
		});
		btnEinloggen.setBounds(155, 103, 89, 23);
		getContentPane().add(btnEinloggen);

		JButton btnBeenden = new JButton("Beenden");
		btnBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				System.exit(0);
			}
		});
		btnBeenden.setBounds(254, 103, 89, 23);
		getContentPane().add(btnBeenden);

		JButton btnPasswortVergessen = new JButton("Passwort vergessen?");
		btnPasswortVergessen.setBounds(10, 103, 135, 23);
		getContentPane().add(btnPasswortVergessen);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 86, 352, 2);
		getContentPane().add(separator);
		setBounds(100, 100, 400, 400);
		
	
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnmeldeGUI frame = new AnmeldeGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
