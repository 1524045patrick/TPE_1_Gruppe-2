package Klassen;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Betrag m = new Betrag(0.0, "Bla");
		System.out.println(m.getVorzeichen());
		m.addiere(235, 15);
		Betrag n = new Betrag(1000, "Euro");
		System.out.println(n.prozent(18.5));
		System.out.println(n.promille(18.5));

		Scanner aW = new Scanner(System.in);
		Waehrung anfangsWaehrung = new Waehrung();
		System.out.println("Bitte Anfangswährung eingeben:");
		double temp = aW.nextDouble();
		anfangsWaehrung.setAnfangsWaehrung(temp);
		
	}

}
