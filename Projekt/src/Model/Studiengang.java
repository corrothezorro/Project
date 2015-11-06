package Model;

public class Studiengang {
	private String bezeichnung;
	private boolean aktiv;
	
	public Studiengang(String bezeichnung, boolean aktiv) {
		this.bezeichnung = bezeichnung;
		this.aktiv = aktiv;
	}
	
	public boolean getAktiv() {
		return aktiv;
	}

	public void setAktiv(boolean aktiv) {
		this.aktiv = aktiv;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

}
