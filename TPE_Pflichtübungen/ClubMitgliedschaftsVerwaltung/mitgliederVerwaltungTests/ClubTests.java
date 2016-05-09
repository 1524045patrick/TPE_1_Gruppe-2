package mitgliederVerwaltungTests;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import mitgliederVerwaltung.InvalidSignException;
import mitgliederVerwaltung.Member;
import mitgliederVerwaltung.MembershipList;

public class ClubTests {

	@Test
	public void compareToUngleich() throws InvalidSignException {
		Member a = new Member(1, "test", "eins", 34);
		Member b = new Member(2, "Test", "zwei", 2);

		assertThat(a.compareTo(a, b), is(false));
	}

	@Test
	public void compareToGleichheit() throws InvalidSignException {
		Member a = new Member(1, "test", "eins", 34);
		Member b = new Member(1, "test", "eins", 34);

		assertThat(a.compareTo(a, b), is(true));
	}

	@Test(expected = InvalidSignException.class)
	public void comparetoTestWrongName() throws InvalidSignException {
		@SuppressWarnings("unused")
		Member a = new Member(1, "te6st", "ein2s", 34);

	}

	@Test
	public void putTestStandard() throws InvalidSignException {
		Member a = new Member(1, "Test", "Eins", 19);
		MembershipList t = new MembershipList();
		t.put(a);
		assertThat(t.containsKey(1), is(true));
	}

	@Test(expected = InvalidSignException.class)
	public void putTestWrongName() throws InvalidSignException {
		Member b = new Member(1, "te6st", "ein2s", 34);
		MembershipList t = new MembershipList();
		t.put(b);
		assertThat(t.isEmpty(),
				is("add kann nicht funktionieren, da schon bei der Initialisierung eine Exception geworfen wird"));
	}

	
	
}
