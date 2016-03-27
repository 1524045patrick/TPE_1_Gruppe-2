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

	@Test
	public void testGetInhaber() {
		Konto test = new Konto ("Test", "Euro");
		assertEquals("Test", "Test", test.getInhaber());
	}

	@Test
	public void testGetWaehrung() {
		Konto test = new Konto("Test","Euro");
		assertEquals("Euro", test.getWaehrung());
	}


	@Test
	public void testBuche() {
		Konto test = new Konto("Test","Euro");
		test.buche(5.00);
		assertEquals(5.00, test.gesamt(), 0.001);
	}

	@Test
	public void testSaldo() {
		Konto test = new Konto("Test","Euro");
		test.buche(10.00);
		fail("Not yet implemented");
	}

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

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
