package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.util.TreeMap;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import details.PruefungDet;
import details.Selbstinformation;
import details.UserDet;

import javax.swing.JMenu;

import Controller.StartansichtController;
import Model.Pruefung;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Startansicht extends JFrame{
	
	
	ListSelectionModel listmodel;
	Tabelle tabelle;
	DefaultTableModel dtm;
	TableRowSorter<DefaultTableModel> sorter;
	StartansichtController startansichtController = new StartansichtController();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JButton btnBearbeiten;
	JButton btnNeu;
	
	public Startansicht(String nutzername) {
		// Abfrage der Rolle des angemeldeten Nutzers
		String rolle;
		rolle = startansichtController.BestimmeRolle(nutzername);
		
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
		
		btnBearbeiten = new JButton("Bearbeiten");
		btnBearbeiten.setBounds(504, 266, 113, 23);
		getContentPane().add(btnBearbeiten);
		
		btnNeu = new JButton("Neu");
		btnNeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNeu.setBounds(405, 266, 89, 23);
		getContentPane().add(btnNeu);
		
		JRadioButton rbtnEigene = new JRadioButton("eigene Pr\u00FCfungen");
		rbtnEigene.setSelected(true);
		buttonGroup.add(rbtnEigene);
		rbtnEigene.setBounds(31, 104, 155, 23);
		getContentPane().add(rbtnEigene);
		
		JRadioButton rbtnFachgruppe = new JRadioButton("Pr\u00FCfungen Fachgruppe");
		buttonGroup.add(rbtnFachgruppe);
		rbtnFachgruppe.setBounds(185, 104, 161, 23);
		getContentPane().add(rbtnFachgruppe);
		
		
		
		
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
		
		
		
		
		
		
		
		
		
		
		ActionListener myActionListener = new MyActionListener(this);
		ListSelectionListener myListSelectionListener = new MyListSelectionListener(this);
		
		
		
		
		dtm = new DefaultTableModel(startansichtController.data(), startansichtController.getColumnNamesPruefung()) {
			
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		}; 
			
		tabelle = new Tabelle("Pruefung", dtm);
		
		tabelle.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		sorter = new TableRowSorter<DefaultTableModel>(dtm);
					//tabelle.setRowSorter(sorter);
					//sorter.setComparator(3, new DateComparator());
					//sorter.setComparator(0, new IntegerComparator());

				
		/*
		 * Farbgestaltung der Tabelle wird durch Verwendung der Klasse
		 * ColoredTableCellRenderer definiert. Jede zweite Zeile wird farblich hervorgehoben.
		 * Wird eine Zeile ausgewählt, wird dies wiederum durch eine farbliche 
		 * Hervorhebung angezeigt. 
		 */
		
		/*
		 * Damit eine Tabelle ein Event auslöst, sobald eine Zeile ausgewählt ist,
		 * ist es erforderlich, eine Variable der Klasse ListSelectionModel zu deklarieren
		 * und diese mit dem SelectionModel der Tabelle zu initialisieren. Diese Variable
		 * wird anschließen beim Eventhandler LisSelectionListener registriert.
		 */
		listmodel = tabelle.getSelectionModel();
		listmodel.addListSelectionListener(myListSelectionListener);
		
		
		//JScrollPane sp = new JScrollPane(tabelle);
		
		getContentPane().add(tabelle);;
		
		
		
		
		
		
		
	}
}
