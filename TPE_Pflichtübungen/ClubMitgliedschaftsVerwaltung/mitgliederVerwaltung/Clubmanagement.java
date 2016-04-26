package mitgliederVerwaltung;

import java.util.HashMap;

public class Clubmanagement {

	public static void main(String[] args) {
		//Member Test
		Member bitch = new Member("Mandy", "Bitch", 1);
		Member bitch2 = new Member("Mandy", "Bitch", 2);
		Member alt = new Member("Dennis", "Szirgendwas", 2);
		
		System.out.println(alt.toString());
		System.out.println(bitch2.compareTo(bitch2, bitch));
		
		
		/**
		 * MembershipList
		 */
		HashMap<Integer, Object> test = new HashMap<>();
		test.put(bitch.getMITGLIEDERID(), bitch);
		test.put(bitch2.getMITGLIEDERID(), bitch2);
		
		System.out.println(test.toString());
	}

}
