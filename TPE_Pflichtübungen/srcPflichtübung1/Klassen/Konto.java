package Klassen;
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
	 * @param waehrung	Währung des Kontos
	 */
	Konto(String inhaber, String waehrung){
		this.inhaber = inhaber;
		this.waehrung = waehrung;
	}
	
	/**
	 * 
	 * @return	Gibt den Inhaber des Kontos zurück
	 */
	public String getInhaber(){
		return inhaber;
	}
	
	/**
	 * 
	 * @return	Gibt die Währung des Kontos zurück
	 */
	public String getWaehrung(){
		return waehrung;
	}
	
	/**
	 * 
	 * @param a	Übergibt einen double-Wert der auf der ArrayList hinzugefügt
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
	 * 		Gibt das gesamte Konto aus mit Inhaber,Währung und Buchungen
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

