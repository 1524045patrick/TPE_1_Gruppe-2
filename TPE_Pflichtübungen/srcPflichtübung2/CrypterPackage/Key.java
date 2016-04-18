package CrypterPackage;

public class Key {
	String key;

	/**
	 * Konstrukter der Klasse Key. Der uebergebene Schluessel wird wird in
	 * Großbuchstaben umgewandelt, da dies eine Vorgabe war. Ist der String
	 * leer, wird kommt es zu einer Exception, da ohne Schluessel keine
	 * Verschluesselung stattfindet. Mit der zweiten If-Abfrage wird geschaut ob
	 * andere Buchstaben als A-Z im Schluessel vorhanden sind, zum Beispiel
	 * Sonderzeichen. Besteht der Schluessel aus Großbuchstaben und enthaelt
	 * weder Sonderzeichen noch Zahlen, wird er der Variable key zugewiesen.
	 * 
	 * @param a
	 *            Key zur Verschluesselung
	 * @throws CrypterException
	 */
	public Key(String a) throws CrypterException {
		key = a.toUpperCase();
		if (key != "") {
			if (key.matches("[A-Z]+") == false) {
				throw new CrypterException("Kein g�ltiger Schl�ssel!");
			}

		} else {
			throw new CrypterException("Kein g�ltiger Schl�ssel! Schl�ssel darf nicht null sein!");
		}
	}
	
	public String toString(){
		return key;
	}

}
