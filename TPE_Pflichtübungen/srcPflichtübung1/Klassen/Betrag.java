package Klassen;

/**
 * 
 * @author ${Patrick Hentschel 1524045}
 * Betragsklasse verwaltet die Waehrung, sowie den Betrag, mittels
 *           folgender Funktionen.
 */
public final class Betrag {
	private long betrag;
	private String waehrung;

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (betrag ^ (betrag >>> 32));
		result = prime * result + ((waehrung == null) ? 0 : waehrung.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	//TODO Vergleich von Währungen if(){umrechnen()}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Betrag)) {
			return false;
		}
		Betrag other = (Betrag) obj;
		if (betrag != other.betrag) {
			return false;
		}
		if (waehrung == null) {
			if (other.waehrung != null) {
				return false;
			}
		} else if (!waehrung.equals(other.waehrung)) {
			return false;
		}
		return true;
	}

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
		this.betrag = (long)(betrag * 100);
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
		System.out.println("Prüfen Sie bitte Ihre Eingabe.");
		return -0;
	}


 
	/**
	 * @author ${Patrick Hentschel 1524045}
	 * @param a
	 *            erste Variable die addiert werden kann
	 * @param b
	 *            zweite Variable zur Addition
	 * @return gibt das Ergebnis der Addition als summe aus
	 */
	// TODO Beträge addieren mit Abfrage nach gleicher Währung?
	public long addiere(Betrag b) {
		this.betrag += b.betrag;
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
	public long subtrahiere(Betrag b) {
		this.betrag = this.betrag - b.betrag;
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

	// TODO multiplziere long funktioniert aber bei double gibt es einen fehler Teilung durch 100?
	public double multipliziere(Betrag b) {
		// Rundungsfehler
		this.betrag = this.betrag * b.getBetrag();
		return this.betrag;
	}

	/**
	 * @author ${Patrick Hentschel 1524045}
	 * 
	 * @param a
	 *            Multiplikation mittels zweier int Werte
	 * @param b
	 *            zweites benoetigtes Objekt fuer die Multiplikation
	 * @return gibt das Produkt der Multiplikation aus
	 */
	//public long multipliziereLong(Betrag a, Betrag b) {
	//	this.betrag = this.betrag * (a.getBetrag() * b.getBetrag());
	//	return this.betrag;
	//}

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
