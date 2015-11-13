package Controller;

import java.sql.Connection;

public class PrueferkonstellationDetController {
PrueferkonstellationDetSQLController controller;
	public PrueferkonstellationDetController(Connection con){
	controller = new PrueferkonstellationDetSQLController(con);
}
	
	public String getFachgruppe(String nutzer){
		return controller.getFachgruppe(nutzer);
	}
	
	public String[] getModule(String fachgruppe) {
		
		return controller.getModule(fachgruppe);
	}
}
