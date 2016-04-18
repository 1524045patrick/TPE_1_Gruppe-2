package CrypterPackage;

public class CrypterFactory {

	public static CrypterSubstitution createSUB(String key) throws CrypterException {
		return new CrypterSubstitution(key);
	}

	public static CrypterXOR createXOR(String key) throws CrypterException{
		return new CrypterXOR(key);
	}

	public static CrypterCaesar createCAE(String key) throws CrypterException {
		return new CrypterCaesar(key);
	}

}
