package Klassen;

/**
 * 
 * @author ${Patrick Hentschel 1524045}
 * @category Betragsklasse verwaltet die W�hrung, sowie den Kontostand.
 */
public final class Betrag {
	private long betrag;
	private String waehrung;

	/**
	 * Der Konstruktor der Klasse Betrag
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @param betrag
	 *            �bergibt den Betrag des Kontostandes als double Wert
	 * @param waehrung
	 *            �bergibt die Waehrung des Betrages
	 */

	Betrag(double betrag, String waehrung) {
		// TODO ausgabe in hundertstel
		this.betrag = (long) betrag;
		this.waehrung = waehrung;

	}

	/**
	 * @author ${Patrick Hentschel 1524045}
	 * @param betrag
	 *            �bergibt den Betrag des Kontostandes als long Wert
	 * @param waehrung
	 *            �bergibt die Waehrung des Betrages
	 * 
	 */
	Betrag(long betrag, String waehrung) {

		this.betrag = betrag;
		this.waehrung = waehrung;

	}

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045} die Methode getVorzeichen gibt aus
	 *         ob der Kontostand positiv oder negativ ist mittels 1 oder -1
	 *         sollte der kontostand genau 0 sein so wird auch eine 0
	 *         zur�ckgegeben
	 */
	public int getVorzeichen() {
		// TODO keine return r�ckgabe?
		if (betrag >= 1) {
			return 1;
		} else if (betrag == 0) {
			return 0;
		} else if (betrag < 1) {
			return -1;
		}

		return -0;

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
		long summe = a + b;
		return summe;
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
		long summe = a - b;
		return summe;
	}

	/**
	 * @author ${Patrick Hentschel 1524045}
	 * @param a
	 *            Multiplikation mittels double Werten
	 * @param b
	 *            zweite ben�tigte Variable f�r die Multiplikation
	 * @return gibt das Produkt der Multiplikation aus
	 */
	public double multipliziere(double a, double b) {
		double produkt = (a * b);
		return produkt;
	}

	/**
	 * @author ${Patrick Hentschel 1524045}
	 * @param a
	 *            Multiplikation mittels zweier int Werte
	 * @param b
	 *            zweite ben�tigte Variable f�r die Multiplikation
	 * @return gibt das Produkt der Multiplikation aus
	 */
	public int multipliziere(int a, int b) {
		int produkt = (a * b);
		return produkt;
	}
}
