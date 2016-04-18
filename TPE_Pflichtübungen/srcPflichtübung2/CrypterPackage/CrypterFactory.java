package CrypterPackage;

public class CrypterFactory {

	public static CrypterSubstitution createSUB(String key) throws CrypterException {
		return new CrypterSubstitution(key);
	}

	public static CrypterXOR createXOR() throws CrypterException{
		return new CrypterXOR();
	}

	public static CrypterCaesar createCAE(String key) throws CrypterException {
		return new CrypterCaesar(key);
	}

}
