package details;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;

import javax.swing.JCheckBox;

public class PruefungDet extends JFrame{
	private JTextField txtPrfnr;
	private JTextField txtRaum;
	private JTextField txtDauer;
	private JTextField txtModul;
	
	
	public PruefungDet(int prfnr, Date datum, String prfForm, int dauer, String raum, boolean aktiv) {
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
		lblModul.setBounds(10, 141, 63, 14);
		getContentPane().add(lblModul);
		
		txtPrfnr = new JTextField();
		txtPrfnr.setText("" + prfnr);
		txtPrfnr.setBounds(83, 19, 120, 20);
		getContentPane().add(txtPrfnr);
		txtPrfnr.setColumns(10);
		
		txtRaum = new JTextField();
		txtRaum.setText("" + raum);
		txtRaum.setBounds(83, 66, 120, 20);
		getContentPane().add(txtRaum);
		txtRaum.setColumns(10);
		
		JLabel lbldatetimepicker = new JLabel("//DateTimePicker");
		lbldatetimepicker.setBounds(93, 44, 99, 14);
		getContentPane().add(lbldatetimepicker);
		
		JComboBox cbForm = new JComboBox();
		cbForm.setBounds(83, 91, 120, 20);
		getContentPane().add(cbForm);
		
		txtDauer = new JTextField();
		txtDauer.setText("" + dauer);
		txtDauer.setBounds(83, 116, 120, 20);
		getContentPane().add(txtDauer);
		txtDauer.setColumns(10);
		
		txtModul = new JTextField();
		txtModul.setText("modul");
		txtModul.setBounds(83, 138, 120, 20);
		getContentPane().add(txtModul);
		txtModul.setColumns(10);
		
		JLabel lblNurFr = new JLabel("// nur f\u00FCr den Admin \u00E4nderbar");
		lblNurFr.setBounds(229, 141, 182, 14);
		getContentPane().add(lblNurFr);
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSpeichern.setBounds(39, 192, 120, 23);
		getContentPane().add(btnSpeichern);
		
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(175, 192, 110, 23);
		getContentPane().add(btnAbbrechen);
		
		JLabel lblAktiv = new JLabel("Aktivit\u00E4t:");
		lblAktiv.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAktiv.setBounds(10, 167, 63, 14);
		getContentPane().add(lblAktiv);
		
		JCheckBox chckbxAktiv = new JCheckBox("aktiv");
		chckbxAktiv.setBounds(83, 162, 97, 23);
		getContentPane().add(chckbxAktiv);
		if (aktiv){
			System.out.println(aktiv + "");
			chckbxAktiv.setSelected(true);
		}else {
			System.out.println(aktiv + "");
			chckbxAktiv.setSelected(false);
		}
		setBounds(100, 100, 430, 338);
		
		
		
	}
}
