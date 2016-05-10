package mitgliederVerwaltung;

import java.util.regex.*;

/**
 * 
 * @author Patrick Hentschel, 1524045
 *
 */

public class Member {

	private Integer mitgliederid;
	private String nachname;
	private String vorname;
	private int anzahlDerMitgliedsjahre;

	/**
	 * @author Patrick Hentschel, 1524045
	 * @param vorname
	 *            uebergibt den Vornamen des Mitgliedes
	 * @param nachname
	 *            uebergibt den Nachnamen des Mitgliedes
	 * @param anzahlMitgliedsjahre
	 *            uebergibt die Jahre, die das Mitglied schon im Club Mitglied
	 *            ist
	 * @param mitgliederid
	 *            uebergibt die MitgliedsID des Mitgliedes
	 * @throws InvalidSignException
	 *             Exception die geworfen wird sollte ein Name eine Zahl
	 *             enthalten
	 */
	public Member(Integer mitgliederid, String nachname, String vorname, int anzahlMitgliedsjahre)
			throws InvalidSignException {

		if (nachname.matches("[A-Za-z]+") == true) {
			this.nachname = nachname;
			if (vorname.matches("[A-Za-z]+") == true) {
				this.vorname = vorname;
				this.anzahlDerMitgliedsjahre = anzahlMitgliedsjahre;
				this.mitgliederid = mitgliederid;
			}
		} else {
			throw new InvalidSignException();
		}
	}

	/**
	 * @return gibt die MitgliederID aus
	 */

	public Integer getMitgliederid() {
		return mitgliederid;
	}

	/**
	 * @return gibt den Nachnamen aus
	 */
	public String getNachname() {
		return this.nachname;
	}

	/**
	 * @param nachname
	 *            ermoeglicht die Aenderung des Nachnamens eines Mitgliedes
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	/**
	 * @return gibt den Vornamen aus
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * @param vorname
	 *            ermoeglicht die Aenderung des Vornamens eines Mitgliedes
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * @return gibt die Mitgliedsjahre eines Mitgliedes aus
	 */
	public int getAnzahlDerMitgliedsjahre() {
		return this.anzahlDerMitgliedsjahre;
	}

	/**
	 * @param anzahlDerMitgliedsjahre
	 *            ermoeglicht die Aenderung der Anzahl der Mitgliedsjahre
	 */
	public void setAnzahlDerMitgliedsjahre(int anzahlDerMitgliedsjahre) {
		this.anzahlDerMitgliedsjahre = anzahlDerMitgliedsjahre;
	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @return Gibt ein Mitglied mit allen zugehoerigen Daten aus
	 */
	@Override
	public String toString() {
		return "MitgliederID: " + this.mitgliederid + " |Vorname: " + this.vorname + "|--|Nachname: " + this.nachname
				+ "| Mitglied seit: " + this.getAnzahlDerMitgliedsjahre() + " Jahren" + "|\n";

	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @param a
	 *            Uebergabe des ersten Mitgliedes zum Vergleich
	 * @param b
	 *            Uebergabe des zweiten Mitgliedes zum Vergleich
	 * @return So lange nicht die ID gleich ist handelt es sich grundsaetzlich
	 *         um unterschiedliche Mitglieder, da gleiche Namen etc. durchaus
	 *         moeglich sind. Jedoch nicht eine gleiche ID
	 */
	public boolean compareTo(Member a, Member b) {
		if (a.getVorname().equals(b.getVorname())) {
			if (a.getNachname().equals(b.getNachname())) {
				if (a.getAnzahlDerMitgliedsjahre() == b.getAnzahlDerMitgliedsjahre()) {
					if (a.getMitgliederid() == b.getMitgliederid()) {
						return true;
					}
				}
			}
		}
		return false;

	}

}
