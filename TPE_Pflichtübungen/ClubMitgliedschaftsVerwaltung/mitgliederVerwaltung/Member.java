package mitgliederVerwaltung;

public class Member {


    private static Integer NEXTIDENT = 1;
    private Integer MITGLIEDERID;
    private String nachname;
    private String vorname;
    private int anzahlDerMitgliedsjahre;

    /**
     * @param vorname1             uebergibt den Vornamen des Mitgliedes
     * @param nachname1            uebergibt den Nachnamen des Mitgliedes
     * @param anzahlMitgliedsjahre uebergibt die Jahre, die das Mitglied schon im Club Mitglied
     *                             ist
     */

    public Member(String vorname1, String nachname1, int anzahlMitgliedsjahre) {
        this.nachname = nachname1;
        this.vorname = vorname1;
        this.anzahlDerMitgliedsjahre = anzahlMitgliedsjahre;
        MITGLIEDERID = NEXTIDENT;
        ++NEXTIDENT;

    }

    /**
     * @return gibt die MitgliederID aus
     */

    public Integer getMITGLIEDERID() {
        return MITGLIEDERID;
    }

    /**
     * @return gibt den Nachnamen aus
     */
    public String getNachname() {
        return this.nachname;
    }

    /**
     * @param nachname ermoeglicht die Aenderung des Nachnamens eines Mitgliedes
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
     * @param vorname ermoeglicht die Aenderung des Vornamens eines Mitgliedes
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
     * @param anzahlDerMitgliedsjahre ermoeglicht die Aenderung der Anzahl der Mitgliedsjahre
     */
    public void setAnzahlDerMitgliedsjahre(int anzahlDerMitgliedsjahre) {
        this.anzahlDerMitgliedsjahre = anzahlDerMitgliedsjahre;
    }

    @Override
    public String toString() {
        return "          " + nachname + "  " + vorname + "            " + MITGLIEDERID;

    }

    public String compareTo(Member a, Member b) {
        if (a.equals(b)) {
            return a.toString() + " es handelt sich um das selbe Mitglied";
        } else {
            return a.toString() + " \n" + b.toString() + "\n-->Es handelt sich um verschiedene Mitglieder.";
        }

    }

}
