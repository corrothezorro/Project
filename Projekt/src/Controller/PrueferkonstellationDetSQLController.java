package Controller;

import java.sql.*;

public class PrueferkonstellationDetSQLController {
	Connection con;
	public PrueferkonstellationDetSQLController(Connection con){
		this.con = con;
	}

	public String getFachgruppe(String nutzername) {
		String result = "";
		String sql = "select bezeichnung from fachgruppe where nutzername = " + nutzername;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()){
				result = rs.getString(1);
			}
		} catch (SQLException e) {
			System.out.println("Fehler in getFachgruppe");
			e.printStackTrace();
		}
		return result;
	}

	public String[] getModule(String fachgruppe) {
		
			String[] result = null;
			int i = 0;
			String sql = "select bezeichnung from modul where fachgruppe.bezeichnung = " + fachgruppe;
			try {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()){
					i += 1;
				}
				rs.beforeFirst();
				i = 0;
				while (rs.next()){
					result[i] = rs.getString(1);
					i += 1;
				}
			} catch (SQLException e) {
				System.out.println("Fehler in getModule");
				e.printStackTrace();
			}
			return result;
	}
}
