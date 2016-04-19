package CrypterPackage;

public class CrypterSubstitution implements Crypter {

	char[] substitution = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	char[] keyCharArray;
	char[] messageCharArray;

	String rueckgabeString = "";

	final int ALPHABETLEANGE = 26;

	// TODO Abfrage klappt nicht richtig ob nur jeder Buchstaben einmal
	// vorhanden ist.
	CrypterSubstitution(String uebergabeKey) throws CrypterException {
		checkNoSameLetters(uebergabeKey);
		if (uebergabeKey.matches("[A-Z]{26,26}") == true) {
			Key keySub = new Key(uebergabeKey);
			keyCharArray = keySub.key.toUpperCase().toCharArray();

		} else if (uebergabeKey.length() <= 26 || uebergabeKey.length() >= 26) {
			throw new CrypterException("Der Key darf nur genau 26 Buchstaben enthalten.");
		} else {

			throw new CrypterException("Nur Groﬂbuchstaben sind erlaubt, sowie keine Zahlen");
		}
	}

	/**
	 * @author Dennis Szczerbinski, Patrick Hentschel
	 * @param message
	 *            Ist die zu verschluesselnde Nachricht.
	 * @return Gibt die verschluesselte Nachricht zurueck.
	 */
	public String encrypt(String message) throws CrypterException {
		try {
			checkMessage(message);
			messageCharArray = message.toUpperCase().toCharArray();
			for (int i = 0; i < messageCharArray.length; i++) {
				char z = verschluesseln(messageCharArray[i]);
				rueckgabeString += z;
			}
			return rueckgabeString;
		} finally {
			reset();
		}
	}

	/**
	 * @author Dennis Szczerbinski
	 * @param message
	 *            Ist die zu entschluesselnde Nachricht
	 * @return Gibt die entschluesselte Nachricht zurueck.
	 */
	public String decrypt(String message) throws CrypterException {
		try {
			checkMessage(message);
			messageCharArray = message.toUpperCase().toCharArray();
			for (int i = 0; i < messageCharArray.length; i++) {
				char z = entschluesseln(messageCharArray[i]);
				rueckgabeString += z;
			}

			return rueckgabeString;
		} finally {
			reset();
		}
	}

	/**
	 * @author Dennis Szczerbinski
	 * 
	 * @Funktion Setzt den RueckgabeString zurueck. Dies ist noetig, da sonst
	 *           bei neuer ver-/entschluesselung das neue Wort an das alte
	 *           gehaengt wird.
	 */

	@Override
	public void reset() {
		rueckgabeString = "";

	}

	/**
	 * @author Dennis Szczerbinski
	 * @return Liefert das verschluesselte Zeichen zurueck
	 */
	@Override
	public char verschluesseln(char klarTextZeichen) throws CrypterException {
		for (int i = 0; i < ALPHABETLEANGE; i++) {
			if (klarTextZeichen == substitution[i]) {
				char rueckgabe;
				rueckgabe = keyCharArray[i];
				return rueckgabe;
			}
		}
		return ' ';
	}

	/**
	 * @author Dennis Szczerbinski
	 * @return Gibt das entschluesselte Zeichen zurueck.
	 */
	@Override
	public char entschluesseln(char crypterTextZeichen) throws CrypterException {
		for (int i = 0; i < ALPHABETLEANGE; i++) {
			if (crypterTextZeichen == keyCharArray[i]) {
				char rueckgabe;
				rueckgabe = substitution[i];
				return rueckgabe;
			}

		}

		return ' ';
	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @param message
	 *            uebergibt die message die verschluesselt werden soll und
	 *            prueft diese auf die Kriterien
	 * @throws CrypterException
	 *             Diese Exception wird geworfen, sollte die message nicht den
	 *             Kriterien entsprechen auf die geprueft wird
	 */
	private void checkMessage(String message) throws CrypterException {
		if (message != null) {
			message = message.toUpperCase();
			if(message == null){
				throw new CrypterException("Der Schluessel darf nicht Null sein!");
			}
			if (message.matches("[A-Z]+") == false) {
				throw new CrypterException("Der Schluessel ist ungueltig. Nur Buchstaben sind erlaubt.");
			}
		}
	}

	private static void checkNoSameLetters(String key) throws CrypterException {
		
		int j = 0;
		for (int i = 0; i < key.length(); i++) {
			j++;
			for (int g = j; g < key.length(); g++) {

				if (key.charAt(i) == key.charAt(g)) {

					throw new CrypterException("Der Key darf keine gleichen Buchstaben enthalten.");

				}
				
			} 
		}
		
	}
}
