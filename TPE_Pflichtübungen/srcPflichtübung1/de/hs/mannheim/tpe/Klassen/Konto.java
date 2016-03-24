package de.hs.mannheim.tpe.Klassen;
import java.util.ArrayList;
/**
 * 
 * @author Dennis Szczerbinski
 *
 */
public class Konto {

	String inhaber;
	String waehrung;
	ArrayList<Integer> guthaben = new ArrayList<Integer>();
	
	/**
	 * 
	 * @param inhaber	Inhaber des Kontos
	 * @param waehrung	Waehrung des Kontos
	 */
	public Konto(String inhaber, String waehrung){
		this.inhaber = inhaber;
		this.waehrung = waehrung;
	}
	
	//TODO Authoren
	/**
	 * @author 
	 * @return	Gibt den Inhaber des Kontos zurueck
	 */
	public String getInhaber(){
		return inhaber;
	}
	
	/**
	 * 
	 * @return	Gibt die Waehrung des Kontos zurueck
	 */
	public String getWaehrung(){
		return waehrung;
	}
	
	/**
	 * 
	 * @param a	uebergibt einen double-Wert der auf der ArrayList hinzugefuegt
	 * 			wird
	 */
	public void buche(double a){
		guthaben.add((int) a);
	}
	
	/**
	 * 
	 * @return	Gibt alle vorhanden Werte der ArrayList als String wieder
	 */
	public void saldo(){
		for(int i : guthaben){
			System.out.println(i);
		}
		
	}
	
	/**
	 * 
	 * @return	Gibt die Summe der gesamten Buchungen zurück
	 */
	public double gesamt(){
		double summe=0;
		for(int i: guthaben){
			summe += i;
		}
		return summe;
	}
		
	
	/**
	 * 		Gibt das gesamte Konto aus mit Inhaber,Waehrung und Buchungen
	 */
	public String toString(){
		System.out.println("Kontoinhaber :"+inhaber);
		System.out.println("Währung :"+waehrung);
		System.out.println("-------------");
		saldo();
		System.out.println("-------------");
		System.out.println(gesamt());
		return null;
		
		
	}
}

