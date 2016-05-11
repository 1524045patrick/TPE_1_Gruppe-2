package mitgliederVerwaltungTests;

/**
 * @author Patrick Hentschel, 1524045
 */

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import mitgliederVerwaltung.InvalidSignException;
import mitgliederVerwaltung.Member;
import mitgliederVerwaltung.MembershipList;

public class ClubTests {

	@Test
	public void compareToUngleich() throws InvalidSignException {

		Member a = new Member(1, "test", "eins", 34);
		Member b = new Member(2, "Test", "zwei", 2);

		assertThat(Member.compareTo(a, b), is(false));
	}

	@Test
	public void compareToGleichheit() throws InvalidSignException {

		Member a = new Member(1, "test", "eins", 34);
		Member b = new Member(1, "test", "eins", 34);

		assertThat(Member.compareTo(a, b), is(true));
	}

	@Test(expected = InvalidSignException.class)
	public void compareToFalscherName() throws InvalidSignException {

		Member a = new Member(1, "te6st", "ein2s", 34);
		Member b = new Member(2, "test", "eins", 34);

		assertThat(Member.compareTo(a, b), is("Exception geworfen schon bei der Instanzierung  des Mitgleides"));
	}

	@Test
	public void putTestStandard() throws InvalidSignException {

		Member a = new Member(1, "Test", "Eins", 19);
		MembershipList t = new MembershipList();
		t.put(a);

		assertThat(t.containsKey(1), is(true));
	}

	@Test(expected = InvalidSignException.class)
	public void putTestFalscherVorname() throws InvalidSignException {

		Member b = new Member(1, "test", "ein2s", 34);
		MembershipList t = new MembershipList();
		t.put(b);

		assertThat(t.isEmpty(),
				is("add kann nicht funktionieren, da schon bei der Initialisierung eine Exception geworfen wird"));
	}

	@Test(expected = InvalidSignException.class)
	public void putTestFalscherNachname() throws InvalidSignException {
		Member a = new Member(1, "Te3st", "Test", 0);
		MembershipList t = new MembershipList();
		t.put(a);
		/**
		 * Die put Methode kann garnicht erst aufgerufen werden --> schon die
		 * Instanzierung des Members wirft eine Exception
		 */
	}

	@Test
	public void setterTestVorname() throws InvalidSignException {

		Member a = new Member(1, "Testy", "Test", 0);
		a.setVorname("Testyboy");
		assertThat(a.getVorname(), is("Testyboy"));
	}

	@Test(expected = InvalidSignException.class)
	public void setterTestFalscherVornameZahlen() throws InvalidSignException {

		Member a = new Member(1, "Testy", "Test", 0);
		a.setVorname("Te0st");
	}

	@Test(expected = InvalidSignException.class)
	public void setterTestFalscherVornameSonderzeichen() throws InvalidSignException {

		Member a = new Member(1, "Testy", "Test", 0);
		a.setVorname("Te!st");
	}

	@Test(expected = InvalidSignException.class)
	public void setterTestFalscherNachnameZahlen() throws InvalidSignException {

		Member a = new Member(1, "Testy", "Test", 0);
		a.setNachname("Te3sty");
	}

	@Test(expected = InvalidSignException.class)
	public void setterTestFalscherNachnameSonderzeichen() throws InvalidSignException {

		Member a = new Member(1, "Testy", "Test", 0);
		a.setNachname("Te#sty");
	}

	@Test
	public void setterTestNachName() throws InvalidSignException {

		Member a = new Member(9, "Test", "Testo", 9);
		a.setNachname("testooo");
		assertThat(a.getNachname(), is("testooo"));
	}

	@Test
	public void setterMitgliedsjahre() throws InvalidSignException {

		Member a = new Member(9, "Test", "testy", 0);
		a.setAnzahlDerMitgliedsjahre(20);

		assertThat(a.getAnzahlDerMitgliedsjahre(), is(20));
	}

	@Test(expected = InvalidSignException.class)
	public void setterMitgliedsjahreFehler() throws InvalidSignException {

		Member a = new Member(9, "Testy", "Test", 9);
		a.setAnzahlDerMitgliedsjahre(-9);

		assertThat(a.getAnzahlDerMitgliedsjahre(), is("Error"));
	}

	@Test
	public void setterMitgliedsjahreMitNull() throws InvalidSignException {

		Member a = new Member(8, "Testy", "Test", 8);
		a.setAnzahlDerMitgliedsjahre(0);

		assertThat(a.getAnzahlDerMitgliedsjahre(), is(0));
	}

	@Test(expected = InvalidSignException.class)
	public void MemberTestFehlerhafteMitgliedsID() throws InvalidSignException {

		Member a = new Member(-1, "Testy", "Test", 10);

		assertThat(a.getMitgliederid(), is("Error"));

	}

	@Test
	public void MemberTestNormal() throws InvalidSignException {
		
		Member a = new Member(2, "Testy", "Test", 7);
		
		assertThat(a.toString(), is("MitgliederID: 2 |Vorname: Test|--|Nachname: Testy| Mitglied seit: 7 Jahren|\n"));
	}
}
