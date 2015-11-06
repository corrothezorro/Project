package Model;

public class Modul {

	private String bezeichnung;
	private int modNr;
	private boolean aktiv;
	
	public Modul(String bezeichnung, int modNr, boolean aktiv) {
		this.bezeichnung = bezeichnung;
		this.modNr = modNr;
		this.aktiv = aktiv;
	}
	
	public boolean getAktiv() {
		return aktiv;
	}

	public void setAktiv(boolean aktiv) {
		this.aktiv = aktiv;
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
