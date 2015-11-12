package details;

import javax.swing.JFrame;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
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
				{null, null, null},
				{null, null, null},
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
		sp.add(table);
		sp.setBounds(10, 11, 414, 160);
		getContentPane().add(sp);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(335, 182, 89, 23);
		getContentPane().add(btnOk);
		
	}
}
