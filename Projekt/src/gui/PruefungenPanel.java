package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;

import details.PruefungDet;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class PruefungenPanel extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public PruefungenPanel(String rolle) {
		setLayout(null);
		JTextPane txtpnTabelleMitInformationen = new JTextPane();
		txtpnTabelleMitInformationen.setText("Tabelle mit Informationen zu den Pr\u00FCfungen f\u00FCr die der angemeldete Dozent eingetragen ist");
		txtpnTabelleMitInformationen.setBounds(16, 68, 446, 110);
		add(txtpnTabelleMitInformationen);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(263, 68, 0, 2);
		add(separator_1);
		setBounds(100, 100, 679, 238);
		
		JButton btnNewButton_1 = new JButton("Bearbeiten");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							PruefungDet frame = new PruefungDet();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
						setVisible(false);
						//dispose();
					}
				});
				
				
				
			}
		});
		btnNewButton_1.setBounds(364, 188, 85, 23);
		add(btnNewButton_1);
		
		if (rolle == "Admin" | rolle == "Fachgruppenreferent"){
		
		
		JRadioButton rdbtnEigenePrfungen = new JRadioButton("eigene Pr\u00FCfungen");
		rdbtnEigenePrfungen.setSelected(true);
		buttonGroup.add(rdbtnEigenePrfungen);
		rdbtnEigenePrfungen.setBounds(6, 7, 153, 23);
		add(rdbtnEigenePrfungen);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("alle Pr\u00FCfungen");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 33, 126, 23);
		add(rdbtnNewRadioButton);
		}
		
	}
}
