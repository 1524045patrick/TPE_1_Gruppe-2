package CrypterPackage;

public class CrypterCaesar implements Crypter {

	String rueckgabeString = "";
	char[] keyCharArray = new char[1];

	CrypterCaesar(String uebergabeKey) throws CrypterException {
		uebergabeKey = uebergabeKey.toUpperCase();
		checkKey(uebergabeKey);
		Key keyCEA = new Key(uebergabeKey);
		keyCharArray = keyCEA.key.toCharArray();
	}

	public String encrypt(String message) throws CrypterException {
		try {
			checkMessage(message);
			char[] messageCharArray = message.toUpperCase().toCharArray();
			for (int i = 0; i < messageCharArray.length; i++) {
				char z = verschluesseln(messageCharArray[i]);
				if (z > 90) {
					z = (char) (z - 26);
				}
				rueckgabeString += z;
			}

			return rueckgabeString;
		} finally {
			reset();
		}
	}

	public String decrypt(String message) throws CrypterException {
		try {
			char[] messageCharArray = message.toCharArray();
			for (int i = 0; i < messageCharArray.length; i++) {
				char z = entschluesseln(messageCharArray[i]);
				if (z < 65) {
					z = (char) (z + 26);
				}
				rueckgabeString += z;
			}

			return rueckgabeString;
		} finally {
			reset();
		}
	}

	/**
	 * Methode die einen char in seinen entsprechenden int-Wert umwandelt
	 * 
	 * @author Patrick Hentschel, 1524045
	 * @param cypherTextZeichen
	 *            Char, der umgewandelt werden soll
	 * @return Gibt den umzuwandelnderChar - 'A' , also 65 + 1 zur�ck. So erh�lt
	 *         man bspw. f�r den Buchstaben A --> 1, dies dient zur
	 *         Vereinfachung beim rechnen
	 */
	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		return (char) (cypherTextZeichen - (keyCharArray[0] - 'A'));

	}

	@Override
	public void reset() {
		rueckgabeString = "";

	}

	/**
	 * Methode, um eine Zahl dem entsprechenden Buchstaben zuzuordnen
	 *
	 * @param zahlZuBuchstabe
	 *            Zahl, die als Buchstabe ausgedr�ckt werden soll
	 * 
	 * @return Gibt zahlZuBuchstabe + 'A', also 65 -1 aus, gecatest zum char. So
	 *         erh�lt man bspw. f�r die Zahl 1 --> A
	 */
	// TODO Zahl von 1-26 oder 65<?
	@Override
	public char verschluesseln(char klartextZeichen) {
		return (char) (klartextZeichen + (keyCharArray[0] - 'A'));
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
			if (message.matches("[A-Z]+") == false) {
				throw new CrypterException("Kein g�ltiger Schl�ssel!");
			}
		} else
			throw new CrypterException("Keine g�ltige Nachricht! Nachricht darf nicht null sein!");

	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @param key
	 *            uebergibt den key der zur Verschluesselung dient und prueft
	 *            diesen auf seine Gueltigkeit
	 * @throws CrypterException
	 *             wirft diese Exception sollte der key nicht gueltig sein, mit
	 *             einer Fehlerbeschreibung
	 */
	private void checkKey(String key) throws CrypterException {

		if (key != null) {

			if (key.matches("[A-Z]{1}") == false) {
				throw new CrypterException(
						"Kein g�ltiger Schl�ssel! Schl�ssel darf nur einen Gro�buchstaben enthalten!");
			}
		} else {
			throw new CrypterException("Kein g�ltiger Schl�ssel! Schl�ssel darf nicht null sein!");
		}
	}

}
