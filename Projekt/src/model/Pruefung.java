package model;

import java.util.Date;

public class Pruefung {
	private int prfNr;
	private Date datum;
	private String pruefungsForm;
	private int dauer;
	private String raum;
	private boolean aktiv;

	public Pruefung(int prfNr, Date datum, String pruefungsForm, int dauer, String raum, boolean aktiv){
		this.prfNr = prfNr;
		this.datum = datum;
		this.pruefungsForm = pruefungsForm;
		this.dauer = dauer;
		this.raum = raum;
		this.aktiv = aktiv;
	}
		
	public boolean getAktiv() {
		return aktiv;
	}

	public void setAktiv(boolean aktiv) {
		this.aktiv = aktiv;
	}

	public int getPrfNr() {
		return prfNr;
	}

	public void setPrfNr(int prfNr) {
		this.prfNr = prfNr;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getPruefungsForm() {
		return pruefungsForm;
	}

	public void setPruefungsForm(String pruefungsForm) {
		this.pruefungsForm = pruefungsForm;
	}

	public int getDauer() {
		return dauer;
	}

	public void setDauer(int dauer) {
		this.dauer = dauer;
	}

	public String getRaum() {
		return raum;
	}

	public void setRaum(String raum) {
		this.raum = raum;
	}


	
	
}
