package CrypterPackage;

public class CrypterCaesar implements Crypter {

	/**
	 * Konstruktor der Klasse
	 */
	CrypterCaesar() {
		super();
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		// TODO entschlueseln fuer was?
		return 0;
	}

	@Override
	public void reset() {
		// TODO reset?

	}

	/**
	 * Methode, um eine Zahl dem entsprechenden Buchstaben zuzuordnen
	 *
	 * @param zahlZuBuchstabe
	 *            Zahl, die als Buchstabe ausgedrückt werden soll
	 * 
	 * @return Gibt zahlZuBuchstabe + 'A', also 65 -1 aus, gecatest zum char. So
	 *         erhält man bspw. für die Zahl 1 --> A
	 */
	// TODO Zahl von 1-26 oder 65<?
	@Override
	public char verschluesseln(char klartextZeichen) {
		return (char) (klartextZeichen + 'A' - 1);
	}

	/**
	 * Methode die einen char in seinen entsprechenden int-Wert umwandelt
	 * 
	 * @author Patrick Hentschel, 1524045
	 * @param cypherTextZeichen
	 *            Char, der umgewandelt werden soll
	 * @return Gibt den umzuwandelnderChar - 'A' , also 65 + 1 zurück. So erhält
	 *         man bspw. für den Buchstaben A --> 1, dies dient zur
	 *         Vereinfachung beim rechnen
	 */

	public int decode(char cypherTextZeichen) {
		return  cypherTextZeichen - 'A' + 1;
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
			if (message.matches("[A-Z]+") == false) {
				throw new CrypterException("Kein gültiger Schlüssel! Schlüssel darf nur Großbuchstaben enthalten!");
			}
		} else
			throw new CrypterException("Keine gültige Nachricht! Nachricht darf nicht null sein!");

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
						"Kein gültiger Schlüssel! Schlüssel darf nur einen Großbuchstaben enthalten!");
			}
		} else {
			throw new CrypterException("Kein gültiger Schlüssel! Schlüssel darf nicht null sein!");
		}
	}

	/**
	 * Methode, um einen Text entsprechend des Caesar-Schiffre verschlüsselt
	 * @author Patrick Hentschel, 1524045
	 * @return Gibt die verschlüsselte Nachricht in einem String aus
	 */
	public String verschluesselung(String key, String message) throws CrypterException {
		checkKey(key);
		checkMessage(message);

		int verschiebung = decode(key.charAt(0));
		char[] messageArray = message.toCharArray();
		char[] verschluesseltesArray = new char[message.length()];

		char verschluesselteZahl;

		for (int i = 0; i < messageArray.length; i++) {

			verschluesselteZahl = (char) (messageArray[i] + verschiebung);
			if (verschluesselteZahl > 'Z') {
				verschluesselteZahl -= 26;
			}
			verschluesseltesArray[i] = verschluesselteZahl;
		}
		return new String(verschluesseltesArray);
	}

}
