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
	
	
	
	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @param b
	 *            bekommt ein Objekt uebergeben welches den Betrag + seine
	 *            Waehrung angibt
	 * @return schreibt die Waehrungen alle in Dollar um und rechnet den Betrag
	 *         dieser Waehrung mittels Wechselkurs aus und gibt ihn zurueck
	 */
	
	public Betrag wechselkurse(Betrag b) {
		if (b.getWaehrung().equals(euro)) {
			b.setWaehrung(dollar);
			b.setBetrag(b.getBetrag() * kursEuro);
			return b;
		} else if (b.getWaehrung().equals(yen)) {
			b.setWaehrung(dollar);
			b.setBetrag(b.getBetrag() * kursYen);
			return b;
		} else if (b.getWaehrung().equals(rubel)) {
			b.setWaehrung(dollar);
			b.setBetrag(b.getBetrag() * kursRubel);
			return b;
		} else if (b.getWaehrung().equals(schweizerFranken)) {
			b.setWaehrung(dollar);
			b.setBetrag(b.getBetrag() * kursSchweizerFranken);
			return b;
		} else if (b.getWaehrung().equals(dollar)) {
			return b;
		} else {
			System.out.println("Keine vorhandene Waehrung angegeben");
			System.out.println("Bitte korrigieren.");
		}
		return null;

	}


}
