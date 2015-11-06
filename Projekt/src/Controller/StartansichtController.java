package Controller;

import java.util.Date;
import java.util.TreeMap;

import Model.Dozent;
import Model.Fachgruppe;
import Model.Modul;
import Model.Prueferkonstellation;
import Model.Pruefung;
import Model.Studiengang;
import Model.User;

public class StartansichtController {
	
	private TreeMap<Integer, Pruefung> pruefungen;
	private TreeMap<Integer, Modul> module;
	private TreeMap<Integer, Fachgruppe> fachgruppen;
	private TreeMap<Integer, User> user;
	private TreeMap<Integer, Studiengang> studgaenge;
	private TreeMap<Integer, Prueferkonstellation> prueferkonst;
	
	private String[] columnNamesUser = { "Benutzername", "Nachname", "Rolle", "aktiv" };
	private String[] columnNamesFachgruppe = { "Bezeichnung", "aktiv" };
	private String[] columnNamesModul = { "Modulbezeichnung", "Modulnr.", "aktiv" };
	private String[] columnNamesPrueferkonst = { "Studiengänge", "Erstprüfer", "Zweitprüfer", "Prüfungen" };
	private String[] columnNamesPruefung = { "Prüfungsnr." , "Datum", "Prüfungsform", "Dauer", "Raum", "aktiv"};
	private String[] columnNamesStudiengang = { "Bezeichnung", "aktiv" };
	
	private Pruefung aktPruefung;
	private Modul aktModul;
	private Fachgruppe aktFachgruppe;
	private User aktUser;
	private Studiengang aktStudiengang;
	private Prueferkonstellation aktPrueferkonst;
	
	public StartansichtController(){
		
	}
	
	public String BestimmeRolle(String nutzername){
		
		// SQL-Kommande zum Herausfinden der Rolle des angemeldeten Nutzers
		
		return "test";
	}
	
	public Pruefung getAktPruefung() {
		return aktPruefung;
	}

	public Modul getAktModul() {
		return aktModul;
	}

	public Fachgruppe getAktFachgruppe() {
		return aktFachgruppe;
	}

	public User getAktUser() {
		return aktUser;
	}

	public Studiengang getAktStudiengang() {
		return aktStudiengang;
	}

	public Prueferkonstellation getAktPrueferkonst() {
		return aktPrueferkonst;
	}

	public void aenderAktPruefung(int prfnr, Date datum, String prfForm, int dauer, String raum, boolean aktiv){
		aktPruefung = new Pruefung(prfnr, datum, prfForm, dauer, raum, aktiv);
	}
	public void aenderAktModul(String modbez, int modnr, boolean aktiv){
		aktModul = new Modul(modbez, modnr, aktiv);
	}
	public void aenderAktFachgruppe(String bezeichnung, boolean aktiv){
		aktFachgruppe = new Fachgruppe(bezeichnung, aktiv);
	}
	public void aenderAktUser(String benutzername, char[] passwort, String nachname, String rolle, boolean aktiv){
		aktUser = new User(benutzername, passwort, nachname, rolle, aktiv);
	}
	public void aenderAktStudiengang(String bezeichnung, boolean aktiv){
		aktStudiengang = new Studiengang(bezeichnung, aktiv);
	}
	public void aenderPrufestkonst(Studiengang[] studiengaenge, Dozent erstpruefer, Dozent[] zweitpruefer, Pruefung[] pruefungen){
		aktPrueferkonst = new Prueferkonstellation(studiengaenge, erstpruefer, zweitpruefer,pruefungen);
	}

	public String[] getColumnNamesUser() {
		return columnNamesUser;
	}

	public String[] getColumnNamesFachgruppe() {
		return columnNamesFachgruppe;
	}

	public String[] getColumnNamesModul() {
		return columnNamesModul;
	}

	public String[] getColumnNamesPrueferkonst() {
		return columnNamesPrueferkonst;
	}

	public String[] getColumnNamesPruefung() {
		return columnNamesPruefung;
	}

	public String[] getColumnNamesStudiengang() {
		return columnNamesStudiengang;
	}
	
	public Object[][] data(){
		// prfnr, datum, prfForm, dauer, raum, aktiv
		Object[][] datas = new String[2][6];
		datas[0][0] = "1001";
		datas[0][1] = "12.12.1992";
		datas[0][2] = "klausur";
		datas[0][3] = "120";
		datas[0][4] = "b3";
		datas[0][5] = "true";
		
		datas[1][0] = "1002";
		datas[1][1] = "11.11.1990";
		datas[1][2] = "Präsi";
		datas[1][3] = "30";
		datas[1][4] = "b2";
		datas[1][5] = "false";
		
		return datas;
	}
	
	
	
	
	
	
}
