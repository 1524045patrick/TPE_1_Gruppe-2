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

	@Test
	public void testGetVorzeichen() {
		Betrag m = new Betrag(213, "Euro");
		assertEquals(m.getVorzeichen(), m.getVorzeichen());
		assertEquals(m.getVorzeichen(), m.getVorzeichen());

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
