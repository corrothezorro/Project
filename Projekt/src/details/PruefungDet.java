package details;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class PruefungDet extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public PruefungDet() {
		setTitle("Detailansicht Pr\u00FCfung");
		getContentPane().setLayout(null);
		
		JLabel lblPrfnr = new JLabel("Prf.Nr.:");
		lblPrfnr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrfnr.setBounds(10, 22, 63, 14);
		getContentPane().add(lblPrfnr);
		
		JLabel lblDatum = new JLabel("Datum:");
		lblDatum.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDatum.setBounds(10, 44, 63, 14);
		getContentPane().add(lblDatum);
		
		JLabel lblRaum = new JLabel("Raum:");
		lblRaum.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRaum.setBounds(10, 69, 63, 14);
		getContentPane().add(lblRaum);
		
		JLabel lblForm = new JLabel("Form:");
		lblForm.setHorizontalAlignment(SwingConstants.RIGHT);
		lblForm.setBounds(7, 94, 66, 14);
		getContentPane().add(lblForm);
		
		JLabel lblDauer = new JLabel("Dauer:");
		lblDauer.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDauer.setBounds(15, 119, 58, 14);
		getContentPane().add(lblDauer);
		
		JLabel lblModul = new JLabel("Modul:");
		lblModul.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModul.setBounds(27, 141, 46, 14);
		getContentPane().add(lblModul);
		
		textField = new JTextField();
		textField.setBounds(83, 19, 120, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 66, 120, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lbldatetimepicker = new JLabel("//DateTimePicker");
		lbldatetimepicker.setBounds(93, 44, 99, 14);
		getContentPane().add(lbldatetimepicker);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(83, 91, 120, 20);
		getContentPane().add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBounds(83, 116, 120, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(83, 138, 120, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNurFr = new JLabel("// nur f\u00FCr den Admin \u00E4nderbar");
		lblNurFr.setBounds(229, 141, 126, 14);
		getContentPane().add(lblNurFr);
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.setBounds(58, 175, 89, 23);
		getContentPane().add(btnSpeichern);
		
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(166, 175, 89, 23);
		getContentPane().add(btnAbbrechen);
	}

}
