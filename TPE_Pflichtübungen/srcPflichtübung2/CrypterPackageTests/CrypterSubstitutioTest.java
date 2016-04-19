package CrypterPackageTests;
/**
 * @author Patrick Hentschel, 1524045	
 */

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import CrypterPackage.CrypterException;
import CrypterPackage.CrypterFactory;
import CrypterPackage.CrypterSubstitution;

public class CrypterSubstitutioTest {

	// TEST FUER UNGUELTIGE NACHRICHTEN ENCRYPT

	@Test(expected = CrypterException.class)
	public void encryptTestEmptyMessage() throws CrypterException {
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		assertThat(sub.encrypt(""), is(""));
	}
	
	@Test(expected = CrypterException.class)
	public void encryptTestSpaces() throws CrypterException {
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		assertThat(sub.encrypt("   "), is("  "));
	}
	
	@Test(expected = CrypterException.class)	
	public void encryptTestNull() throws CrypterException {
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		assertThat(sub.encrypt(null), is(""));
	}
	
	@Test
	public void encryptTestLowerCaseLetters() throws CrypterException {
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		assertThat(sub.encrypt("Hallo"), is("HALLO"));
	}

	@Test(expected = CrypterException.class)
	public void encryptTestNumbers() throws CrypterException {
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		assertThat(sub.encrypt("HA77LLO"), is("HA77LLO"));
	}

	@Test
	public void encryptTestUpperCaseLowerCase() throws CrypterException {
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		assertThat(sub.encrypt("HaLlO"), is("HALLO"));
	}

	@Test
	public void encryptTestOnlyUpperCase() throws CrypterException {
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		assertThat(sub.encrypt("HALLO"), is("HALLO"));
	}
	
	//TEST FUER UNGUELTIGE NACHRICHTEN DECRYPT
	
	@Test
	public void decryptTestAllOkay() throws CrypterException{
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		assertThat(sub.decrypt("test"), is("TEST"));
	}
	
	@Test(expected = CrypterException.class)
	public void decryptTestNumbers() throws CrypterException {
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		assertThat(sub.decrypt("Tes7"), is("Tes7"));
	}
	
	@Test
	public void decryptTestEmptyMessage() throws CrypterException {
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		assertThat(sub.decrypt(""), is(""));
	}

	// TEST FUER UNGUELTIGE KEYS
	
	@Test(expected = CrypterException.class)
	public void keyNotEnoughLetters() throws CrypterException {
		@SuppressWarnings("unused")
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQRSTUVWXY");
	}

	@Test(expected = CrypterException.class)
	public void keyWithNumbers() throws CrypterException {
		@SuppressWarnings("unused")
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQ7STUVWXYZ");
	}

	@Test(expected = CrypterException.class)
	public void keyWithLowerCaseLetters() throws CrypterException {
		@SuppressWarnings("unused")
		CrypterSubstitution sub = CrypterFactory.createSUB("abcdefghijklmnopqrstuvwxyz");
	}

	@Test(expected = CrypterException.class)
	public void keyTooLong() throws CrypterException {
		@SuppressWarnings("unused")
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQRSTUVWXYÖÜÄZ");
	}


	@Test(expected = CrypterException.class)
	public void keySameLetters() throws CrypterException {
		@SuppressWarnings("unused")
		CrypterSubstitution sub = CrypterFactory.createSUB("ABCDEFGHIJKLMNOPQRSTUVWXAA");
	}
	
	@Test(expected = CrypterException.class)
	public void keyEmptyKey() throws CrypterException {
		@SuppressWarnings("unused")
		CrypterSubstitution sub = CrypterFactory.createSUB("");
	}
	
	@Test(expected = NullPointerException.class)
	public void keyNull() throws CrypterException {
		@SuppressWarnings("unused")
		CrypterSubstitution sub = CrypterFactory.createSUB(null);
	}
}
