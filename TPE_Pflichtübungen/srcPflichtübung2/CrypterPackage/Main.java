package CrypterPackage;

public class Main {

	public static void main(String[] args) throws CrypterException {
		
		/**
		 * erzeugt einen Schluessel mit dem die Verschluesselung arbeiten wird
		 */
		
		CrypterCaesar caesar = CrypterFactory.createCAE("A");

		/**
		 * verschluesselt die uebergebene Nachricht mit dem erzeugten Schluessel
		 */
		System.out.println(caesar.encrypt("ABCDEFGHIJ"));
		/**
		 * entschluesselt die uebergebene Nachricht mit dem erzeugten Schluessel
		 */
		System.out.println(caesar.decrypt("BCDEFGHIJK"));
		
		/**
		 * verschluesselt einen einzelnen char mit dem erzeugten Schluessel
		 */
		System.out.println(caesar.entschluesseln('D'));
		/**
		 * entschluesselt einen einzelnen char mit dem erzeugten Schluessel
		 */
		System.out.println(caesar.verschluesseln('C'));

		
	
		
		CrypterSubstitution sub2 = CrypterFactory.createSUB("MNBVCXYLKJHGFDSAPOIUZTREWQ");
		System.out.println(sub2.encrypt("Hallo"));
		System.out.println(sub2.decrypt("LMGGS"));
		
	
		
	}

}
