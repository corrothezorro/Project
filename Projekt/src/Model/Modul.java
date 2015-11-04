package Model;

public class Modul {

	private String bezeichnung;
	private int modNr;
	
	public Modul(String bezeichnung, int modNr) {
		this.bezeichnung = bezeichnung;
		this.modNr = modNr;
	}

	public int getModNr() {
		return modNr;
	}

	public void setModNr(int modNr) {
		this.modNr = modNr;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

}
