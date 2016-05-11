package mitgliederVerwaltung;


/**
 * 
 * @author Patrick Hentschel, 1524045
 *
 */

public class Clubmanagement {

	public static void main(String[] args) throws InvalidSignException {

		/**
		 * Objekterstellung
		 */
		Member a = new Member(2, "Mustermann", "Heinz", 16);
		Member b = new Member(6, "Koch", "Anette", 15);
		Member c = new Member(5, "Simpson", "Bart", 9);
		Member d = new Member(3, "Simpson", "Lisa", 5);

		/**
		 * HashMap
		 */
		MembershipList alt = new MembershipList();

		/**
		 * Mitglieder hinzufuegen
		 */
		alt.put(a);
		alt.put(b);
		alt.put(c);
		alt.put(d);

		/**
		 * Ausgabe der Laenge
		 */
		System.out.println(alt.size());
		

		/**
		 * Ausgabe der Mitglieder
		 */
		System.out.println(alt);

		/**
		 * Loeschen des Mitgliedes mit der ID 2
		 */
		alt.remove(2);

		/**
		 * erstellen neuer Liste der Vereinsmitglieder
		 */
		MembershipList neu = new MembershipList();

		/**
		 * kopieren der alten Liste in die neue
		 */
		neu = (MembershipList) alt.clone();

		/**
		 * hinzufuegen des neuen Mitgliedes
		 */
		Member e = new Member(2, "Simpson", "Lisa", 5);
		neu.put(e);

		/**
		 * Pruefung der Existenz des Mitgliedes ID 2 in alter liste
		 */
		System.out.println(alt.containsKey(2));

		/**
		 * Pruefung der Existenz des Mitgliedes ID 2 in der neuen Liste mit
		 * Ausgabe der Mitgliedsdaten
		 */
		System.out.println(neu.containsKey(2));
		System.out.println();
		System.out.println(neu.get(2));
		
		
		/**
		 * Ausgabe des Mitgliedes mit der ID 5
		 */
		System.out.println(neu.get(5));
		
		/**
		 * aendern des Vornamens in Guenter
		 */
		neu.get(5).setVorname("Günter");
		
		/**
		 * Ausgabe des Mitgliedes mit der ID 5
		 */
		System.out.println(neu.get(5));
		System.out.println();
		
		/**
		 * Loeschen des Mitgliedes mit der ID 5 aus der neuen Liste
		 */
		neu.remove(5);
		
		/**
		 * Ausgabe der Mitglieder der ersten und zweiten Liste
		 */
		System.out.println(alt);
		System.out.println();
		System.out.println();
		System.out.println(neu);
		System.out.println();
		
		/**
		 * Leeren beider Listen + Ausgabe der Laenge der Listen
		 */
		alt.clear();
		neu.clear();
		
		System.out.println(alt.size());
		System.out.println(neu.size());
		
		
		
	}
}
