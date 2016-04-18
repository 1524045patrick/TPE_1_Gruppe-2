package CrypterPackageTests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import CrypterPackage.Crypter;
import CrypterPackage.CrypterCaesar;
import CrypterPackage.CrypterException;
import CrypterPackage.CrypterFactory;

public class CrypterCaesarTest {

	
	//TEST FUER UNGUELTIGE NACHRICHTEN
	
	@Test(expected = CrypterException.class) 
	public void checkMessageTestNull_CrypterException() throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("B");
		caesar.encrypt(null);
	}
	
	
	@Test(expected = CrypterException.class)
	public void checkMessageTestEmpty_CrypterException()  throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("B");
		caesar.encrypt("");
	}
	
	@Test(expected = CrypterException.class)
	public void checkMessageTestNumbers_CrypterException() throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("B");
		caesar.encrypt("abc7");
	}
		
	//ENCRYPT TEST
	
	@Test
	public void encryptTestStandard() throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("A");
		assertThat(caesar.encrypt("abcd"), is("BCDE"));
		
	}
	
	@Test
	public void encryptTestSameLetters() throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("A");
		assertThat(caesar.encrypt("BB"), is("CC"));
	}
	
	@Test
	public void encryptLowerCaseLetters() throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("A");
		assertThat(caesar.encrypt("abcdef"), is("BCDEFG"));
	}
	
	@Test
	public void encryptLowerAndUpperCaseLetters() throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("A");
		assertThat(caesar.encrypt("ABCdef"), is("BCDEFG"));
	}
	
	
	@Test(expected = CrypterException.class)
	public void encryptTestNumbers() throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("A");
		caesar.encrypt("77");
	}
	
	//TEST DECRYPT
	
	@Test(expected = CrypterException.class)
	public void decryptTestNumbers() throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("A");
		caesar.decrypt("77");
	}
	
	@Test(expected = CrypterException.class)
	public void decryptTestNumbersAndLetters() throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("A");
		caesar.decrypt("AB7");
	}
	
	@Test
	public void decryptTestStandard() throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("A");
		assertThat(caesar.decrypt("BCDEFG"), is("ABCDEF"));
	}
	
	@Test
	public void decryptTestLowerCase() throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("A");
		assertThat(caesar.decrypt("bcdefg"), is("ABCDEF"));
	}
	
	//PRUEFEN UNGUELTIGER KEY
	
	@Test(expected = CrypterException.class)
	public void keyTestMoreThanOneLetter() throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("AA");
		
	}
	
	@Test(expected = CrypterException.class)
	public void keyTestMoreThanOneLetter2() throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("AB");
	}
	
	@Test(expected = CrypterException.class)
	public void keyTestNumbers() throws CrypterException {
		CrypterCaesar caesar = CrypterFactory.createCAE("7");
	}
}
