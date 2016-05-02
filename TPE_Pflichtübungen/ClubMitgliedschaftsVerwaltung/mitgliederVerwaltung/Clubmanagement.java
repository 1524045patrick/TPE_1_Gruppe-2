package mitgliederVerwaltung;

public class Clubmanagement {

	public static void main(String[] args) {
	
		
		/**
		 * Objekterstellung
		 */
		Member a = new Member("Patrick", "Hentschel", 3);
		Member b = new Member("Mandy", "Schmidt", 2);
		Member c = new Member("Dennis", "Scezerbinski", 15);
		Member d = new Member("Fauler", "Sack", 5);

		/**
		 * HashMap
		 */
		MembershipList test = new MembershipList();
		
		/**
		 * Mitglieder hinzufügen
		 */
		test.put(a);
		test.put(b);
		test.put(c);
		test.put(d);
		
		/**
		 * foreach ausgabe von den Mitgliedern
		 */
		for (Member member : test) {
			System.out.println(member);
		}
	}
}
