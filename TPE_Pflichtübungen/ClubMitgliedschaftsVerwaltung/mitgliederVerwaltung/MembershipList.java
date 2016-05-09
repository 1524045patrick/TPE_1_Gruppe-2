package mitgliederVerwaltung;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Patrick Hentschel, 1524045
 */


@SuppressWarnings("serial")
public class MembershipList extends HashMap<Integer, Member> implements Map<Integer, Member>, Iterable<Member> {

	HashMap<Integer, Member> membershiplist;

	public MembershipList() {
		this.membershiplist = new HashMap<>();
	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @param member
	 *            bekommt ein Clubmitglied uebergeben welches der Liste
	 *            hinzugefuegt werden soll
	 * @return ruft die eigentliche put-Funktion auf um den benoetigten Key der
	 *         HashMap noch zu zuteilen
	 */
	public Member put(Member member) {
		return put(member.getMitgliederid(), member);
	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @return erzeugt den zugehoerigen Iterator aus der seperaten Klasse
	 *         MembershipListIterator
	 */
	@Override
	public Iterator<Member> iterator() {
		return new MembershipListIterator(this);
	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @return mittels einer Foreach-Schleife iterieren wir ueber alle
	 *         vorhandenen Mitglieder der Liste speichern diesen in der lokalen
	 *         Variable ausgabe und geben diese dann zurueck
	 */
	public String toString() {
		String ausgabe = "";
		for (Entry<Integer, Member> element : this.entrySet()) {
			ausgabe = ausgabe + element.getValue() + "\n";
		}
		return ausgabe;
	}

}
