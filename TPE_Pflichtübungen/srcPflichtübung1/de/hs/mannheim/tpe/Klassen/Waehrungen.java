package de.hs.mannheim.tpe.Klassen;

/**
 * 
 * ${Patrick Hentschel 1524045}
 * 
 * @category Waehrungen enthält die Liste der verschiedenen Waehrungen und deren
 *           Wechselkurse
 * 
 */
public class Waehrungen {

	/**
	 * @author ${Patrick Hentschel 1524045} die Variablen fuer den vollen Namen
	 *         der Waehrungen
	 */

	String dollar = "Dollar";
	String euro = "Euro";
	String yen = "Yen";
	String rubel = "Rubel";
	String schweizerFranken = "Schweizer Franken";

	/**
	 * @author ${Patrick Hentschel 1524045} die Variablen fuer die Kürzel der
	 *         Waehrungen
	 */
	String $ = "$";
	String € = "€";
	String Y = "Y";
	String RUB = "RUB";
	String CHF = "CHF";

	/**
	 * @author ${Patrick Hentschel 1524045} die Variablen fuer die jeweiligen
	 *         Wechselkurse
	 */

	public double kursDollar = 1.0000;
	public double kursEuro = 1.2690;
	public double kursYen = 0.0091;
	public double kursRubel = 0.0255;
	public double kursSchweizerFranken = 1.0509;

	

}
