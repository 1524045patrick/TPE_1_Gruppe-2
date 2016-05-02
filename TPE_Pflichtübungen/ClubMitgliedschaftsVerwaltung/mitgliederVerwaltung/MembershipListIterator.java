package mitgliederVerwaltung;

import java.util.Iterator;

public class MembershipListIterator implements Iterator<Member> {

	int index;
	MembershipList membershipList;
	int aktuelleMitgliedernummer;
	
	public MembershipListIterator(MembershipList membershipList) {
		index = 0;
		this.membershipList = membershipList;
		aktuelleMitgliedernummer = 0;
	}
	
	@Override
	public boolean hasNext() {
		if (index < membershipList.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Member next() {
		//ENTRYSET mögliche perfomanceverbesserung
		while (membershipList.get(aktuelleMitgliedernummer) == null) {
			aktuelleMitgliedernummer++;
		}
		index++;
		return membershipList.get(aktuelleMitgliedernummer++);
	}

}
