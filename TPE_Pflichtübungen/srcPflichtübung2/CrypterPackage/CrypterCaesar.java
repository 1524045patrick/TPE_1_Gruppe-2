package CrypterPackage;

public class CrypterCaesar implements Crypter {

	String rueckgabeString = "";
	char[] keyCharArray = new char[1];

	/**
	 * Konstruktor, der zunaechst den Key in ein Großbuchstaben umwandelt. Mit
	 * checkKey() wird auf die Gueltigkeit geprueft, da er nur ein Zeichen
	 * enthalten darf.
	 * 
	 * @author Dennis Szczerbinski
	 * @param uebergabeKey
	 *            Key zur Verschluesselung
	 * @throws CrypterException
	 */
	CrypterCaesar(String uebergabeKey) throws CrypterException {
		Key keyCEA = new Key(uebergabeKey);
		keyCharArray = keyCEA.key.toCharArray();
	}

	/**
	 * Hier wird die Nachricht zunaechst auf die Gueltigkeit geprueft und
	 * anschließend in ein Array umgewandelt, damit man jeden einzelnen
	 * Buchstaben in die Methode verschluesseln uebergeben kann.
	 * 
	 * @param message
	 *            Nachricht die Verschluesselt werden muss
	 * @return rueckgabeString Verschluesselter Satz
	 * @throws CrypterException
	 */
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
			/**
			 * Resetet den String wieder, weil sonst beim erneuten verwenden des
			 * Parameters der alte Wert mit ausgegeben wird.
			 */
			reset();
		}
	}

	/**
	 * Entschluesselung der Nachricht. Funktioniert genau wie beim
	 * Verschluesseln, nur mit der verschluesselten Nachricht.
	 * 
	 * @author Dennis Szczerbinski
	 * @param message
	 *            Zu entschluesselnde Nachricht
	 * @return rueckgabeString Entschluesselter Satz
	 * @throws CrypterException
	 */
	public String decrypt(String message) throws CrypterException {
		try {
			checkMessage(message);
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
	 * @author Patrick Hentschel, Dennis Szczerbinski
	 * @param cypherTextZeichen
	 *            Char, der umgewandelt werden soll
	 * @return Gibt den umzuwandelnderChar - 'A' , also 65 + 1 zur�ck. So erh�lt
	 *         man bspw. f�r den Buchstaben A --> 1, dies dient zur
	 *         Vereinfachung beim rechnen
	 */
	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		return (char) (cypherTextZeichen - (keyCharArray[0] - 'A' + 1));

	}

	/**
	 * Hier wird der Rueckgabe String wieder geleert. Dies ist notig da sonst
	 * bei mehrmaliger benutzung der Ver-/Entschluesseln Methode die voherige
	 * Nachricht bebehaelt.
	 * 
	 */
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
		return (char) (klartextZeichen + (keyCharArray[0] - 'A' + 1));
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

}
