package mitgliederVerwaltung;

import java.util.Iterator;

public class MembershipListIterator implements Iterator<Member> {

	int index;
	MembershipList membershipList;
	int aktuelleMitgliedernummer;

	/**
	 * @author Patrick Hentschel, 1524045
	 * @param membershipList
	 *            bekommt eine MembershipList uebergeben fuer welche er jeweils
	 *            den index sowie die aktuelle Mitgliedernummer verwaltet
	 */
	public MembershipListIterator(MembershipList membershipList) {
		index = 0;
		this.membershipList = membershipList;
		aktuelleMitgliedernummer = 0;
	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @return prueft ob in der Liste noch ein weiteres Mitglied vorhanden ist
	 */
	@Override
	public boolean hasNext() {
		if (index < membershipList.size()) {
			return true;
		}
		return false;
	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @return gibt das naechste Mitglied der Liste aus, so lange eins vorhanden ist
	 */
	@Override
	public Member next() {
		while (membershipList.get(aktuelleMitgliedernummer) == null) {
			aktuelleMitgliedernummer++;
		}
		index++;
		return membershipList.get(aktuelleMitgliedernummer++);
	}

}
