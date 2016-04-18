package CrypterPackage;

public class Main {

	public static void main(String[] args) throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.creatCAE("A");

		System.out.println(caesar.encrypt("ABCDEFGHIJ"));
		System.out.println(caesar.decrypt("ZABCDEFGHI"));
		
		CrypterSubstitution sub = CrypterFactory.creatSUB("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.println(sub.encrypt("Test"));
		

	}

}
