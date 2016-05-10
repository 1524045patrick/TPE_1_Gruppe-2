package mitgliederVerwaltung;

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
	private String regExNamen = "[A-Za-zäüöÄÜÖß]+";

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
	 *             Exception die geworfen wird sollte ein Name nicht gueltig
	 *             sein
	 */
	public Member(Integer mitgliederid, String nachname, String vorname, int anzahlMitgliedsjahre)
			throws InvalidSignException {

		if (nachname.matches(regExNamen) == true) {
			this.nachname = nachname;
		} else {
			throw new InvalidSignException("Zahlen sind im Namen nicht erlaubt");
		}

		if (vorname.matches(regExNamen) == true) {
			this.vorname = vorname;
		} else {
			throw new InvalidSignException("Zahlen sind im Namen nicht erlaubt");
		}
		if(anzahlMitgliedsjahre >= 0) {
		this.anzahlDerMitgliedsjahre = anzahlMitgliedsjahre;
		} else {
			throw new InvalidSignException("Die Jahre dürfen nicht unter 0 sein.");
		}
		if(mitgliederid >= 0) {
		this.mitgliederid = mitgliederid;
		} else {
			throw new InvalidSignException("Die MitgliederID muss aus positiven Zahlen bestehen.");
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
	 * @throws InvalidSignException
	 *             wirft eine Exception falls der Name nicht gueltig ist
	 */
	public void setNachname(String nachname) throws InvalidSignException {
		if (nachname.matches(regExNamen) == true) {
			this.nachname = nachname;
		} else {
			throw new InvalidSignException("Zahlen sind im Namen nicht erlaubt");
		}
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
	 * @throws InvalidSignException
	 *             wirft eine Exception falls der Name nicht gueltig ist
	 */
	public void setVorname(String vorname) throws InvalidSignException {
		if (vorname.matches(regExNamen) == true) {
			this.vorname = vorname;
		} else {
			throw new InvalidSignException("Zahlen sind im Namen nicht erlaubt");
		}
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
	 * @throws InvalidSignException wirft eine Exception, falls das Mitglied unter 0 jahre Mitglied sein soll
	 */
	public void setAnzahlDerMitgliedsjahre(int anzahlDerMitgliedsjahre) throws InvalidSignException {
		if(anzahlDerMitgliedsjahre >= 0) {
			this.anzahlDerMitgliedsjahre = anzahlDerMitgliedsjahre;
		} else {
			throw new InvalidSignException("Die Anzahl der Mitgliedsjahre muss größer 0 sein.");
		}
		
	}

	/**
	 * Muss ueberschrieben werden um die Referenz der Objekte zu ignorieren und
	 * nur auf die Parametergleichheit zu pruefen
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (anzahlDerMitgliedsjahre != other.anzahlDerMitgliedsjahre)
			return false;
		if (mitgliederid == null) {
			if (other.mitgliederid != null)
				return false;
		} else if (!mitgliederid.equals(other.mitgliederid))
			return false;
		if (nachname == null) {
			if (other.nachname != null)
				return false;
		} else if (!nachname.equals(other.nachname))
			return false;
		if (vorname == null) {
			if (other.vorname != null)
				return false;
		} else if (!vorname.equals(other.vorname))
			return false;
		return true;
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
	public static boolean compareTo(Member a, Member b) {

		if (a.equals(b) == true) {
			return true;
		} else {
			return false;
		}

	}

}
