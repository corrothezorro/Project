package Model;

public class Fachgruppe {
	private String name;
	private boolean aktiv;
	
	public Fachgruppe(String name, boolean aktiv){
		this.name = name;
		this.aktiv = aktiv;
	}
	
	
	public boolean getAktiv() {
		return aktiv;
	}

	public void setAktiv(boolean aktiv) {
		this.aktiv = aktiv;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
