package Klassen;

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

	public void setAnfangsWaehrung(double anfangsWaehrung) {
		this.anfangsWaehrung = anfangsWaehrung;

	}

	public double getAnfangsWaehrung() {
		return anfangsWaehrung;

	}

	public void setZielWaehrung(long zielWaehrung) {
		this.zielWaehrung = zielWaehrung;
	}

	public long getZielWaehrung() {
		return zielWaehrung;
	}

	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}

	public double getBetrag() {
		return betrag;
	}

	public String getName() {
		return name;

	}

	public String getKuerzel() {
		return kuerzel;

	}

	public long getKurs() {
		return kurs;

	}

	public void umrechnen(double betrag, long zielWaehrung) {
		betrag = anfangsWaehrung * kursDollar;
		zielWaehrung = (long) (betrag * kurs);
		System.out.println(zielWaehrung);

	}

}
