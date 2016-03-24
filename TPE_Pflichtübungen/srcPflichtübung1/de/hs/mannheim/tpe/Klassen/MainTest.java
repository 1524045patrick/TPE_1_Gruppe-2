package de.hs.mannheim.tpe.Klassen;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Konto test = new Konto("Test","Euro");
		Betrag testBetrag= new Betrag(50.12, "Euro");
		Betrag addition = new Betrag(50.00, "Euro");
		Betrag multi = new Betrag(3.00, "Euro");
		
		System.out.println(testBetrag.getBetrag());
		testBetrag.addiere(addition);
		System.out.println(testBetrag.getBetrag());
		testBetrag.multipliziere(multi);
		System.out.println(testBetrag.getBetrag());
		testBetrag.subtrahiere(addition);
		System.out.println(testBetrag.getBetrag());
		System.out.println(testBetrag.getVorzeichen());
		System.out.println(testBetrag.getWaehrung());
	}

}
