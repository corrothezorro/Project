package details;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class StudiengangDet extends JFrame{
	private JTextField txtBezeichnung;
	public StudiengangDet() {
		setTitle("Detailansicht Studiengang");
		getContentPane().setLayout(null);
		
		txtBezeichnung = new JTextField();
		txtBezeichnung.setBounds(121, 27, 120, 20);
		getContentPane().add(txtBezeichnung);
		txtBezeichnung.setColumns(10);
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSpeichern.setBounds(33, 195, 120, 23);
		getContentPane().add(btnSpeichern);
		
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(174, 195, 110, 23);
		getContentPane().add(btnAbbrechen);
		
		JLabel lblBezeichnung = new JLabel("Bezeichnung:");
		lblBezeichnung.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBezeichnung.setBounds(10, 30, 86, 14);
		getContentPane().add(lblBezeichnung);
		
		JLabel lblAktivitt = new JLabel("Aktivit\u00E4t:");
		lblAktivitt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAktivitt.setBounds(33, 58, 63, 14);
		getContentPane().add(lblAktivitt);
		
		JCheckBox chckbxAktiv = new JCheckBox("aktiv");
		chckbxAktiv.setBounds(121, 54, 97, 23);
		getContentPane().add(chckbxAktiv);
		
		JTextArea txtrTabelleMit = new JTextArea();
		txtrTabelleMit.setText("// Tabelle mit Modulen zum Studiengang");
		txtrTabelleMit.setBounds(33, 90, 358, 94);
		getContentPane().add(txtrTabelleMit);
		
		JButton btnHinzufgen = new JButton("Hinzuf\u00FCgen");
		btnHinzufgen.setBounds(396, 108, 89, 23);
		getContentPane().add(btnHinzufgen);
		
		JButton btnEntfernen = new JButton("Entfernen");
		btnEntfernen.setBounds(401, 142, 89, 23);
		getContentPane().add(btnEntfernen);
	}
}
