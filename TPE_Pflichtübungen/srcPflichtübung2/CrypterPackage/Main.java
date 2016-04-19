package CrypterPackage;

public class Main {

	public static void main(String[] args) throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("A");

		System.out.println(caesar.encrypt("ABCDEFGHIJ"));
		System.out.println(caesar.decrypt("BCDEFGHIJK"));
		System.out.println(caesar.entschluesseln('D'));

		CrypterSubstitution sub = CrypterFactory.createSUB("AAADEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.println(sub.encrypt("TEST"));
		
		CrypterSubstitution sub2 = CrypterFactory.createSUB("MNBVCXYLKJHGFDSAPOIUZTREWQ");
		System.out.println(sub2.encrypt(null));
		
	
		
	}

}
