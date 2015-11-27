package Controller;

import java.sql.Connection;
import java.util.Arrays;
import DB_Controller.SelbstinformationSQLController;


public class SelbstinformationController {
	
	private SelbstinformationSQLController controller;
	
	
	public SelbstinformationController(Connection con){
		this.controller = new SelbstinformationSQLController(con);
	}
	
	
	public boolean passwoerterGleich(char[] pw1, char[] pw2){
		if (Arrays.equals(pw1, pw2)){
			return true;
		}else {
			return false;
		}
		
		
	}
	public boolean passwortSpeichern(String Passwort, String name){
		controller.setPasswort(Passwort, name);
		return true;
	}
}
