package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import details.PruefungDet;
import details.Selbstinformation;
import details.UserDet;

import javax.swing.JMenu;

public class Startansicht extends JFrame{
	
	public Startansicht(String nutzerName) {
		setTitle("Pr\u00FCfungsverwaltung");
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(31, 41, 46, 14);
		getContentPane().add(lblName);
		
		JLabel lblJlblname = new JLabel("lblName");
		lblJlblname.setHorizontalAlignment(SwingConstants.LEFT);
		lblJlblname.setBounds(109, 41, 46, 14);
		getContentPane().add(lblJlblname);
		
		JLabel lblNewLabel = new JLabel("Rolle:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(31, 66, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblLblrolle = new JLabel("lblRolle");
		lblLblrolle.setHorizontalAlignment(SwingConstants.LEFT);
		lblLblrolle.setBounds(109, 66, 46, 14);
		getContentPane().add(lblLblrolle);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 91, 586, 2);
		getContentPane().add(separator);
		
		JLabel lblBenutzer = new JLabel("Benutzer:");
		lblBenutzer.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBenutzer.setBounds(10, 16, 67, 14);
		getContentPane().add(lblBenutzer);
		
		JLabel lblLblbenutzer = new JLabel("lblBenutzer");
		lblLblbenutzer.setHorizontalAlignment(SwingConstants.LEFT);
		lblLblbenutzer.setBounds(109, 16, 77, 14);
		getContentPane().add(lblLblbenutzer);
		
		
		String rolle = "Admin";
		JPanel PruefungenPanel = new PruefungenPanel(rolle);
		PruefungenPanel.setSize(651, 238);
		PruefungenPanel.setLocation(10, 92);
		getContentPane().add(PruefungenPanel);
		
		JButton btnNeu = new JButton("Neu");
		btnNeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNeu.setBounds(165, 191, 69, 23);
		PruefungenPanel.add(btnNeu);
		
		JButton btnLschen = new JButton("L\u00F6schen");
		btnLschen.setBounds(265, 191, 89, 23);
		PruefungenPanel.add(btnLschen);
		
		setBounds(100, 100, 677, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEinstellungen = new JMenu("Einstellungen");
		menuBar.add(mnEinstellungen);
		
		JMenuItem nutzerInformationen = new JMenuItem("Benutzerinformationen");
		nutzerInformationen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							String name = null;
							String nutzername = null;
							char[] passwort = null;
							String rolle = null;
							Selbstinformation frame = new Selbstinformation(nutzername);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					
						
					}
				});
				
			}
		});
		mnEinstellungen.add(nutzerInformationen);
		
		JMenu mnBearbeiten = new JMenu("Bearbeiten");
		menuBar.add(mnBearbeiten);
		
		JMenuItem mntmModule = new JMenuItem("Module");
		mntmModule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							String name = null;
							String nutzername = null;
							char[] passwort = null;
							String rolle = null;
							UserDet frame = new UserDet(name, nutzername, passwort, rolle);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					
						
					}
				});
			}
		});
		mnBearbeiten.add(mntmModule);
		
		JMenuItem mntmNutzer = new JMenuItem("Nutzer");
		mntmNutzer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnBearbeiten.add(mntmNutzer);
		
		JMenuItem mntmPrfungen = new JMenuItem("Pr\u00FCfungen");
		mnBearbeiten.add(mntmPrfungen);
		
		JMenuItem mntmStudiengnge = new JMenuItem("Studieng\u00E4nge");
		mnBearbeiten.add(mntmStudiengnge);
		
		JMenuItem mntmFachgruppen = new JMenuItem("Fachgruppen");
		mnBearbeiten.add(mntmFachgruppen);
		
		JMenu mnber = new JMenu("\u00DCber");
		menuBar.add(mnber);
		
		JMenuItem mntmFeedback = new JMenuItem("Feedback");
		mnber.add(mntmFeedback);
		
		
	}
}
