package details;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;

import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JTable;

public class StudiengangDet extends JFrame{
	private JTextField txtBezeichnung;
	private JTable table;
	
	
	public StudiengangDet(String bezeichnung, boolean aktiv, Connection con) {
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
		btnSpeichern.setBounds(58, 255, 120, 23);
		getContentPane().add(btnSpeichern);
		
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAbbrechen.setBounds(188, 255, 110, 23);
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
		chckbxAktiv.setBounds(117, 54, 97, 23);
		getContentPane().add(chckbxAktiv);
		
		JButton btnHinzufgen = new JButton("Hinzuf\u00FCgen");
		btnHinzufgen.setBounds(33, 204, 89, 23);
		getContentPane().add(btnHinzufgen);
		
		JButton btnEntfernen = new JButton("Entfernen");
		btnEntfernen.setBounds(125, 204, 89, 23);
		getContentPane().add(btnEntfernen);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(41, 83, 243, 8);
		getContentPane().add(separator);
		
		JScrollPane sp = new JScrollPane();
		table = new JTable();
		sp.setBounds(33, 95, 258, 98);
		sp.add(table);
		getContentPane().add(sp);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(33, 241, 258, 14);
		getContentPane().add(separator_1);
	}
}
