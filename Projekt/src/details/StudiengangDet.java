package details;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class StudiengangDet extends JFrame{
	private JTextField textField;
	public StudiengangDet() {
		setTitle("Detailansicht Studiengang");
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(106, 27, 120, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.setBounds(63, 58, 89, 23);
		getContentPane().add(btnSpeichern);
		
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(162, 58, 89, 23);
		getContentPane().add(btnAbbrechen);
		
		JLabel lblBezeichnung = new JLabel("Bezeichnung:");
		lblBezeichnung.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBezeichnung.setBounds(10, 30, 86, 14);
		getContentPane().add(lblBezeichnung);
	}

}
