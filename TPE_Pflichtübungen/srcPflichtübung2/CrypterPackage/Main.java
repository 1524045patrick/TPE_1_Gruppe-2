package CrypterPackage;

public class Main {

	public static void main(String[] args) throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.creatCAE("Z");

		System.out.println(caesar.encrypt("ABCDEFGHIJ"));
		System.out.println(caesar.decrypt("ZABCDEFGHI"));
		

	}

}
