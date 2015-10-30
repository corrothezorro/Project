package grenzklassen;

public class Prueferkonstellation {
	private Studiengang[] studiengaenge;
	private Dozent erstpruefer;
	private Dozent[] zweitpruefer;
	private Pruefung[] pruefungen;
	
	public Prueferkonstellation(Studiengang[] studiengaenge, Dozent erstpruefer, Dozent[] zweitpruefer, Pruefung[] pruefungen){
		this.studiengaenge = studiengaenge;
		this.erstpruefer = erstpruefer;
		this.zweitpruefer = zweitpruefer;
		this.pruefungen = pruefungen;
	}
	
	public Prueferkonstellation(){
		
	}
	

	public Studiengang[] getStudiengaenge() {
		return studiengaenge;
	}

	public void setStudiengaenge(Studiengang[] studiengaenge) {
		this.studiengaenge = studiengaenge;
	}

	public Dozent getErstpruefer() {
		return erstpruefer;
	}

	public void setErstpruefer(Dozent erstpruefer) {
		this.erstpruefer = erstpruefer;
	}

	public Dozent[] getZweitpruefer() {
		return zweitpruefer;
	}

	public void setZweitpruefer(Dozent[] zweitpruefer) {
		this.zweitpruefer = zweitpruefer;
	}

	public Pruefung[] getPruefungen() {
		return pruefungen;
	}

	public void setPruefungen(Pruefung[] pruefungen) {
		this.pruefungen = pruefungen;
	}
	
	
}
