package Klassen;

/**
 * 
 * @author ${Patrick Hentschel 1524045}
 * @category Betragsklasse verwaltet die Währung, sowie den Kontostand.
 */
public class Betrag {
	private long betrag;
	private String waehrung;

	/**
	 * Der Konstruktor der Klasse Betrag
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @param betrag
	 *            gibt den Betrag des Kontostandes an
	 * @param waehrung
	 *            gibt die Waehrung des Betrags an
	 */
	Betrag(double betrag, String waehrung) {

		this.betrag = (long) betrag;
		this.waehrung = waehrung;

	}

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045} die Methode getVorzeichen gibt aus
	 *         ob der Kontostand positiv oder negativ ist mittels 1 oder -1
	 */
	public int getVorzeichen() {
		// TODO implementieren getVorzeichen
		if (betrag > 1) {
			System.out.println("1");
			return 1;
		} else if (betrag == 0) {
			System.out.println("0");
			return 0;
		} else if (betrag < 1) {
			System.out.println("-1");
			return -1;
		} else if (betrag == 1) {
			System.out.println("1");
			return 1;

		}

		return -0;

	}

}
