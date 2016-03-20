package Klassen;

/**
 * 
 * @author ${Patrick Hentschel 1524045}
 * @category Betragsklasse verwaltet die Waehrung, sowie den Kontostand, mittels
 *           folgender Funktionen.
 */
public final class Betrag {
	private long betrag;
	private String waehrung;

	/**
	 * Der Konstruktor der Klasse Betrag
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @param betrag
	 *            uebergibt den Betrag des Kontostandes als double Wert
	 * @param waehrung
	 *            uebergibt die Waehrung des Betrages
	 */

	public Betrag(double betrag, String waehrung) {
		// TODO ausgabe in hundertstel

		this.betrag = (long) betrag;
		this.waehrung = waehrung;

	}

	/**
	 * @author ${Patrick Hentschel 1524045}
	 * @param betrag
	 *            uebergibt den Betrag des Kontostandes als long Wert
	 * @param waehrung
	 *            uebergibt die Waehrung des Betrages
	 * 
	 */
	// TODO Ausgabe in Hunderstel
	public Betrag(long betrag, String waehrung) {

		this.betrag = betrag;
		this.waehrung = waehrung;

	}

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045} die Methode getVorzeichen gibt aus
	 *         ob der Kontostand positiv oder negativ ist mittels 1 oder -1
	 *         sollte der kontostand genau 0 sein so wird auch eine 0
	 *         zurueckgegeben
	 */
	public int getVorzeichen() {
		if (betrag >= 1) {
			return 1;
		} else if (betrag == 0) {
			return 0;
		}
		if (betrag < 1) {
			return -1;
		}
		System.out.println("Fehler Ihr Kontostand ist weder positiv,negativ noch gleich 0.");
		return -0;
	}

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @return gibt den Betrag des Objekts Betrag zurück
	 */
	public long getBetrag() {
		return betrag;
	}

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @param betrag
	 *            gibt die Moeglichkeit den Betrag des Objektes Betrag zu ändern
	 */
	public void setBetrag(long betrag) {
		this.betrag = betrag;
	}

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @return gibt die Waehrung des entsprechenden Objektes Betrag aus
	 */
	public String getWaehrung() {
		return waehrung;
	}

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @param waehrung
	 *            gibt die Möglichkeit die Waehrung des Objektes Betrag zu
	 *            ändern
	 */
	public void setWaehrung(String waehrung) {
		this.waehrung = waehrung;
	}

	// TODO die arithmetischen Operationen auf den Betrag oder seperat ?
	/**
	 * @author ${Patrick Hentschel 1524045}
	 * @param a
	 *            erste Variable die addiert werden kann
	 * @param b
	 *            zweite Variable zur Addition
	 * @return gibt das Ergebnis der Addition als summe aus
	 */
	public long addiere(long a, long b) {
		this.betrag += a + b;
		return this.betrag;
	}

	/**
	 * @author ${Patrick Hentschel 1524045}
	 * @param a
	 *            der Wert a wird von
	 * @param b
	 *            dem Wert b subtrahiert
	 * @return
	 */
	public long subtrahiere(long a, long b) {
		this.betrag += a - b;
		return this.betrag;
	}

	/**
	 * @author ${Patrick Hentschel 1524045}
	 * @param a
	 *            Multiplikation mittels double Werten
	 * @param b
	 *            zweite benoetigte Variable fuer die Multiplikation
	 * @return gibt das Produkt der Multiplikation aus
	 */

	// TODO multiplziere double fehler bei der multiplikation mit betrag
	// IMMERNOCH FALSCH
	public double multipliziereDouble(Betrag a, Betrag b) {
		// Rundungsfehler
		this.betrag = betrag * ((a.getBetrag() * b.getBetrag()));
		return this.betrag;
	}

	/**
	 * @author ${Patrick Hentschel 1524045}
	 * @param a
	 *            Multiplikation mittels zweier int Werte
	 * @param b
	 *            zweites benoetigtes Objekt fuer die Multiplikation
	 * @return gibt das Produkt der Multiplikation aus
	 */
	public long multipliziereLong(Betrag a,Betrag b) {
		this.betrag = this.betrag * (a.getBetrag() * b.getBetrag());
		return this.betrag;
	}

	/**
	 * @author Dennis Szczerbinski 1521092
	 * @param prozentZahl
	 *            -
	 * @param betrag
	 * @return gibt den Prozentwert zurueck
	 */
	// TODO Eventuell muss die Waehrung bei der Ausgabe berÃ¼cksichtigt werden,
	// notfalls noch implementieren.

	public String prozent(double prozentZahl) {
		long prozent = (betrag * (long) prozentZahl) / 100;
		return +prozentZahl + " % von " + betrag + " sind " + prozent + " " + waehrung;
	}

	/**
	 * @author Dennis Szczerbinski 1521092
	 * @param promilleZahl
	 * @param betrag
	 * @return gibt den Promillewert zurueck
	 */
	// TODO Eventuell muss die Waehrung bei der Ausgabe berÃ¼cksichtigt werden,
	// notfalls noch implementieren.

	public String promille(double promilleZahl) {
		long promille = (betrag * (long) promilleZahl) / 1000;
		return +promilleZahl + " â€° von " + betrag + " sind " + promille + " " + waehrung;
	}

}
