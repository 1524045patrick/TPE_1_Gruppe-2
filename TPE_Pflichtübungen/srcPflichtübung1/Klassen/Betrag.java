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

	public Betrag(double betrag, String waehrung) throws IllegalArgumentException {
		// TODO ausgabe in hundertstel
		if(betrag != )
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
	public Betrag(long betrag, String waehrung) {

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
	 *            zweite ben�tigte Variable f�r die Multiplikation
	 * @return gibt das Produkt der Multiplikation aus
	 */
	public long multipliziere(double a, double b) {
		this.betrag = (long) (a * b);
		return this.betrag;
	}

	/**
	 * @author ${Patrick Hentschel 1524045}
	 * @param a
	 *            Multiplikation mittels zweier int Werte
	 * @param b
	 *            zweite ben�tigte Variable f�r die Multiplikation
	 * @return gibt das Produkt der Multiplikation aus
	 */
	public long multipliziere(int a, int b) {
		this.betrag = (long)(a * b);
		return this.betrag;
	}
	
	
	/**
	 * @author Dennis Szczerbinski 1521092
	 * @param prozentZahl - 
	 * @param betrag
	 * @return gibt den Prozentwert zurück
	 */
	// TODO Eventuell muss die Währung bei der Ausgabe berücksichtigt werden, notfalls noch implementieren.
	
	public static String prozent(double prozentZahl, long betrag){
		long prozent = (betrag * (long) prozentZahl) / 100;
		return +prozentZahl+ " % von "+betrag+" sind "+prozent+".";
	}
	
	/**
	 * @author Dennis Szczerbinski 1521092
	 * @param promilleZahl
	 * @param betrag
	 * @return gibt den Promillewert zurück
	 */
	// TODO Eventuell muss die Währung bei der Ausgabe berücksichtigt werden, notfalls noch implementieren.
	
	 public static String promille(double promilleZahl, long betrag){
		 long promille = (betrag * (long) promilleZahl) / 1000 ;
		 return +promilleZahl+ " ‰ von "+betrag+" sind "+promille+".";
	 }

	 
}
