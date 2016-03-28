package de.hs.mannheim.tpe.KlassenTest;

import static org.junit.Assert.*;

import org.junit.Test;

import de.hs.mannheim.tpe.Klassen.Konto;

public class KontoTest {
	
	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * Test der Methode Equals
	 */
	@Test	
	public void testKonto() {
		Konto test = new Konto("Test", "Euro");
		Konto test1 = new Konto("Test", "Euro");
		assertEquals(true, test.equals(test1));
	}

	/**
	 * @author Dennis Szczerbinski, 1521092
	 * 			Test auf Gleicheit des Kontoinhabers.
	 */
	@Test
	public void testGetInhaber() {
		Konto test = new Konto ("Test", "Euro");
		assertEquals("Test", "Test", test.getInhaber());
	}
	
	/**
	 * @author Dennis Szczerbinski, 1521092
	 * 			Test auf Gleichheit der Währung.
	 */			 
	@Test
	public void testGetWaehrung() {
		Konto test = new Konto("Test","Euro");
		assertEquals("Euro", test.getWaehrung());
	}

	/**
	 * @author Dennis Szczerbinski, 1521092
	 * 			Teste der Methode buche(), ob ein Wert angelegt wird.
	 * 			Wird mit der Methode gesamt() ausgegeben, da buche()
	 * 			void als Rückgabewert hat.
	 */
	@Test
	public void testBuche() {
		Konto test = new Konto("Test","Euro");
		test.buche(5.00);
		assertEquals(5.00, test.gesamt(), 0.001);
	}
	
	
	/**
	 * @author Dennis Szczerbinski, 1521092
	 * 			Indirekter Test der Methode saldo(), hierbei wird die 
	 * 			größer der ArrayList überprüft, da die Methode den  
	 * 			Inhalt auf der Konsole ausgibt. Ist die ArrayList leer,
	 * 			ist kein Element vorhanden und die Größe ist 0.
	 */
	@Test
	public void testSaldo() {
		Konto test = new Konto("Test","Euro");
		assertEquals(0, test.size());
	}
	
	@Test
	public void testSaldo2(){
		Konto test = new Konto("Test", "Test");
		test.buche(1);
		assertEquals(1, test.size());
	}
	
	public void testSaldo3(){
		Konto test = new Konto("Test", "Dollar");
		test.buche(10);
		test.gebuehr();
		assertEquals(2, test.size());
	}

	
	/**
	 * @author Dennis Szczerbinski, 1521092
	 * 			Test der gesamt() Methode. Diese Methode gibt die Summe
	 * 			der double-Werte in der ArrrayList wieder.
	 */
	@Test
	public void testGesamt() {
		Konto test = new Konto("Test Testington", "Dollar");
		test.buche(99.01);
		test.buche(0.89);
		assertEquals(99.9, test.gesamt(), 0);
	}
	@Test
	public void testGesamt2(){
		Konto test = new Konto("Test Testington", "Yen");
		test.buche(99.99);
		test.buche(-0.99);
		assertEquals(99.00, test.gesamt(), 0);
	}
	
	@Test
	public void testGesamt3(){
		Konto test = new Konto("Test Testington", "Rubel");
		test.buche(-100.50);
		test.buche(-1000);
		assertEquals(-1100.50, test.gesamt(), 0);
	}

	
	/**
	 * @author Dennis Szczerbinski, 1521092
	 * 			Test der toString() Methode. Bitte nachfragen warum !!!
	 */
	@Test
	public void testToString() {
		Konto test = new Konto("Test", "Euro");
		assertEquals("",test.toString());
	}

}
