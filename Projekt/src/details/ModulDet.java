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
import javax.swing.JCheckBox;

public class ModulDet extends JFrame{
	private JTextField txtModbez;
	private JTextField txtModnr;
	public ModulDet(String modbez, int modnr, boolean aktiv) {
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
		
		txtModbez = new JTextField(modbez);
		txtModbez.setBounds(110, 24, 120, 20);
		getContentPane().add(txtModbez);
		txtModbez.setColumns(10);
		
		txtModnr = new JTextField(modnr);
		txtModnr.setBounds(110, 49, 120, 20);
		getContentPane().add(txtModnr);
		txtModnr.setColumns(10);
		
		JButton btnNewButton = new JButton("Speichern");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(27, 239, 120, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Abbrechen");
		btnNewButton_1.setBounds(157, 239, 115, 23);
		getContentPane().add(btnNewButton_1);
		
		JTextPane txtpnprfungenDieZu = new JTextPane();
		txtpnprfungenDieZu.setText("//Pr\u00FCfungen, die zu dem Modul geh\u00F6ren");
		txtpnprfungenDieZu.setBounds(22, 119, 271, 109);
		getContentPane().add(txtpnprfungenDieZu);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 106, 269, 2);
		getContentPane().add(separator);
		
		JLabel lblAktivitt = new JLabel("Aktivit\u00E4t:");
		lblAktivitt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAktivitt.setBounds(17, 81, 73, 14);
		getContentPane().add(lblAktivitt);
		
		JCheckBox chckbxAktiv = new JCheckBox("aktiv");
		chckbxAktiv.setBounds(110, 76, 97, 23);
		chckbxAktiv.setSelected(aktiv);
		getContentPane().add(chckbxAktiv);
		
	}
}
