package CrypterPackage;

import java.util.HashSet;
import java.util.Set;

public class CrypterSubstitution implements Crypter {
	
    /**
     * Konstruktor der Klasse
     */
    CrypterSubstitution() {
        super();
    }

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}
	@Override
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		// TODO Auto-generated method stub
		return 0;
	}

	//TODO sollte Override sein aber hat keinen sinn und char?
	public String verschluesseln(String key, String message) throws CrypterException {
		// TODO Auto-generated method stub
	       checkKey(key);
	        checkMessage(message);

	        char[] keyArray = key.toCharArray();
	        char[] messageArray = message.toCharArray();
	        char[] verschluesseltesArray = new char[message.length()];

	        for (int i = 0; i < verschluesseltesArray.length; i++) {
	            verschluesseltesArray[i] = keyArray[messageArray[i] - 'A'];
	        }

	        return new String(verschluesseltesArray);
	}

	
    /**
     * Methode, die eine Nachricht im Sinne des Substitutions-Schiffre entschlüsselt
     */
	//TODO sollte @Override sein 
    public String entschluesseln(String key, String cypherText) throws CrypterException {
        checkKey(key);
        checkMessage(cypherText);

        char[] cypherTextArray = cypherText.toCharArray();
        char[] entschluesseltesArray = new char[cypherText.length()];
        // indexOf --> String
        for (int i = 0; i < entschluesseltesArray.length; i++) {
            entschluesseltesArray[i] = (char) (key.indexOf(cypherTextArray[i]) + 'A');
        }

        return new String(entschluesseltesArray);
    }


    
    /**
     * Methode, die eine Nachricht auf ihre Gültigkeit im Sinne des Substitutions-Schiffre prüft
     * 
     * @param message
     *            Nachricht, die geprüft werden soll
     * @throws IllegalMessageException
     *             wird geworfen, wenn die Nachricht die Bedingungen nicht erfüllt
     */
    private void checkMessage(String message) throws CrypterException {

        if (message != null) {
            if (message.matches("[A-Z]+") == false) {
                throw new CrypterException("Keine gültige Nachricht! Nachricht darf nur Großbuchstaben enthalten!");
            }
        } else
            throw new CrypterException("Keine gültige Nachricht! Nachricht darf nicht null sein!");
    }
	
	
    /**
     * Methode, die einen key auf seine Gültigkeit im Sinne des Substitutions-Schiffre prüft
     * 
     * @param key
     *            String, der geprüft werden soll
     * @throws IllegalKeyException
     *             wird geworfen, wenn der key die Bedingungen nicht erfüllt
     */
    private void checkKey(String key) throws CrypterException {
        if (key != null) {
            if (key.length() != 26) {
                throw new CrypterException("Kein gültiger Schlüssel! Schlüssel muss 26 Zeichen haben!");
            } else if (hasUniqueCharacters(key) == false) {
                throw new CrypterException("Kein gültiger Schlüssel! Schlüssel darf jeden Buchstaben nur einmal enthalten!");
            } else if (key.matches("[A-Z]+") == false) {
                throw new CrypterException("Kein gültiger Schlüssel! Schlüssel darf nur Großbuchstaben enthalten!");
            }
        } else
            throw new CrypterException("Kein gültiger Schlüssel! Schlüssel darf nicht null sein!");
    }
    
    
    /**
     * Methode, die prüft, ob ein Buchstabe in einem Arary nur einmal vorkommt
     * 
     * @param string
     *            entspricht übergebenem key von checkKey()
     * @return gibt false zurück, wenn der Buchstabe schoneinmal hinzugefügt wurde, d.h. er doppelt vorhaben ist
     */
    public static boolean hasUniqueCharacters(final String string) {
        // Ein HashSet speicher jeden Character (Buchstabe) nur einmal
        Set<Character> set = new HashSet<>();

        for (char c : string.toCharArray()) {
            // Fügt den Character dem Set hinzu, wenn Buchstabe schon vorhanden ist, also schon einmal hinzugefügt wurde, wird false von der add Methode geliefert.
            if (set.add(c) == false) {
                return false;
            }
        }
        return true;
    }


}
