package model;

import java.util.Date;

public class Fachsemester {
	private String bezeichnung;
	private Date frist;
	public Fachsemester(String bezeichnung, Date frist){
		this.bezeichnung = bezeichnung;
		this.frist = frist;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public Date getFrist() {
		return frist;
	}
	public void setFrist(Date frist) {
		this.frist = frist;
	}
	
}
