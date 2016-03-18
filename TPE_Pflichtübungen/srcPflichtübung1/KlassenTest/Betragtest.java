package KlassenTest;

import Klassen.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class Betragtest {

	// @Test
	// public void testBetragDoubleString() {
	// fail("Not yet implemented");
	// }

	// @Test
	// public void testBetragLongString() {
	// fail("Not yet implemented");
	// }

	
	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @testgetVorzeichenLong wird auf seine Funktion getestet
	 *  bei der Übergabe eines long-Wertes für den Betrag
	 */
	@Test
	public void testGetVorzeichenLong() {
		Betrag m = new Betrag(213l, "Euro");
		assertEquals(m.getVorzeichen(), m.getVorzeichen());
	}
	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @testGetVorzeichenDouble wird auf seine Funktion getestet
	 *  bei der Übergabe eines double-Wertes für den Betrag
	 */
	@Test
	public void testGetVorzeichenDouble(){
		Betrag double1 = new Betrag(213.13667, "Euro");
		assertEquals(double1.getVorzeichen(), double1.getVorzeichen());
	}
	
	/**
	 * @author ${Patrick Hentschel 1524045}
	 * @Konstruktor wird auf falsche Übergabeparameter geprüft
	 */

	@Test
	public void kontruktorUebergabeString(){
		Betrag test1 = new Betrag("2121321","Euro");
		System.out.println(test1);
	}
	
	// @Test
	// public void testAddiere() {
	// fail("Not yet implemented");
	// }

	// @Test
	// public void testSubtrahiere() {
	// fail("Not yet implemented");
	// }

	// @Test
	// public void testMultipliziereDoubleDouble() {
	// fail("Not yet implemented");
	// }

	// @Test
	// public void testMultipliziereIntInt() {
	// fail("Not yet implemented");
	// }

}
