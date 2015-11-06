package Model;

public class User {
	private char[] passwort;
	private String nachname;
	private String rolle;
	private String benutzername;
	private boolean aktiv;
	
	public User(String benutzername, char[] passwort, String nachname, String rolle, boolean aktiv){
		this.benutzername = benutzername;
		this.passwort = passwort;
		this.nachname = nachname;
		this.rolle = rolle;
		this.aktiv = aktiv;
	}	
	
	public boolean getAktiv() {
		return aktiv;
	}

	public void setAktiv(boolean aktiv) {
		this.aktiv = aktiv;
	}

	public char[] getPasswort() {
		return passwort;
	}

	public void setPasswort(char[] passwort) {
		this.passwort = passwort;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getRolle() {
		return rolle;
	}

	public void setRolle(String rolle) {
		this.rolle = rolle;
	}

	public String getBenutzername() {
		return benutzername;
	}

	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}
	
	
}
