package KlassenTest;

import Klassen.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class Betragtest {

	/**
	 * Verschiede Tests auf die Funktion getVorzeichen()
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @return wird auf seine Funktion getestet bei der Übergabe eines
	 *         long-Wertes, erwartet wird 1 als Rückgabe
	 */
	@Test
	public void testGetVorzeichen0() {
		Betrag m = new Betrag(213314L, "Euro");
		assertEquals(1, m.getVorzeichen());
	}

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @return wird auf seine Funktion getestet bei der Übergabe eines
	 *         double-Wertes für den Betrag, erwartet 1 als Rückgabe
	 */
	@Test
	public void testGetVorzeichen1() {
		Betrag double1 = new Betrag(213.13667, "Euro");
		assertEquals(1, double1.getVorzeichen());
	}

	/**
	 * @author ${Patrick Hentschel 1524045}
	 * @return prüft Ausgabe mit 0 double-Parameter
	 */

	@Test
	public void testGetVorzeichen2() {
		Betrag nullBetrag = new Betrag(0.0, "Euro");
		assertEquals(0, nullBetrag.getVorzeichen());
	}

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @return prüft Ausgabe auf -1 mit double-Parameter
	 */
	@Test
	public void testGetVorzeichen3() {
		Betrag neg = new Betrag(-31214.34, "Euro");
		assertEquals(-1, neg.getVorzeichen());
	}

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @return prüft Ausgabe auf -1 mit long-Parameter
	 */
	@Test
	public void testGetVorzeichen4() {
		Betrag neglong = new Betrag(-1232141L, "Euro");
		assertEquals(-1, neglong.getVorzeichen());
	}

	// TESTS DER METHODE ADDIERE()

	/**
	 * @author ${Patrick Hentschel 1524045} Test der Methode addiere() bei
	 *         Betrag = 0
	 */
	@Test
	public void testAddiere0() {
		Betrag addition = new Betrag(0.0, "Euro");
		assertEquals(5L, addition.addiere(2L, 3L));
	}

	/**
	 * @author ${Patrick Hentschel 1524045} Test der Methode addiere() bei
	 *         bereits vorhandenem Betrag = 53
	 */
	@Test
	public void testAddiere1() {
		Betrag addition = new Betrag(53.0, "Euro");
		assertEquals(60L, addition.addiere(4L, 3L));
	}

	/**
	 * @author ${Patrick Hentschel 1524045} Test der Methode addiere() bei
	 *         negativ Addition
	 */
	@Test
	public void testAddiere2() {
		Betrag additionNeg = new Betrag(10.0, "Euro");
		assertEquals(0L, additionNeg.addiere(-5L, -5L));
	}

	/**
	 * @author ${Patrick Hentschel 1524045} Test der Methode addiere() bei 0
	 *         Addition
	 */

	@Test
	public void testAddiere3() {
		Betrag addition0 = new Betrag(0.0, "Euro");
		assertEquals(0L, addition0.addiere(0L, 0L));
	}

	/**
	 * @author ${Patrick Hentschel 1524045} Test der Methode addiere() mit
	 *         negativem Betrag
	 */

	@Test
	public void testAddiere4() {
		Betrag additionErgNeg = new Betrag(0.0, "Euro");
		assertEquals(-10L, additionErgNeg.addiere(-5L, -5L));
	}

	// TEST DER METHODE SUBTRAHIERE()

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045} Test der Methode subtrahiere() mit
	 *         einem negativem und einem positivem Wert
	 */
	@Test
	public void testSubtrahiere0() {
		Betrag sub = new Betrag(100.0, "Euro");
		assertEquals(2L, sub.subtrahiere(-96L, 2L));
	}

	/**
	 * @author ${Patrick Hentschel 1524045} Test der Methode subtrahiere() mit
	 *         nur 2 negativen Zahlen
	 */
	@Test
	public void testSubtrahiere1() {
		Betrag sub = new Betrag(5.0, "Euro");
		assertEquals(5L, sub.subtrahiere(-5L, -5L));
	}

	/**
	 * @author ${Patrick Hentschel 1524045} Test der Methode subtrahiere() mit 2
	 *         Zahlen mit Wert 0
	 */

	@Test
	public void testSubtrahiere2() {
		Betrag sub = new Betrag(2.0, "Euro");
		assertEquals(2L, sub.subtrahiere(0, 0));
	}

	/**
	 * @author ${Patrick Hentschel 1524045} Test der Methode subtrahiere() mit
	 *         negativem Ergebnis
	 */

	@Test
	public void testSubtrahiere3() {
		Betrag sub = new Betrag(1.0, "Euro");
		assertEquals(-9, sub.subtrahiere(-5L, 5L));
	}

	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @testSubtrahiere4() Belastungstest --> subtrahiere sollte nicht int als
	 *                     Rückgabe-Wert enthalten
	 */

	@Test
	public void testSubtrahiere4() {
		Betrag sub = new Betrag(0.0, "Euro");
		assertEquals(10000, sub.subtrahiere(90000000000000009L, 89999999999990009L));
	}
	/**
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * 
	 */
	
	//TEST DER METHODE multipliziereDouble()
	
	@Test
	public void testMultipliziereDouble0(){
		Betrag start = new Betrag(5.0, "Euro");
		Betrag a = new Betrag(0.0, "Euro");
		Betrag b = new Betrag(0.0, "Euro");
		assertEquals(0, start.multipliziereDouble(a, b), 0.01 );
	}
	
	//TODO Fehler
	@Test
	public void testMultipliziereDouble1(){
		Betrag m = new Betrag(1.0, "Euro");
		Betrag a = new Betrag(2.0, "Euro");
		Betrag b = new Betrag(0.5, "Euro");
		assertEquals(1.0, m.multipliziereDouble(a, b), 0.1);
	}
	
	
	// @Test
	// public void testMultipliziereDoubleDouble() {
	// fail("Not yet implemented");
	// }

	// @Test
	// public void testMultipliziereIntInt() {
	// fail("Not yet implemented");
	// }

}
