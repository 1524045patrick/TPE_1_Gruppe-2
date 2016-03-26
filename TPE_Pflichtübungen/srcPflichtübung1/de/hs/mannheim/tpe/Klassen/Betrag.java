package de.hs.mannheim.tpe.Klassen;

public class Betrag {

	private long betrag;
	private String waehrung;

	/**
	 * @author Patrick Hentschel, 1524045
	 * @param betrag
	 *            der Betrag wird als long Uebergabeparameter uebergeben
	 * @param waehrung
	 *            sowie die Waehrung des Betrages
	 */
	public Betrag(long betrag, String waehrung) {
		this.betrag = betrag * 100;
		this.waehrung = waehrung;
	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @param betrag
	 *            der Betrag wird als double Uebergabeparameter uebergeben und
	 *            in long umgewandelt unter beruecksichtigung von 2
	 *            Nachkommastellen
	 * @param waehrung
	 *            die Waehrung des Betrages wird hier mit uebergeben
	 */
	public Betrag(double betrag, String waehrung) {
		this.betrag = (long) (betrag * 100);
		this.waehrung = waehrung;
	}

	/**
	 * @return the betrag
	 */
	public double getBetrag() {
		return (double) betrag / 100;
	}

	/**
	 * @return the waehrung
	 */
	public String getWaehrung() {
		return waehrung;
	}

	/**
	 * @author Patrick Hentschel, 1524045 getVorzeichen() prueft ob der Betrag
	 *         groesser oder kleiner Null ist und gibt dementsprechend 1 oder -1
	 *         aus
	 */

	public int getVorzeichen() {
		if (this.betrag >= 0) {
			return 1;
		} else {
			return -1;
		}
	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @param b
	 *            uebergibt ein Objekt und addiert den Betrag des Objektes auf
	 *            das vorhandene Objekt hinzu
	 * @return gibt den Betrag als double-Wert mit 2 Nachkommastellen aus
	 */

	public double addieren(Betrag b) {
		this.betrag = this.betrag + b.betrag;
		return ((double) this.betrag / 100);

	}

	/**
	 * 
	 * @author Patrick Hentschel, 1524045
	 * @param b
	 *            uebegibt ein Objekt und subtrahiert davon den Betrag des
	 *            Objektes von dem vorhandenen Objekt
	 * @return gibt den Betrag als double-Wert mit 2 Nachkommastellen aus
	 */
	public double subtrahiere(Betrag b) {
		this.betrag = this.betrag - b.betrag;
		return ((double) this.betrag / 100);
	}

	/**
	 * 
	 * @author Patrick Hentschel, 1524045
	 * @param b
	 *            uebergibt eine double Zahl als Parameter und multipliziert
	 *            diese mit dem vorhandenem Betrag
	 * @return gibt den multiplzierten Betrag als double-Wert mit 2
	 *         Nachkommastellen aus
	 */
	public double multipliziere(double b) {
		this.betrag = (long) (this.betrag * b);
		return ((double) this.betrag / 100);
	}

	/**
	 * @author Dennis Szczerbinski 1521092
	 * @param prozentZahl
	 *            -
	 * @param betrag
	 * @return gibt den Prozentwert zurueck
	 */
	// TODO Eventuell muss die Waehrung bei der Ausgabe beruecksichtigt werden,
	// notfalls noch implementieren.

	public String prozent(double prozentZahl) {
		long prozent = (long) ((betrag * (long) prozentZahl) / 100);
		return +prozentZahl + " % von " + betrag + " sind " + prozent + " " + waehrung;
	}

	/**
	 * @author Dennis Szczerbinski 1521092
	 * @param promilleZahl
	 * @param betrag
	 * @return gibt den Promillewert zurueck
	 */
	// TODO Eventuell muss die Waehrung bei der Ausgabe ber√ºcksichtigt werden,
	// notfalls noch implementieren.

	public String promille(double promilleZahl) {
		long promille = (long) ((betrag * (long) promilleZahl) / 1000);
		return +promilleZahl + " â von " + betrag + " sind " + promille + " " + waehrung;
	}

	/**
	 * 
	 * @author Patrick Hentschel, 1524045
	 * @param b
	 *            uebergibt eine int Zahl als Parameter und multipliziert diese
	 *            mit dem vorhandenem Betrag
	 * @return gibt den multiplizierten Betrag als double-Wert mit 2
	 *         Nachkommastellen aus
	 */
	public double multiplziere(int b) {
		this.betrag = (long) (this.betrag * b);
		return ((double) this.betrag / 100);
	}

	/**
	 * 
	 * @author Patrick Hentschel, 1524045
	 * @return gibt den Wert eine ganzzahlige Zahl aus, die vor dem Komma steht
	 */
	public long getVorkomma() {
		long temp;
		temp = this.betrag / 100;
		return temp;
	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @return gibt die Nachkommastellen als integer Zahl aus zwischen 0 und 99
	 */
	public int getNachkomma() {
		double temp;
		temp = ((double) this.betrag / 100) - (this.betrag / 100);
		temp = ((double) Math.round(temp * 100)) / 100;
		temp = temp * 100;
		if(temp < 0){
			temp = temp * (-1);
		}
		return (int) temp;
	}

	/**
	 * 
	 * @author Patrick Hentschel, 1524045
	 * @return gibt den Betrag als Double Wert auf 2 Nachkommastellen genau aus
	 */
	public double getAsDouble() {
		double temp;
		temp = ((double) this.betrag / 100);
		temp = ((double) Math.round(this.betrag * 100) / 100);
		return temp / 100;
	}

}
