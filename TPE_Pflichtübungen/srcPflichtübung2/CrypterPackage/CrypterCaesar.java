package CrypterPackage;

public class CrypterCaesar implements Crypter {

	String rueckgabeString = "";
	char[] keyCharArray = new char[1];

	/**
	 * Konstruktor, der zunaechst den Key in ein Grossbuchstaben umwandelt. Mit
	 * der if-Abfrage wird geprueft ob der Key auch nur einen Buchstaben
	 * enthaelt, wie fuer die Caesar-Verschluesselung notwendig
	 * 
	 * @author Patrick Hentschel
	 * @param uebergabeKey
	 *            Key zur Verschluesselung
	 * @throws CrypterException
	 */
	CrypterCaesar(String uebergabeKey) throws CrypterException {
		Key keyCEA = new Key(uebergabeKey);
		keyCharArray = keyCEA.key.toCharArray();
		if (keyCharArray.length > 1) {
			throw new CrypterException("Der Schluessel darf nur ein Zeichen enthalten !");
		}
	}

	/**
	 * Hier wird die Nachricht zunaechst auf die Gueltigkeit geprueft und
	 * anschliessend in ein Array umgewandelt, damit man jeden einzelnen
	 * Buchstaben in die Methode verschluesseln uebergeben kann.
	 * 
	 * @author Patrick Hentschel, Dennis Szczerbinski
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
			char[] messageCharArray = message.toUpperCase().toCharArray();
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
	 * @author Patrick Hentschel
	 * @param cypherTextZeichen
	 *            Char, der umgewandelt werden soll
	 * @return Gibt den umzuwandelnderChar - 'A' + 1, also 65 + 1 zurueck. So
	 *         erhaelt man bspw. fuer den Buchstaben A --> 1, dies dient zur
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
	 * @param klartextZeichen
	 *            Zahl, die als Buchstabe ausgedrueckt werden soll
	 * 
	 * @return Gibt klartextZeichen + 'A', also 65 -1 aus, gecatest zum char. So
	 *         erhaelt man bspw. fuer die Zahl 1 --> A
	 */

	@Override
	public char verschluesseln(char klartextZeichen) {
		return (char) (klartextZeichen + (keyCharArray[0] - 'A' + 1));
	}

	/**
	 * @author Patrick Hentschel, 1524045
	 * @param message
	 *            uebergibt die message, die verschluesselt werden soll und
	 *            prueft diese auf die Kriterien um die Verschluesselung
	 *            erfolgreich anzuwenden
	 * @throws CrypterException
	 *             Diese Exception wird geworfen, sollte die message nicht den
	 *             Kriterien entsprechen auf die geprueft worden ist.
	 */
	private void checkMessage(String message) throws CrypterException {
		if (message != null) {
			message = message.toUpperCase();
			if (message.matches("[A-Z]+") == false) {
				throw new CrypterException("Keine gueltige Nachricht!");
			}
		} else
			throw new CrypterException("Keine gueltige Nachricht! Nachricht darf nicht null sein!");
	}

}
