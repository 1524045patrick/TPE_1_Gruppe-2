package de.hs.mannheim.tpe.Klassen;

import java.util.ArrayList;

/**
 * 
 * @author Dennis Szczerbinski 1521092
 *
 */
public class Konto {

	String inhaber;
	String waehrung;
	ArrayList<Double> guthaben = new ArrayList<Double>();

	/**
	 * @author Dennis Szczerbinski 1521092
	 * @param inhaber
	 *            Inhaber des Kontos
	 * @param waehrung
	 *            Waehrung des Kontos
	 */
	public Konto(String inhaber, String waehrung) {
		this.inhaber = inhaber;
		this.waehrung = waehrung;
	}

	
	/**
	 * @author Dennis Szczerbinski 1521092
	 * @return Gibt den Inhaber des Kontos zurueck
	 */
	public String getInhaber() {
		return inhaber;
	}

	/**
	 * @author Dennis Szczerbinski 1521092
	 * @return Gibt die Waehrung des Kontos zurueck
	 */
	public String getWaehrung() {
		return waehrung;
	}

	/**
	 * @author Dennis Szczerbinski 1521092
	 * @param a
	 *            uebergibt einen double-Wert der auf der ArrayList hinzugefuegt
	 *            wird
	 */
	public void buche(double a) {
		guthaben.add(a);
	}

	/**
	 * @author Dennis Szczerbinski 1521092
	 * @return Gibt alle vorhanden Werte der ArrayList als String wieder
	 */
	public void saldo() {
		for (double i : guthaben) {
			System.out.println(i);
		}

	}

	/**
	 * @author Dennis Szczerbinski 1521092
	 * @return Gibt die Summe der gesamten Buchungen zurück
	 */
	public double gesamt() {
		double summe = 0.0;
		for (double i : guthaben) {
			summe += i;
		}
		return summe;
	}

	/**
	 * @author Dennis Szczerbinski 1521092 Gibt das gesamte Konto aus mit
	 *         Inhaber,Waehrung und Buchungen
	 */
	public String toString() {
		System.out.println("Kontoinhaber :" + inhaber);
		System.out.println("Waehrung :" + waehrung);
		System.out.println("-------------");
		saldo();
		System.out.println("-------------");
		System.out.println(gesamt());
		return null;

	}
}
