package CrypterPackage;

public class CrypterFactory {
	/**
	 * 
	 * @param key
	 *            der jeweilige uebergebene Schluessel fuer das passende
	 *            Verfahren
	 * @return gibt ein Objekt der CrypterSubstitution zurueck mit dem Key als
	 *         Uebergabeparameter
	 * @throws CrypterException
	 *             diese wird geworfen, sobald der der Key den Grundlegenden
	 *             Kriterien der Key-Klasse nicht entspricht, oder den Kriterien
	 *             des jeweiligen Verschluesselungsverfahren
	 */
	public static CrypterSubstitution createSUB(String key) throws CrypterException {
		return new CrypterSubstitution(key);
	}

	public static CrypterXOR createXOR(String key) throws CrypterException {
		return new CrypterXOR(key);
	}

	public static CrypterCaesar createCAE(String key) throws CrypterException {
		return new CrypterCaesar(key);
	}

}
