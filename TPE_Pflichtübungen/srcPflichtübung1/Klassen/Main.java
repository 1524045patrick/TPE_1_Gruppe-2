package Klassen;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Betrag a = new Betrag(1.5, "Euro");
		Betrag n = new Betrag(1000, "Euro");
		Betrag m = new Betrag(0.0, "Euro");
		System.out.println(m.getVorzeichen());
		System.out.println(m.getBetrag());
		m.addiere(n);
		System.out.println(m.getBetrag());
		System.out.println(a.getBetrag());
		m.addiere(a);
		System.out.println(m.getBetrag());
		System.out.println(m.getVorzeichen());
		System.out.println(m.getWaehrung());
		System.out.println(n.prozent(18.5));
		System.out.println(n.promille(18.5));

		Scanner aW = new Scanner(System.in);
		Waehrung anfangsWaehrung = new Waehrung();
		System.out.println("Bitte umzurechnenden Betrag eingeben:");
		double temp = aW.nextDouble();
		
		
		
		
	}

}
