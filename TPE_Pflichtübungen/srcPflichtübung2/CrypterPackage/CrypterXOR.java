package CrypterPackage;

public class CrypterXOR implements Crypter {

	char[] alphabetPlus = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '@', '[', '/', ']', '^' };

	char[] messageCharArray;
	char[] keyCharArray;
	final int EINS = 1;

	String rueckgabeString = "";

	CrypterXOR(String uebergabeKey) throws CrypterException {
		Key keyXOR = new Key(uebergabeKey);
		keyCharArray = keyXOR.key.toCharArray();
	}

	public String encrypt(String message) throws CrypterException {
		try {
			checkMessage(message);
			messageCharArray = message.toUpperCase().toCharArray();
			for (int i = 0; i < messageCharArray.length; i++) {
				char z = verschluesseln(messageCharArray[i]);
				rueckgabeString += z;
			}
			return rueckgabeString;
		} finally {
			reset();
		}
	}

	@Override
	public void reset() {
		rueckgabeString = "";
	}

	
	
	@Override
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		int k = 0;
		for (int i = 0; i < alphabetPlus.length; i++) {
			if (klartextZeichen == alphabetPlus[i]) { 
				for (int j = 0; j < alphabetPlus.length; j++) { 
					if (keyCharArray[j] == alphabetPlus[k]) {
						int x = ((i + EINS) ^ (k + EINS));
						char z = alphabetPlus[x]; 
						return z;
					}
					k++;
				}
			}
		}
		return ' ';
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		// TODO Auto-generated method stub
		return 0;
	}

	private void checkMessage(String message) throws CrypterException {
		if (message != null) {
			message = message.toUpperCase();
			if (message.matches("[A-Z]+") == false) {
				throw new CrypterException("Keine gueltige Nachricht!");
			}
		} else
			throw new CrypterException("Keine g�ltige Nachricht! Nachricht darf nicht null sein!");

	}

}
