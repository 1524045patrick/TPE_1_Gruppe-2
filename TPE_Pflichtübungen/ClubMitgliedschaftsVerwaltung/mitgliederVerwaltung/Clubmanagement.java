package mitgliederVerwaltung;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JComboBox.KeySelectionManager;

public class Clubmanagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Objekterstellung
		 */
		Member a = new Member("Patrick", "Hentschel", 3);
		Member b = new Member("Mandy", "Schmidt", 2);
		Member c = new Member("Dennis", "Scezerbinski", 15);
		Member d = new Member("Test", "Zwei", 1);

		/**
		 * HashMap
		 */

		HashMap<Integer, Object> test = new HashMap<Integer, Object>();

		/**
		 * Mitglieder hinzufügen
		 */
		test.put(a.getMITGLIEDERID(), a);
		test.put(b.getMITGLIEDERID(), b);
		test.put(c.getMITGLIEDERID(), c);
		test.test1(d);

		System.out.println(a.getMITGLIEDERID());

		/**
		 * Ein Set für alle Keys von test
		 */

		Set keySet = test.keySet();

		/**
		 * Ein Iterator wird benötigt, der über alle Keys von test iteriert also
		 * muss über keySet iteriert werden
		 */

		Iterator durchAlleKeys = keySet.iterator();

		/**
		 * Schleife um durch die ganze HashMap zu iterieren
		 */
		for (int i = 1; i == 1; i++) {
			System.out.println("___________________________________________________");
			System.out.println("ID         " + " Nachname  " + " Vorname " + "     Mitgliedsjahre");
			while (durchAlleKeys.hasNext()) {
				/**
				 * der return-wert von next ist Objekt deswegen der String
				 */
				int key = (int) durchAlleKeys.next();

				/**
				 * Wir kennen den Key jetzt also können wir uns den Value
				 * ausgeben lassen
				 */

				Object value = test.get(key);
				System.out.println(key + " " + value);

			}
		}

		/**
		 * Die Hashmap
		 */

		HashMap<String, Long> mitgliederListe = new HashMap<String, Long>();

		/**
		 * hinzugefügte bitches
		 */

		mitgliederListe.put("Bitch1", 1L);
		mitgliederListe.put("Bitch2", 2L);
		mitgliederListe.put("Bitch3", 3L);

		/**
		 * Alle keys von HashMap
		 */
		Set setOfKeys = mitgliederListe.keySet();

		/**
		 * Iterator erzeugen --> iteriert über alle keys von setOfKeys
		 */

		Iterator iterator = setOfKeys.iterator();

		/**
		 * Schleife um alles auszugeben bis man ans Ende kommt
		 */

		while (iterator.hasNext()) {

			/**
			 * return type von next() ist Objekt --> String downcast
			 */
			String key = (String) iterator.next();

			/**
			 * key ist jetzt bekannt --> die Möglichkeit value zu bekommen
			 */
			Long value = (Long) mitgliederListe.get(key);

			System.out.println("Key: " + key + " Value: " + value);
		}

	}
}
