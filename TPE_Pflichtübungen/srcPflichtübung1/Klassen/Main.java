package Klassen;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Betrag a = new Betrag(1, "Euro");
		Betrag n = new Betrag(1000, "Euro");
		Betrag m = new Betrag(0.0, "Euro");
		Konto konto1 = new Konto("Test Testington", "US-Dollar");
		
		konto1.buche(10);
		konto1.buche(-100);
		konto1.buche(50);
		konto1.saldo();
		System.out.println(konto1.toString());
		
		System.out.println("Testende - Konto");
		
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
