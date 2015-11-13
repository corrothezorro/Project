package details;

import javax.swing.JFrame;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class PruefungenFrame extends JFrame{
	private JTable table;
	public PruefungenFrame() {
		setTitle("Pr\u00FCfung hinzuf\u00FCgen");
		getContentPane().setLayout(null);
		
		
		JScrollPane sp = new JScrollPane();
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{true, "hallo", "penis"},
				{false, "hallo 2", "otoo"},
			},
			new String[] {
				"Ausw\u00E4hlen", "Pr\u00FCfungsname", "Pr\u00FCfungsnummer"
			}
		) {
			Class[] columnTypes = new Class[] {
				Boolean.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(109);
		table.getColumnModel().getColumn(2).setPreferredWidth(142);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		sp.add(table);
		sp.setBounds(10, 11, 414, 160);
		getContentPane().add(sp);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(335, 182, 89, 23);
		getContentPane().add(btnOk);
		setBounds(100,100,200,200);
	}
	
	public static void main(String[] args){
		try {								
				PruefungenFrame frame = new PruefungenFrame();
				frame.setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
