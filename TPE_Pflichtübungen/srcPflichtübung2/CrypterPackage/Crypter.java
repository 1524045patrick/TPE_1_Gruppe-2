package CrypterPackage;

/**
 * * Grundlegendes Interface, um Verschluesselung durchzufuehren. Mit Hilfe
 * dieses Interfaces kann man Nachrichten verschluesseln ueber die
 * {@link #verschluesseln(char)} Methode) und wieder entschluesseln ueber die
 * {@link #entschluesseln(char)} Methode).Der Eingabetext, der Zeichenweise
 * uebergeben wird ({@literal klarTextZeichen}) darf nur aus den Groﬂ-Buchstaben
 * A-Z bestehen. Kleinbuchstaben werden in Groﬂbuchstaben umgewandelt, alle
 * anderen Zeichen fuehren zu einer Ausnahme.Zwischen den beiden Methoden muss
 * bei gleichem Schuessel folgendes gelten:
 * {@code zeichen == decrypt(encrypt(zeichen))}.
 */
public interface Crypter {

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045} Setzt die Verschluesselung zurueck.
	 *         Diese Methode ist bei einigen Verfahren sinnvoll, bei denen eine
	 *         Position im Schlussel verwaltet wird, da diese beim Wechsel von
	 *         Ver- auf Entschl®usselung zuruckgesetzt werdem muss.
	 */

	public void reset();

	/**
	 * * Grundlegendes Interface, um Verschluesselung durchzufuehren. Mit Hilfe
	 * dieses Interfaces kann man Nachrichten verschluesseln ueber die
	 * {@link #verschluesseln(char)} Methode) und wieder entschluesseln ueber
	 * die {@link #entschluesseln(char)} Methode).Der Eingabetext, der
	 * Zeichenweise uebergeben wird ({@literal klarTextZeichen}) darf nur aus
	 * den Groﬂ-Buchstaben A-Z bestehen. Kleinbuchstaben werden in
	 * Groﬂbuchstaben umgewandelt, alle anderen Zeichen fuehren zu einer
	 * Ausnahme. Zwischen den beiden Methoden muss bei gleichem Schluessel
	 * folgendes gelten: {@code zeichen == decrypt(encrypt(zeichen))}.
	 */

	public char verschluesseln(char klartextZeichen) throws CrypterException;

	/**
	 * * Entschluesselt das gegebenen Zeichen. @param cypherTextZeichen Zeichen,
	 * das entschluesselt werden soll. 1 @return entschluesseltes
	 * Zeichen. @throws CrypterException Wird geworfen, wenn Probleme mit der
	 * Verschluesselung auftreten.
	 */
	public char entschluesseln(char cypherTextZeichen) throws CrypterException;

}
