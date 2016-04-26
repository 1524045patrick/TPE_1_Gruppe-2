package mitgliederVerwaltung;

import java.util.HashMap;
import java.util.Iterator;

@SuppressWarnings("serial")
public class MembershipList extends HashMap<Integer, Object> implements Iterable<Object> {

	/**
	 * Die Mitgliederliste, in der die Mitglieder des Clubs verwaltet werden.
	 * 
	 * @author Patrick Hentschel, 1524045
	 */

	HashMap<Integer, Object> mitgliederListe = new HashMap<Integer, Object>();

	/**
	 * Konstruktor der Klasse MembershipList fuegt der Liste ein neues Mitglied
	 * des Clubs hinzu
	 * 
	 * @author Patrick Hentschel, 1524045
	 * @param member
	 *            das uebergebene Objekt member ist ein Mitglied des Clubs mit
	 *            all seinen zugehoerigen Daten
	 */

	public MembershipList(Object member) {
		mitgliederListe.put(((Member) member).getMITGLIEDERID(), member);
	}

	public Iterator<Object> iterator(Object member) {
		while (mitgliederListe.containsValue(((Member) member).getMITGLIEDERID())) {
			mitgliederListe.getOrDefault(Member.class, Member.class);
		}
		return null;

	}

	@Override
	public String toString() {
		return "________________________________________ \n" + "ID " + " Vorname " + " Nachname " + " Mitgliedsjahre /n"
				+ "----------------------------------" ;
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
