package CrypterPackage;

public class Main {

	public static void main(String[] args) throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("A");

		System.out.println(caesar.encrypt("ABCDEFGHIJ"));
		System.out.println(caesar.decrypt("ZABCDEFGHI"));
		System.out.println(caesar.entschluesseln('D'));
		
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.println(sub.encrypt("Test"));
		
		
	}

}
