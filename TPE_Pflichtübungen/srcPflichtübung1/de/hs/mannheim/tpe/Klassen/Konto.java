package de.hs.mannheim.tpe.Klassen;

import java.util.ArrayList;

/**
 * 
 * @author Dennis Szczerbinski 1521092
 *
 */
public class Konto {

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Konto)) {
			return false;
		}
		Konto other = (Konto) obj;
		if (guthaben == null) {
			if (other.guthaben != null) {
				return false;
			}
		} else if (!guthaben.equals(other.guthaben)) {
			return false;
		}
		if (inhaber == null) {
			if (other.inhaber != null) {
				return false;
			}
		} else if (!inhaber.equals(other.inhaber)) {
			return false;
		}
		if (waehrung == null) {
			if (other.waehrung != null) {
				return false;
			}
		} else if (!waehrung.equals(other.waehrung)) {
			return false;
		}
		return true;
	}

	
	private String inhaber;
	private String waehrung;	
	private ArrayList<Double> guthaben = new ArrayList<Double>();

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
	 * @param a uebergibt einen double-Wert der auf der ArrayList hinzugefuegt 
	 * 			wird
	 */
	public void buche(double a) {
		guthaben.add(a);
	}
	/**
	 * @author Dennis Szczerbinski, 1521092
	 * @return Gibt den abgebuchten Gebührenwert wieder. 
	 */
	public double gebuehr(){
		Betrag test = new Betrag(gesamt(), "");
		buche(-test.promille(2));
		return test.promille(2);
	}

	/**
	 * @author Dennis Szczerbinski 1521092
	 * @return Gibt alle vorhanden Werte der ArrayList in der Konsole aus.
	 */
	public void saldo() {
		if(guthaben.isEmpty()){
			System.out.println("Kein Umsatz");
			return;
		}
		for (double i : guthaben) {
			System.out.println(i+ " " +getWaehrung());
			
		}
	}

	/**
	 * @author Dennis Szczerbinski 1521092
	 * @return Gibt die Summe der gesamten Buchungen zurück.
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
	 *         Inhaber,Waehrung und Buchungen.
	 */
	public String toString() {
		System.out.println("Kontoinhaber :" + getInhaber());
		System.out.println("Waehrung :" + getWaehrung());
		System.out.println("-------------");
		saldo();
		System.out.println("-------------");
		System.out.println(gesamt());
		return "";

	}
	
	/**
	 * @author Dennis Szczerbinski, 1521092
	 * @return a Diese Methode wird zum Test der saldo()-Methode gebraucht.
	 */
	public int size(){
		int a=guthaben.size();
		return a;
	}
}
