package de.hs.mannheim.tpe.Klassen;

/**
 * 
 *${Patrick Hentschel 1524045}
 * @category Waehrungen enthält die Liste der verschiedenen Waehrungen und deren Wechselkurse
 * 
 */
public class Waehrungen {
	
	/**
	 * @author ${Patrick Hentschel 1524045}
	 * @return 
	 * 
	 */
	
	public Betrag wechselkurse(Betrag b){
		if(b.getWaehrung().equals(euro)){
			b.setWaehrung(dollar);
			b.setBetrag(b.getBetrag() *  kursEuro);
			return b;
		}else if(b.getWaehrung().equals(yen)){
			b.setWaehrung(dollar);
			b.setBetrag(b.getBetrag() * kursYen); 
			return b;
		}else if(b.getWaehrung().equals(rubel)){
			b.setWaehrung(dollar);
			b.setBetrag(b.getBetrag() * kursRubel);
			return b;
		}else if(b.getWaehrung().equals(schweizerFranken)){
			b.setWaehrung(dollar);
			b.setBetrag(b.getBetrag() * kursSchweizerFranken);
			return b;
		}else if(b.getWaehrung().equals(dollar)){
			return b;
		}else{
			System.out.println("Keine vorhandene Waehrung angegeben");
			System.out.println("Bitte korrigieren.");
		}
		return null;
		
	}
		
	//name
	String dollar = "Dollar";
	String euro = "Euro";
	String yen = "Yen";
	String rubel = "Rubel";
	String schweizerFranken = "Schweizer Franken";

	//kuerzel
	String $ = "$";
	String € = "€";
	String Y = "Y";
	String RUB = "RUB";
	String CHF = "CHF";

	//kurs

	double kursDollar = 1.0000;
	double kursEuro = 1.2690;
	double kursYen = 0.0091;
	double kursRubel = 0.0255;
	double kursSchweizerFranken = 1.0509;


	}


