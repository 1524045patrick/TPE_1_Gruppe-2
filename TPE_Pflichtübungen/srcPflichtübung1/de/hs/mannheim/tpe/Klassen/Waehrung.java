package de.hs.mannheim.tpe.Klassen;

public class Waehrung extends Waehrungen {
	

	private final double kurs;
	private final String name;
	private final String kuerzel;

	
	/**
	 * @author Patrick Hentschel, 1524045 (Eclipse generiert)
	 * @return the kurs
	 */
	public double getKurs() {
		return kurs;
	}

	/**
	 * @author Patrick Hentschel, 1524045 (Eclipse generiert)
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @author Patrick Hentschel, 1524045 (Eclipse generiert)
	 * @return the kuerzel
	 */
	public String getKuerzel() {
		return kuerzel;
	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @param name
	 *            enth�lt den Namen der Waehrung
	 * @param kuerzel
	 *            enth�lt das Kuerzel der Waehrung
	 * @param kurs
	 *            enth�lt den Wechselkurs mit 4 Nachkommastellen
	 */
	public Waehrung(String name, String kuerzel, double kurs) {

		this.name = name;
		this.kuerzel = kuerzel;
		this.kurs = kurs;

	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @param this.name
	 *            gibt den Namen der Waehrung aus
	 * @param this.kuerzel
	 *            gibt das Kuerzel der Waehrung aus
	 * @param this.kurs
	 *            gibt den Wechselkurs
	 */
	public String toString() {
		return this.name + " 1 $ = " + this.kurs;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kuerzel == null) ? 0 : kuerzel.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	/**
	 * @author Patrick Hentschel, 1524045 (Eclipse generiert)
	 * @equals(Object obj) vergleicht zwei Objekte auf Gleichheit
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Waehrung)) {
			return false;
		}
		Waehrung other = (Waehrung) obj;
		if (kuerzel == null) {
			if (other.kuerzel != null) {
				return false;
			}
		} else if (!kuerzel.equals(other.kuerzel)) {
			return false;
		}
		if (Double.doubleToLongBits(kurs) != Double.doubleToLongBits(other.kurs)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @param betrag
	 *            enth�lt den Betrag der in Dollar umgerechnet werden soll als
	 *            long
	 * @param waehrungAktuell
	 *            enth�lt die aktuelle Waehrung die in Dollar umgerechnet werden
	 *            soll
	 */
	public long umrechnen(long betrag, String waehrungAktuell) {
		if (waehrungAktuell.equals("Euro")) {
			betrag = (long) (betrag * 1.2690);
			return betrag;
		} else if (waehrungAktuell.equals("Rubel")) {
			betrag = (long) (betrag * 0.0255);
			return betrag;
		} else if (waehrungAktuell.equals("Yen")) {
			betrag = (long) (betrag * 0.0091);
			return betrag;
		} else if (waehrungAktuell.equals("Schweizer Franken")) {
			betrag = (long) (betrag * 1.0509);
			return betrag;
		} else if (waehrungAktuell.equals("Dollar")) {
			return betrag;
		}
		return betrag;
	}

}
