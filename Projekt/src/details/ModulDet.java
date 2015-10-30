package details;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JSeparator;

public class ModulDet extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	public ModulDet() {
		setTitle("Detailansicht Modul");
		getContentPane().setLayout(null);
		
		JLabel lblBezeichnung = new JLabel("Bezeichnung:");
		lblBezeichnung.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBezeichnung.setBounds(-18, 27, 108, 14);
		getContentPane().add(lblBezeichnung);
		
		JLabel lblModulnummer = new JLabel("Modulnummer:");
		lblModulnummer.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModulnummer.setBounds(-40, 52, 130, 14);
		getContentPane().add(lblModulnummer);
		
		textField = new JTextField();
		textField.setBounds(110, 24, 120, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 49, 120, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Speichern");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(60, 211, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Abbrechen");
		btnNewButton_1.setBounds(159, 211, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JTextPane txtpnprfungenDieZu = new JTextPane();
		txtpnprfungenDieZu.setText("//Pr\u00FCfungen, die zu dem Modul geh\u00F6ren");
		txtpnprfungenDieZu.setBounds(24, 91, 271, 109);
		getContentPane().add(txtpnprfungenDieZu);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 77, 269, 2);
		getContentPane().add(separator);
	}
}
