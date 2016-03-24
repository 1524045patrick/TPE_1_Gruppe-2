package de.hs.mannheim.tpe.KlassenTest;

import static org.junit.Assert.*;

import org.junit.Test;

import de.hs.mannheim.tpe.Klassen.Konto;

public class KontoTest {

	@Test
	public void testKonto() {
		Konto test = new Konto("Test", "Euro");
		test.equals(test);
	}

	@Test
	public void testGetInhaber() {
		Konto test = new Konto ("Test", "Euro");
		assertEquals("Test", "Test", test.getInhaber());
	}

	@Test
	public void testGetWaehrung() {
		Konto test = new Konto("Test","Euro");
		assertEquals("Euro", "Euro", test.getWaehrung());
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
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
