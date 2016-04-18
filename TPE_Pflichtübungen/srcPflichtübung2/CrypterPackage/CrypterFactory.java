package CrypterPackage;

public class CrypterFactory {

	public static CrypterSubstitution creatSUB(String key) throws CrypterException {
		return new CrypterSubstitution(key);
	}

	public static CrypterXOR creatXOR() throws CrypterException{
		return new CrypterXOR();
	}

	public static CrypterCaesar creatCAE(String key) throws CrypterException {
		return new CrypterCaesar(key);
	}

}
