package Klassen;
/**
 * 
 * 
 * @author Mandy Schmitt 1521592
 * @category Waehrung rechnet die Beträge um
 * 
 */

public final class Waehrung extends Waehrungen {

	public String name;
	public String kuerzel;
	public long kurs;
	public long zielWaehrung;
	public double betrag;
	public double anfangsWaehrung;
	
	public String getName(){
		return name;
		
	}
	public String getKuerzel(){
		return kuerzel;
		
	}
	
	public long getKurs(){
		return kurs;
		
	}
	public void umrechnen(double betrag, long zielWaehrung) {
		betrag = anfangsWaehrung * kursDollar;
		zielWaehrung = (long) (betrag * kurs);
		System.out.println(zielWaehrung);
		
		
	}
}
