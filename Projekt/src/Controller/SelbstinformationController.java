package Controller;

import java.util.Arrays;

public class SelbstinformationController {
	public SelbstinformationController(){
	
	}
	public boolean passwoerterGleich(char[] pw1, char[] pw2){
		if (Arrays.equals(pw1, pw2)){
			return true;
		}else {
			return false;
		}
		
		
	}
	public boolean passwortSpeichern(String nutzer){
		//Datenbankkommandos
		
		return true;
	}
}
