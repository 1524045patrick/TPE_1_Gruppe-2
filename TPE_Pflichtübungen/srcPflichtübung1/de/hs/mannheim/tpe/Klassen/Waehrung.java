package de.hs.mannheim.tpe.Klassen;

/**
 * 
 * 
 * @author Mandy Schmitt 1521592
 * @category Waehrung rechnet die Beträge um
 * 
 */

public final class Waehrung extends Waehrungen {

	private String name;
	private String kuerzel;
	private long kurs;
	private long zielWaehrung;
	private double betrag;
	private double anfangsWaehrung;

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @return gibt die Waehrung vor der Umrechnung aus
	 */
	public double getAnfangsWaehrung() {
		return anfangsWaehrung;

	}

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @param zielWaehrung
	 *            man gibt an in welche Waehrung man sein Geld wechseln moechte
	 */
	public void setZielWaehrung(long zielWaehrung) {
		this.zielWaehrung = zielWaehrung;
	}
	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @return	gibt die eingegebene Zielwaehrung zurück
	 */
	public long getZielWaehrung() {
		return zielWaehrung;
	}
	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @return	gibt den momentanen Betrag des Kontos aus
	 */
	public double getBetrag() {
		return betrag;
	}
	
	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @return gibt den Namen des Kontoinhabers aus
	 */
	public String getName() {
		return name;

	}
	
	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @return gibt das Kürzel der Währung aus
	 */
	public String getKuerzel() {
		return kuerzel;

	}
	
	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @return gibt den Wechselkurs aus
	 */
	public long getKurs() {
		return kurs;

	}
	
	
	//TODO Umrechnung der Anfangs in die Zielwährung
	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @param betrag
	 * @param zielWaehrung
	 */
	
	
	public void umrechnen(double betrag, long zielWaehrung) {
		betrag = anfangsWaehrung * kursDollar;
		zielWaehrung = (long) (betrag * kurs);
		System.out.println(zielWaehrung);

	}

}
