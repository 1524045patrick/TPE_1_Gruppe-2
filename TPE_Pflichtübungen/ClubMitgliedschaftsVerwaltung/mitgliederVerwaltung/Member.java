package mitgliederVerwaltung;

public class Member {
	
	/**
	 * @author Patrick Hentschel, 1524045
	 * @param NEXTIDENT
	 *            wird die fortlaufende MitgliedsID
	 */
	
	private static long NEXTIDENT = 1;
	private long mitgliederId;
	private String nachname;
	private String vorname;
	private int anzahlDerMitgliedsjahre;

	
	
	/**
	 * @return gibt den Nachnamen aus
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * @param nachname
	 *            ermoeglicht die Aenderung des Nachnamens eines Mitgliedes
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	/**
	 * 
	 * @return gibt den Vornamen aus
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * 
	 * @param vorname
	 *            ermoeglicht die Aenderung des Vornamens eines Mitgliedes
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * 
	 * @return gibt die Mitgliedsjahre eines Mitgliedes aus
	 */
	public int getAnzahlDerMitgliedsjahre() {
		return anzahlDerMitgliedsjahre;
	}

	/**
	 * 
	 * @param anzahlDerMitgliedsjahre
	 *            ermoeglicht die Aenderung der Anzahl der Mitgliedsjahre
	 */
	public void setAnzahlDerMitgliedsjahre(int anzahlDerMitgliedsjahre) {
		this.anzahlDerMitgliedsjahre = anzahlDerMitgliedsjahre;
	}

	
	/**
	 * @author Patrick Hentschel, 1524045
	 * @param vorname1
	 *            uebergibt den Vornamen des Mitgliedes
	 * @param nachname2
	 *            uebergibt den Nachnamen des Mitgliedes
	 * @param anzahlMitgliedsjahre
	 *            uebergibt die Jahre, die das Mitglied schon im Club Mitglied
	 *            ist
	 */
	
	public Member(String vorname1, String nachname1, int anzahlMitgliedsjahre) {
		this.nachname = nachname1;
		this.vorname = vorname1;
		this.anzahlDerMitgliedsjahre = anzahlMitgliedsjahre;
		mitgliederId = NEXTIDENT;
		++NEXTIDENT;

	}


	

	@Override
	public String toString() {
		return "Mitglied: " + nachname + ", " + vorname + " Mitglied seit: " + anzahlDerMitgliedsjahre + " Jahren"
				+ " --MitgliedsID: " + mitgliederId;

	}

	public String compareTo(Member a, Member b) {
		if (a.equals(b)) {
			return a.toString() + " es handelt sich um das selbe Mitglied";
		} else {
			return a.toString() + " \n" + b.toString() + "\n-->Es handelt sich um verschiedene Mitglieder.";
		}

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
